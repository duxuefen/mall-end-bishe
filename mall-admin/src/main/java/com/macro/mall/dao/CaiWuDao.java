package com.macro.mall.dao;

import com.macro.mall.dto.CaiWu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/3/29 17:25
 * @Version 1.0
 **/
@Repository
public interface CaiWuDao {



   int insert(CaiWu caiWu);
}
