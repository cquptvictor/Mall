package com.cqupt.zyx.Service;

import com.cqupt.zyx.domain.beanForBackstage.Category;
import com.cqupt.zyx.domain.beanForBackstage.Product;
import com.cqupt.zyx.domain.beanForBackstage.SimpleProduct;

import java.util.List;

public interface GoodsService {
     List<SimpleProduct> getGoods(Category category);
     Product getSpecificGoods(String id);
     Boolean updateGoods(Product product);
     Boolean addGoods(Product product);
     Boolean deleteGoods(String pid);

    }
