package com.macro.mall.dao;

import com.macro.mall.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义商品满减Dao
 *   /4/26.
 */
@Repository
public interface PmsProductFullReductionDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
