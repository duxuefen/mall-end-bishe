package com.macro.mall.dao;

import com.macro.mall.model.PmsProductCategoryAttributeRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义商品分类和属性关系Dao
 *   /5/23.
 */
@Repository
public interface PmsProductCategoryAttributeRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
