package com.macro.mall.dao;

import com.macro.mall.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义优惠券和商品关系关系Dao
 *   /8/28.
 */
@Repository
public interface SmsCouponProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list")List<SmsCouponProductRelation> productRelationList);
}
