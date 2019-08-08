package com.cqupt.zyx.Controller.Backstage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class OrdersController {
    /**
     * 获取订单*/
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String getOrders(@RequestParam("page") int page, @RequestParam("startTime") Date startTime, @RequestParam("endTime")Date endTime){
        return null;
    }
    /***
     *订单详情页
     */
    @RequestMapping(value = "/specificOrder", method = RequestMethod.GET)
    public String getOrders(int oid){
        return null;
    }
/**
 * 导出为Excel*/
    @RequestMapping(value = "/export", method = RequestMethod.POST)
    public String exportExcel( @RequestParam("startTime") Date startTime, @RequestParam("endTime")Date endTime){
        return null;
    }

}
