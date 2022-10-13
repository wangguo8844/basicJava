package com.rrays.controller;

import com.alibaba.fastjson.JSONObject;
import com.rrays.bean.TblUserRecord;
import com.rrays.returnJson.Permission;
import com.rrays.returnJson.Permissions;
import com.rrays.returnJson.ReturnObject;
import com.rrays.returnJson.UserInfo;
import com.rrays.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(originPatterns = "*",methods = {},allowedHeaders = "*",allowCredentials = "true")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("auth/2step-code")
    public String test(){

        System.out.println("test");
        return "";
    }

    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        System.out.println("login");
//        TblUserRecord tblUserRecord = new LoginService();
        TblUserRecord tblUserRecord = loginService.login(username, password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
//        Object o = JSONObject.toJSON(tblUserRecord);

//        System.out.println(username+"--"+password);
        session.setAttribute("userRecord",tblUserRecord);
        ReturnObject returnObject = new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("user/info")
    public String getInfo(HttpSession session){
        TblUserRecord tblUserRecord = (TblUserRecord) session.getAttribute("userRecord");
        //获取模块信息
        String[] split = tblUserRecord.getTblRole().getRolePrivileges().split("-");
        //创建权限集合对象
        Permissions permissions = new Permissions();
        //向权限集合对象中添加具体的权限
        List<Permission> permissionList = new ArrayList<>();
        for (String s : split) {
            permissionList.add(new Permission(s));
        }
        //        System.out.println(session.getAttribute("userRecord"));
        permissions.setPermissions(permissionList);
        //设置返回值的result
        UserInfo userInfo = new UserInfo(tblUserRecord.getUserName(),permissions);
        return JSONObject.toJSONString(new ReturnObject(userInfo));

    }
    @RequestMapping("/auth/logout")
    public String logout(HttpSession session){
        System.out.println("logout");
        session.invalidate();
        return "";
    }
}
