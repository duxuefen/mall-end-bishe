package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 前台订单退货管理Service
 *   /10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
