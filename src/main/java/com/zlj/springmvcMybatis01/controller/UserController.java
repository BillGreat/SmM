package com.zlj.springmvcMybatis01.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zlj.springmvcMybatis01.entity.UserVO;
import com.zlj.springmvcMybatis01.service.IUserService;

@Controller  
@RequestMapping("/user")  
public class UserController {
	@Resource  
    private IUserService userService;
	
	@RequestMapping("/showUser")  
    public UserVO toIndex(HttpServletRequest request,Model model){  
//        int userId = Integer.parseInt(request.getParameter("id"));
        String  userId = request.getParameter("id");
        UserVO userVO = new UserVO(); 
        userVO.setUserId(userId);
        UserVO user = this.userService.getUserById(userVO);
        model.addAttribute("user", user);  
        return user;  
    } 
}
