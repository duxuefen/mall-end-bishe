package com.macro.mall.controller;


import com.macro.mall.dto.Finance;
import com.macro.mall.service.impl.CaiWuServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "CaiWuController", description = "财务管理")
@Controller
@RequestMapping("/caiwu")
public class CaiWuController {



    @Autowired
    CaiWuServiceImpl caiWuService;

    @ApiOperation(value = "新增财务记录")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public void insert(Finance caiwu){
        caiWuService.insert(caiwu);
    }

    @ApiOperation(value = "删除财务记录")
    @RequestMapping(value = "/deleteFinance", method = RequestMethod.POST)
    @ResponseBody
    public void deleteFinance(String number){
        caiWuService.deleteFinance(number);
    }

    @ApiOperation(value = "修改财务记录")
    @RequestMapping(value = "/updateFinance", method = RequestMethod.POST)
    @ResponseBody
    public void updateFinance(Finance finance){
        caiWuService.updateFinance(finance);
    }

    @ApiOperation(value = "通过编号搜索")
    @RequestMapping(value = "/searchFinance", method = RequestMethod.POST)
    @ResponseBody
    public void searchFinance(String number){
        caiWuService.searchFinanceByBianHao(number);
    }

    @ApiOperation(value = "得到全部")
    @RequestMapping(value = "/getAllFinance", method = RequestMethod.POST)
    @ResponseBody
    public void updateFinance(){
        caiWuService.getAll();
    }


}
