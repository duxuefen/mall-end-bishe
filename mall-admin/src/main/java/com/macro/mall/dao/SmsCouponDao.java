package com.macro.mall.dao;

import com.macro.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 自定义优惠券管理Dao
 *   /8/29.
 */
@Repository
public interface SmsCouponDao {
    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
