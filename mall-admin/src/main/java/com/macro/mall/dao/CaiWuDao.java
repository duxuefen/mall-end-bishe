package com.macro.mall.dao;

import com.macro.mall.dto.Finance;
import com.macro.mall.model.FinanceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/3/29 17:25
 * @Version 1.0
 **/
@Repository
public interface CaiWuDao {



   int insert(Finance finance);

   int updateFinance(Finance finance);

   int  deleteFinance(@Param("id") Integer id);

   Finance searchFinanceByBianHao(String bianHao);

   List<Finance>  getAll(FinanceExample financeExample);
}
