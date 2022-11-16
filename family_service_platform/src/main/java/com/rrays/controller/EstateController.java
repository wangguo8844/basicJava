package com.rrays.controller;

import com.alibaba.fastjson.JSONObject;
import com.rrays.bean.TblCompany;
import com.rrays.returnJson.ReturnObject;
import com.rrays.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin(originPatterns = "*",methods = {},allowedHeaders = "*",allowCredentials = "true")
public class EstateController {

    @Autowired
    private EstateService estateService;
    @RequestMapping("estate/selectCompany")
    public String selectCompany(){
        System.out.println("selectCompany");
        List<TblCompany> companies = estateService.selectCompany();
        return JSONObject.toJSONString(new ReturnObject(companies));
    }
}
