package com.macro.mall.service.impl;


import com.github.pagehelper.PageHelper;
import com.macro.mall.common.DateUtil;
import com.macro.mall.common.TimeUtils;
import com.macro.mall.dao.CaiWuDao;
import com.macro.mall.dto.Finance;
import com.macro.mall.model.FinanceExample;
import com.macro.mall.service.CaiWuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/3/29 18:22
 * @Version 1.0
 **/

@Service
public class CaiWuServiceImpl implements CaiWuService {
    
    @Autowired
    CaiWuDao caiWuDao;
    
    
    @Override
    public Finance insert(Finance finance) {
        Date date=new Date();
        String stringDate = DateUtil.format(date, TimeUtils.DATE_MONTH_FORMAT);
        String uuid = UUID.randomUUID().toString();
        String subUUID=uuid.substring(0,5);
        String number=stringDate+subUUID;
        finance.setNumber(number);
        finance.setTime(date);
        finance.setYear(DateUtil.getYear());
        finance.setMonth(DateUtil.getMonth());
        caiWuDao.insert(finance);
        return finance;
    }

    @Override
    public int updateFinance(String number,Finance finance) {
        finance.setNumber(number);
        int  count=caiWuDao.updateFinance(finance);
        return count;

    }

    @Override
    public int deleteFinance(Integer id) {
        int count=caiWuDao.deleteFinance(id);
        return count;
    }



    @Override
    public Finance searchFinanceByBianHao(String bianHao) {
        return caiWuDao.searchFinanceByBianHao(bianHao);
    }

    @Override
    public List<Finance> getAll(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        FinanceExample financeExample=new FinanceExample();
        FinanceExample.Criteria criteria=financeExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andUsernameLike("%" + keyword + "%");
        }
        return caiWuDao.getAll(financeExample);
    }
}
