package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * 自定义商品管理Dao
 *   /4/26.
 */
@Repository
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
