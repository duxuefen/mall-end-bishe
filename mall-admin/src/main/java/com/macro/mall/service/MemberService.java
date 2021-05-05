package com.macro.mall.service;

import com.macro.mall.dto.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
    Member addOne(Member member);
    int updateById(Integer id,Member member);
    int deleteById(Integer id); //删除某一条的记录
    Member searchByPhone(String phone);
    List<Member> getAll(String keyword, Integer pageSize, Integer pageNum);//查询全部的记录
}
