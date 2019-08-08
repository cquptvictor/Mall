package com.cqupt.zyx.Controller.Backstage;

import com.cqupt.zyx.Service.ServiceForBackstage.SysUserService;
import com.cqupt.zyx.domain.beanForBackstage.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 后台的登录控制*/
@Controller
public class LoginController {
    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(SysUser sysUser){
        if(sysUserService.identify(sysUser)){
            return "{'static':1}";
        }else
            return "{'static':0}";
    }

}
