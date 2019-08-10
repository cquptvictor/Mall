package com.cqupt.zyx.Dao;

import com.cqupt.zyx.domain.beanForBackstage.Category;
import com.cqupt.zyx.domain.beanForBackstage.Product;
import com.cqupt.zyx.domain.beanForBackstage.SimpleProduct;

import java.util.List;

public interface GoodsDao {
    List<SimpleProduct> getGoodsByPage(Category category);
    Product getSpecificGoods(String id);
    Boolean updateGoods(Product product);
    Boolean addGoods(Product product);
    Boolean deleteGoods(String id);
}
