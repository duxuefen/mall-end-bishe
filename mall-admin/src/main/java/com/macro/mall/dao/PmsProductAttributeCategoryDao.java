package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义商品属性分类Dao
 *   /5/24.
 */
@Repository
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
