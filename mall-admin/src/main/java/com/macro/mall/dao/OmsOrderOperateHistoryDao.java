package com.macro.mall.dao;

import com.macro.mall.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单操作记录自定义Dao
 *   /10/12.
 */
@Repository
public interface OmsOrderOperateHistoryDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
