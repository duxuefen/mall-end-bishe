package com.macro.mall.dao;

import com.macro.mall.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义会员价格Dao
 *   /4/26.
 */
@Repository
public interface PmsMemberPriceDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
