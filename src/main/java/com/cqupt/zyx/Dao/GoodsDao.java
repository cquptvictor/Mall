package com.cqupt.zyx.Dao;

import com.cqupt.zyx.domain.beanForBackstage.*;

import java.util.List;

public interface GoodsDao {
    List<SimpleProduct> getGoodsByPage(Category category);
    Product getSpecificGoods(String pid);
    Boolean updateGoods(SysProduct product);
    Boolean addGoods(SysProduct product);
    Boolean deleteGoods(String id);
    Boolean setInventory(Inventory inventory);
}
