package com.cqupt.zyx.Controller;

import com.cqupt.zyx.domain.beanForBackstage.Order;
import com.cqupt.zyx.domain.beanForBackstage.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class test {
    @RequestMapping("/11")
    @ResponseBody
    public Order index(){
        Order order = new Order();
        order.setId(1);
        Product product1 = new Product();
        product1.setCategory("类别");
        product1.setDescription("描述");
        product1.setPic("照片");
        product1.setTitle("名字");
        product1.setPid(1);
        product1.setWeight(100);
        Product product2 = new Product();
        product2.setCategory("类别");
        product2.setDescription("描述");
        product2.setPic("照片");
        product2.setTitle("名字");
        product2.setPid(1);
        product2.setWeight(100);
        List<Product> list = new ArrayList();
        list.add(product1);
        list.add(product2);
        order.setProducts(list);
        return order;
    }
}
