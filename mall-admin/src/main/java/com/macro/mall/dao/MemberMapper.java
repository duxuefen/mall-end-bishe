package com.macro.mall.dao;

import com.macro.mall.dto.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMapper {
    void addOne(Member member);
    void updateByBianHao(Member member);
    void deleteByBianHao(@Param("bianHao") String bianHao); //删除某一条的记录
    Member searchByPhone(@Param("phone") String phone);
    List<Member> getAll();//查询全部的记录
}
