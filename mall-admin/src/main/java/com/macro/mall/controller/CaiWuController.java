package com.macro.mall.controller;


import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.Finance;
import com.macro.mall.dto.Member;
import com.macro.mall.service.impl.CaiWuServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "CaiWuController", description = "财务管理")
@Controller
@RequestMapping("/finance")
public class CaiWuController {



    @Autowired
    CaiWuServiceImpl caiWuService;

    @ApiOperation(value = "新增财务记录")
    @RequestMapping(value = "/addOne", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Finance> insert(@Validated @RequestBody Finance caiwu){

        Finance finance=caiWuService.insert(caiwu);
        if (finance == null) {
            return CommonResult.failed();
        }
        return CommonResult.success(finance);
    }

    @ApiOperation(value = "修改财务记录")
    @RequestMapping(value = "/updateFinance/{number}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateFinance(@PathVariable String number,@RequestBody Finance finance){
        int count=caiWuService.updateFinance(number,finance);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "删除财务记录")
    @RequestMapping(value = "/deleteFinance/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteFinance(@PathVariable Integer id){

       int count= caiWuService.deleteFinance(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }



    @ApiOperation(value = "通过编号搜索")
    @RequestMapping(value = "/searchFinance", method = RequestMethod.POST)
    @ResponseBody
    public void searchFinance(String number){
        caiWuService.searchFinanceByBianHao(number);
    }

    @ApiOperation(value = "得到全部")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Finance>> getAll(@RequestParam(value = "keyword", required = false) String keyword,
                                                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<Finance> all = caiWuService.getAll(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(all));
    }


}
