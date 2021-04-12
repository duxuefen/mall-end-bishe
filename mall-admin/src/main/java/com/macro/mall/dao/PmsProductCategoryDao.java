package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品分类自定义Dao
 *   /5/25.
 */
@Repository
public interface PmsProductCategoryDao {
    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
