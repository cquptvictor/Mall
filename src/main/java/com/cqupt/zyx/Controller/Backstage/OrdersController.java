package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.domain.beanForBackstage.TimeRange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Controller
public class OrdersController {
    /**
     * 获取订单*/
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String getOrders(TimeRange timeRange){

    }
    /***
     *订单详情页
     */
    @RequestMapping(value = "/specificOrder", method = RequestMethod.GET)
    public String getSpecificOrder(int oid){
        return null;
    }
/**
 * 导出为Excel*/
    @RequestMapping(value = "/export", method = RequestMethod.POST)
    public String exportExcel(TimeRange timeRange){
        return null;
    }

}
