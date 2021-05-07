package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.Member;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public CommonResult<Member>  addOne(@Validated @RequestBody Member member){
         Member m1=memberService.addOne(member);
        if (m1 == null) {
            return CommonResult.failed();
        }
        return CommonResult.success(m1);
    }
    @ApiOperation(value = "根据编号进行修改")
    @RequestMapping(value = "/updateById/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateById(@PathVariable Integer id, @RequestBody Member member){
        int count=memberService.updateById(id, member);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "根据编号进行删除")
    @RequestMapping(value = "/deleteById/{id2}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteById(@PathVariable Integer id2){
        int count=memberService.deleteById(id2);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "根据phone进行搜索")
    @RequestMapping(value = "/searchByPhone", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Member> searchByPhone(String phone){
       Member member= memberService.searchByPhone(phone);
        return CommonResult.success(member);
    }

    @ApiOperation(value = "得到全部的")
    @RequestMapping(value = "/searchAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Member>> getAll(@RequestParam(value = "keyword", required = false) String keyword,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
       ArrayList<Member>members=(ArrayList<Member>) memberService.getAll(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(members));
    }

}
