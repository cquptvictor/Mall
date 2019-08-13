package com.cqupt.zyx.Service;

import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;
import com.cqupt.zyx.domain.beanForBackstage.Range;

import java.util.List;

public interface OrderService {
    List<SimpleOrder> getOrders(Range timeRange);
    Order getSpecificOrder(int oid);
    Boolean exportExcel(Range timeRange);
    Boolean delivery(int pid);

}
