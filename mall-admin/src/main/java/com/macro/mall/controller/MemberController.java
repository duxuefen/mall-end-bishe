package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.Member;
import com.macro.mall.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@Api(tags = "MemberController", description = "会员管理")
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberService memberService;
    @ApiOperation(value = "添加会员")
    @RequestMapping(value = "/addOne", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult  addOne(Member member){
         memberService.addOne(member);
         return CommonResult.success("添加成功");
    }
    @ApiOperation(value = "根据编号进行修改")
    @RequestMapping(value = "/updateByBianHao", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateByBianHao(Member member){
        memberService.updateByBianHao(member);
        return CommonResult.success("修改成功");
    }

    @ApiOperation(value = "根据编号进行删除")
    @RequestMapping(value = "/deleteByBianHao", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteByBianHao(String bianHao){
        memberService.deleteByBianHao(bianHao);
        return CommonResult.success("删除成功");
    }

    @ApiOperation(value = "根据phone进行搜索")
    @RequestMapping(value = "/searchByPhone", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Member> searchByPhone(String phone){
       Member member= memberService.searchByPhone(phone);
        return CommonResult.success(member);
    }

    @ApiOperation(value = "根据编号进行删除")
    @RequestMapping(value = "/searchByPhone", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<ArrayList<Member>> getAll(){
       ArrayList<Member>members=(ArrayList<Member>) memberService.getAll();
        return CommonResult.success(members);
    }

}
