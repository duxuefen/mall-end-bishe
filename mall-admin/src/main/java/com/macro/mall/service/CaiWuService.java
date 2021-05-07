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

    Finance insert(Finance finance);

    int  updateFinance(String number,Finance finance);

    int  deleteFinance(Integer id);

    Finance searchFinanceByBianHao(String bianHao);

    List<Finance> getAll(String keyword, Integer pageSize, Integer pageNum);

}
