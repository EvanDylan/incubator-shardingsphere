package org.apache.shardingsphere.samples.repository;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;
import org.apache.shardingsphere.samples.po.Order;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Select("SELECT * FROM t_order")
    List<Order> queryAll();

    /**
     * page
     */
    @Select("SELECT * FROM t_order ORDER BY order_id")
    Page<Order> query(@Param("pageNum")int pageNum, @Param("pageSize")int pageSize);

    /**
     * join
     */
    @ResultMap("orderDetail")
    @Select("SELECT " +
            "o.order_id as order_id, " +
            "o.user_id as user_id, " +
            "o.status as status, " +
            "i.order_item_id as i_order_item_id, " +
            "i.order_id as i_order_id, " +
            "i.user_id as i_user_id " +
            "FROM t_order o LEFT JOIN t_order_item i ON o.order_id = i.order_id " +
            "WHERE o.order_id = #{orderId}")
    Order queryByOrderId(Long orderId);

    @Select("SELECT * FROM t_order WHERE user_id = #{userId}")
    List<Order> queryByUserId(Long userId);

    @Select("SELECT * FROM t_order WHERE user_id < #{userId}")
    List<Order> queryWhereUserIdLessThan(Long userId);

    @Select("SELECT * FROM t_order WHERE user_id > #{userId}")
    List<Order> queryWhereUserIdMoreThan(Long userId);

    @Options(useGeneratedKeys = true, keyColumn = "order_id", keyProperty = "orderId")
    @Insert({"INSERT INTO t_order (user_id, status) VALUES (#{userId}, #{status})"})
    Long insert(Order order);

    /**
     * MAX
     */
    @Select("SELECT MAX(order_id) FROM t_order")
    Long queryMaxOrderId();

    /**
     * COUNT
     */
    @Select("SELECT COUNT(order_id) FROM t_order")
    Long queryCount();

    @Select("SELECT * FROM t_order WHERE order_id IN (SELECT order_id FROM t_order WHERE status = 'init')")
    List<Order> queryOrder(String status);
}
