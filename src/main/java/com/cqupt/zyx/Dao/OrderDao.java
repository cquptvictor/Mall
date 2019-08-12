package com.cqupt.zyx.Dao;

import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.Range;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;

import java.util.List;

public interface OrderDao {
    List<SimpleOrder> getOrdersByPage(Range range);
    Order getSpecificOrder(int oid);


}
