package com.OnlineShopping.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineShopping.Service.UsersService;
import com.OnlineShopping.pojo.Users;

@Controller
@RequestMapping("/")
public class UsersController {

	@Resource(name="usersService")
	UsersService usersService;
	
	
	@RequestMapping("/selectAllUsers.do")
	@ResponseBody
	public List<Users> selectAllUsers(){
		
		List<Users> list = usersService.selectAll();
		return list;		
	}
	

	
	@RequestMapping("register.do")
	public ModelAndView insert(Users users){
		ModelAndView mv = new ModelAndView();
		try {
			String uname = new String(users.getUsername().getBytes("iso-8859-1"),"utf-8");
			String rname = new String(users.getRealname().getBytes("iso-8859-1"),"utf-8");
			String gender = new String(users.getGender().getBytes("iso-8859-1"),"utf-8");
			String address = new String(users.getAddress().getBytes("iso-8859-1"),"utf-8");
			users.setUsername(uname);
			users.setRealname(rname);
			users.setGender(gender);
			users.setAddress(address);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		usersService.insert(users);
		mv.setViewName("login");
		return mv;
		//return null;
		
	}
	
	
	@RequestMapping(value="test")
	public ModelAndView test(){
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
}
