package com.macro.mall.controller;


import com.macro.mall.dto.CaiWu;
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
    public void insert(CaiWu caiwu){
        caiWuService.insert(caiwu);
    }
}
