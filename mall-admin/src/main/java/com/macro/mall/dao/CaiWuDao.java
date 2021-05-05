package com.macro.mall.dao;

import com.macro.mall.dto.Finance;
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

   void deleteFinance(@Param("number") String number);

   void updateFinance(Finance finance);

   Finance searchFinanceByBianHao(String bianHao);

   List<Finance>  getAll();
}
