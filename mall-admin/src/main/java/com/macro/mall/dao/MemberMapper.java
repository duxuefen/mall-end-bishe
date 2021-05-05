package com.macro.mall.dao;

import com.macro.mall.dto.Member;
import com.macro.mall.model.MemberExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMapper {
    int addOne(Member member);
    void updateById(Member member);
    int deleteById(@Param("id") Integer id); //删除某一条的记录
    Member searchByPhone(@Param("phone") String phone);
    List<Member> getAll(MemberExample example);//查询全部的记录
}
