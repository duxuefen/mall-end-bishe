package com.macro.mall.service.impl;

import com.macro.mall.common.TImeChuLI;
import com.macro.mall.dao.CaiWuDao;
import com.macro.mall.dto.CaiWu;
import com.macro.mall.service.CaiWuService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    public void insert(CaiWu caiWu) {
        Date time = caiWu.getTime();
       String year =TImeChuLI.getYear(time);
       String month=TImeChuLI.getMonth(time);
       caiWu.setYue(month);
        caiWu.setNian(year);
        caiWuDao.insert(caiWu);
    }
}
