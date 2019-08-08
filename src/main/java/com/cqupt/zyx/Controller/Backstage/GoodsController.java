package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.domain.beanForBackstage.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class GoodsController {
    /**
     * 查询已上架商品*/

    @RequestMapping(value = "goods",method = RequestMethod.GET)
    @ResponseBody
    private String getGoods(@RequestParam("category") String category, @RequestParam("page") String page){
        return null;
    }
    /***
     * 进入商品的具体页面
     */

    @RequestMapping(value = "specificGoods",method = RequestMethod.GET)
    @ResponseBody
    private String getGoods(@RequestParam("id") String id){

        return  null;
    }
    @RequestMapping(value = "updateGoods",method = RequestMethod.POST)
    @ResponseBody
    private String getGoods(Product product){

        return null;
    }
    /**
     * 删除已经上架的商品*/

    @RequestMapping(value = "deleteGoods",method = RequestMethod.GET)
    @ResponseBody
    private String deleteGoods(String pid){
        return null;
    }
}
