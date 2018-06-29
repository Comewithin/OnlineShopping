package com.OnlineShopping.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.OnlineShopping.Service.UsersService;
import com.OnlineShopping.mapper.UsersMapper;
import com.OnlineShopping.pojo.Users;

@Service("usersService")
public class UsersServiceImpl implements UsersService{

	@Resource
	private UsersMapper user;
	@Override
	public List<Users> selectAll() {
		// TODO Auto-generated method stub
		return user.selectAll();
	}
	@Override
	public Users selectByPrimaryKey(int userid) {
		// TODO Auto-generated method stub
		return user.selectByPrimaryKey(userid);
	}
	@Override
	public int insert(Users users) {
		// TODO Auto-generated method stub
		return user.insert(users);
	}

}
