package com.cqupt.zyx.Service;

import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;
import com.cqupt.zyx.domain.beanForBackstage.TimeRange;

import java.util.List;

public interface OrderService {
    List<SimpleOrder> getOrders(TimeRange timeRange);
    Order getSpecificOrder(int oid);
    Boolean exportExcel(TimeRange timeRange);

}
