package com.macro.mall.service;

import com.macro.mall.dto.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
    void addOne(Member member);
    void updateByBianHao(Member member);
    void deleteByBianHao(String bianHao); //删除某一条的记录
    Member searchByPhone(String phone);
    List<Member> getAll();//查询全部的记录
}
