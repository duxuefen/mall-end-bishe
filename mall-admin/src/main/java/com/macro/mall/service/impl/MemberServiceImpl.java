package com.macro.mall.service.impl;

import com.macro.mall.dao.MemberMapper;
import com.macro.mall.dto.Member;
import com.macro.mall.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public void addOne(Member member) {
        memberMapper.addOne(member);
    }

    @Override
    public void updateByBianHao(Member member) {
        memberMapper.updateByBianHao(member);

    }

    @Override
    public void deleteByBianHao(String bianHao) {
        memberMapper.deleteByBianHao(bianHao);

    }

    @Override
    public Member searchByPhone(String phone) {
        return memberMapper.searchByPhone(phone);
    }

    @Override
    public List<Member> getAll() {
        return memberMapper.getAll();
    }
}
