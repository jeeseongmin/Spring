package com.oper.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oper.app.dao.UserListDAOImpl;

@Service("userListService")
public class UserListServiceImpl implements UserListService {
	@Autowired
	UserListDAOImpl userListDAO;

	@Override
	public List<UserListResponseDTO> getUserListService() {
		System.out.println("service call");

		return userListDAO.getUserListdao();
	}
}
