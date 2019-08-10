package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.Service.impl.GoodsServiceImpl;
import com.cqupt.zyx.Utils.FileUploadUtil;
import com.cqupt.zyx.domain.beanForBackstage.Category;
import com.cqupt.zyx.domain.beanForBackstage.Product;
import com.cqupt.zyx.domain.beanForBackstage.SimpleProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    GoodsServiceImpl goodsService;
    /**
     * 查询已上架商品*/

    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    @ResponseBody
    private List<SimpleProduct> getGoods(Category category){
        return goodsService.getGoods(category);
    }

    /***
     * 进入商品的具体页面
     */

    @RequestMapping(value = "/specificGoods",method = RequestMethod.GET)
    @ResponseBody
    private Product getGoods(@RequestParam("id") String id){
        return goodsService.getSpecificGoods(id);
    }
    @RequestMapping(value = "/updateGoods",method = RequestMethod.POST)
    @ResponseBody
    private String updateGoods(Product product){
         if(goodsService.updateGoods(product))
             return "{'static':1}";
         else
             return "{'static:'0}";
    }
    /**
     * 删除已经上架的商品*/

    @RequestMapping(value = "/deleteGoods",method = RequestMethod.GET)
    @ResponseBody
    private String deleteGoods(String pid){
        if(goodsService.deleteGoods(pid))
            return "{'static':1}";
        else
            return "{'static':0}";
    }
    /**
     * 添加新的商品*/
    @RequestMapping(value = "/addGoods",method = RequestMethod.POST)
    @ResponseBody
    private String addGoods(Product product){
        MultipartFile multipartFile = product.getFile();
        String picPath = FileUploadUtil.save(multipartFile,product.getTitle());
        if(picPath == null)
            return "false";
        product.setPic(picPath);
        if(goodsService.addGoods(product))
            return "{'static':1}";
        else
            return "{'static':0}";
    }
}
