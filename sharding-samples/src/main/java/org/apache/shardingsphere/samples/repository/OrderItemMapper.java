package org.apache.shardingsphere.samples.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.shardingsphere.samples.po.OrderItem;

import java.util.List;

@Mapper
public interface OrderItemMapper {

    @Select("SELECT * FROM t_order_item")
    List<OrderItem> queryAll();

    @Select("SELECT * FROM t_order_item WHERE order_item_id = #{orderItemId}")
    OrderItem queryByOrderItemId(Integer orderItemId);

    @Select("SELECT * FROM t_order_item WHERE order_id = #{orderId}")
    List<OrderItem> queryByOrderId(Integer orderId);

    @Options(useGeneratedKeys = true, keyColumn = "order_item_id")
    @Insert({"INSERT INTO t_order_item (order_id, user_id) VALUES (#{orderId}, #{userId})"})
    Long insert(OrderItem orderItem);
}
