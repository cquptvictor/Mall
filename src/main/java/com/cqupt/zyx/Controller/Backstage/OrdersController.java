package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.Service.OrderService;
import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.Range;
import com.cqupt.zyx.domain.beanForBackstage.SimpleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    OrderService orderService;
    /**
     * 获取订单*/
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    @ResponseBody
    public List<SimpleOrder> getOrders(Range range){
            return orderService.getOrders(range);
    }
    /***
     *订单详情页
     */
    @RequestMapping(value = "/specificOrder", method = RequestMethod.GET)
    @ResponseBody
    public Order getSpecificOrder(int oid){
        return orderService.getSpecificOrder(oid);
    }
    /**
    * 导出为Excel*/
    @RequestMapping(value = "/export", method = RequestMethod.POST)
    public String exportExcel(Range timeRange){
        return null;
    }

}
