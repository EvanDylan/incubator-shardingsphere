package org.apache.shardingsphere.samples.service;


import io.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.samples.po.Order;
import org.apache.shardingsphere.samples.repository.OrderMapper;
import org.apache.shardingsphere.samples.repository.UserMapper;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class XATransactionService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    @ShardingTransactionType(TransactionType.XA)
    @Transactional(rollbackFor = Exception.class)
    public void xaTransaction() {
        orderMapper.insert(new Order(null, 888L, "xa transaction test"));
        userMapper.insertUser(887, 20);
        throw new RuntimeException();
    }
}
