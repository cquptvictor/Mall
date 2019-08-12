package com.cqupt.zyx.Service.impl;

import com.cqupt.zyx.Dao.GoodsDao;
import com.cqupt.zyx.Service.GoodsService;
import com.cqupt.zyx.domain.beanForBackstage.Category;
import com.cqupt.zyx.domain.beanForBackstage.Product;
import com.cqupt.zyx.domain.beanForBackstage.SysProduct;
import com.cqupt.zyx.domain.beanForBackstage.SimpleProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;
    public List<SimpleProduct> getGoods(Category category){
        return goodsDao.getGoodsByPage(category);
    }

    public Product getSpecificGoods(String pid){
        return goodsDao.getSpecificGoods(pid);
    }
    public Boolean updateGoods(SysProduct product){
        return goodsDao.updateGoods(product);
    }
    public Boolean addGoods(SysProduct product){
        return goodsDao.addGoods(product);
    }
    public Boolean deleteGoods(String pid){
        return goodsDao.deleteGoods(pid);
    }
}