package com.cqupt.zyx.Service.impl;

import com.cqupt.zyx.Dao.OrderDao;
import com.cqupt.zyx.Service.OrderService;
import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;
import com.cqupt.zyx.domain.beanForBackstage.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;
    @Override
    public List<SimpleOrder> getOrders(Range range) {
        return orderDao.getOrdersByPage(range);
    }

    @Override
    public Order getSpecificOrder(int oid) {
        return orderDao.getSpecificOrder(oid);
    }

    @Override
    public Boolean exportExcel(Range timeRange) {
        return null;
    }

    @Override
    public Boolean delivery(int oid) {
        return orderDao.delivery(oid);
    }
}
