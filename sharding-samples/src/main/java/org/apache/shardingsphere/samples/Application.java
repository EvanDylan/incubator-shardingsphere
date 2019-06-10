package org.apache.shardingsphere.samples;

import org.apache.shardingsphere.opentracing.ShardingTracer;
import org.apache.shardingsphere.samples.po.Order;
import org.apache.shardingsphere.samples.po.OrderItem;
import org.apache.shardingsphere.samples.repository.CategoryMapper;
import org.apache.shardingsphere.samples.repository.OrderItemMapper;
import org.apache.shardingsphere.samples.repository.OrderMapper;
import org.apache.shardingsphere.samples.repository.UserMapper;
import org.apache.shardingsphere.samples.service.XATransactionService;
import org.apache.skywalking.apm.toolkit.opentracing.SkywalkingTracer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("org.apache.shardingsphere.samples.repository")
@RestController
public class Application {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private XATransactionService transactionService;

    public static void main(String[] args) {
        ShardingTracer.init(new SkywalkingTracer());
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/test")
    public void test() {
        transactionService.xaTransaction();
    }

    @GetMapping("/orders/{orderId}")
    public Order order(@PathVariable(name = "orderId") Long orderId) {
        return orderMapper.queryByOrderId(orderId);
    }

    @GetMapping("/orders")
    public List<Order> queryOrder(@RequestParam(name = "pageNum", required = false, defaultValue = "0")Integer pageNum,
                                  @RequestParam(name = "pageSize", required = false, defaultValue = "10")Integer pageSize) {
        return orderMapper.query(pageNum, pageSize);
    }

    @GetMapping("delete")
    public void delete() {
        categoryMapper.deleteById(14L);
    }

    @GetMapping("/orders/all")
    public List<Order> queryAll() {
        return orderMapper.queryOrder("init");
    }

    @GetMapping("/init")
    public String init() {
        // 模拟一百个用户
        for (int userId = 1; userId < 101; userId++) {
            userMapper.insertUser((long) userId, new Random().nextInt(100));
            // 每个用户下10单
            for (int orderCount = 1; orderCount < 11; orderCount++) {
                Order order = new Order(null, (long) userId, "init");
                orderMapper.insert(order);
                // 每单有10个子单
                for (int orderItemCount = 1; orderItemCount < 11; orderItemCount++) {
                    orderItemMapper.insert(new OrderItem(null, order.getOrderId(), (long) userId));
                }
            }
        }
        return "success";
    }
}
