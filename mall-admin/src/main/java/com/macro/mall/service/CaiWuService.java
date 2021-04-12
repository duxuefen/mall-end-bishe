package com.macro.mall.service;

import com.macro.mall.dao.CaiWuDao;
import com.macro.mall.dto.CaiWu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/3/29 18:20
 * @Version 1.0
 **/
@Service
public interface CaiWuService {

    void insert(CaiWu caiWu);
}
