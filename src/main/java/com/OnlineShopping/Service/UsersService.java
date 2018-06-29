package com.OnlineShopping.Service;

import java.util.List;

import com.OnlineShopping.pojo.Users;

public interface UsersService {

	List<Users> selectAll();
	Users selectByPrimaryKey(int userid);
	int insert(Users users);
}
