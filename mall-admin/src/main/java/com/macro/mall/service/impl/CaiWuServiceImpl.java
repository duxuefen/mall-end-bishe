package com.macro.mall.service.impl;


import com.macro.mall.common.DateUtil;
import com.macro.mall.dao.CaiWuDao;
import com.macro.mall.dto.Finance;
import com.macro.mall.service.CaiWuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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
    public void insert(Finance finance) {
        Date date=new Date();
        finance.setTime(date);
        finance.setYear(DateUtil.getYear());
        finance.setMonth(DateUtil.getMonth());
        caiWuDao.insert(finance);
    }

    @Override
    public void deleteFinance(String number) {

        caiWuDao.deleteFinance(number);
    }

    @Override
    public void updateFinance(Finance finance) {

        caiWuDao.updateFinance(finance);
    }

    @Override
    public Finance searchFinanceByBianHao(String bianHao) {
        return caiWuDao.searchFinanceByBianHao(bianHao);
    }

    @Override
    public List<Finance> getAll() {
        return caiWuDao.getAll();
    }
}
