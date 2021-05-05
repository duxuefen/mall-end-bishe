package com.macro.mall.service;

import com.macro.mall.dto.Finance;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/3/29 18:20
 * @Version 1.0
 **/
@Service
public interface CaiWuService {

    void insert(Finance finance);

    void deleteFinance(String number);

    void updateFinance(Finance finance);

    Finance searchFinanceByBianHao(String bianHao);

    List<Finance> getAll();

}
