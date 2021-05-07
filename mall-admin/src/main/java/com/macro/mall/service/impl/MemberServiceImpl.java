package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.MemberMapper;
import com.macro.mall.dto.Member;
import com.macro.mall.model.MemberExample;
import com.macro.mall.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public Member addOne(Member member) {
        memberMapper.addOne(member);

        return member;
    }

    @Override
    public int updateById(Integer id,Member member) {
        member.setId(id);
      int count = memberMapper.updateById(member);
        return count;

    }

    @Override
    public int deleteById(Integer id) {
        int count=memberMapper.deleteById(id);
        return count;

    }

    @Override
    public Member searchByPhone(String phone) {
        return memberMapper.searchByPhone(phone);
    }

    @Override
    public List<Member> getAll(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        MemberExample example=new MemberExample();
        MemberExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andUsernameLike("%" + keyword + "%");
        }
        return memberMapper.getAll(example);
    }
}
