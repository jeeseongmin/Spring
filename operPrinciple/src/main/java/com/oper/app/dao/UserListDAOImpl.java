package com.oper.app.dao;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.oper.app.service.UserListResponseDTO;

@Repository("userListDAO")
public class UserListDAOImpl implements UserListDAO{
	
	@Override
	public List<UserListResponseDTO> getUserListdao() {
		System.out.println("dao call");
		
		//리스트를 만든다.//
		List<UserListResponseDTO> userlist = new ArrayList<UserListResponseDTO>();
		
		//총 3명의 학생을 만든다.6,9,11//
		UserListResponseDTO list = new UserListResponseDTO();
		list.setUserName("홍길동");
		list.setUserAge("26");
		list.setUserAddress("경기도 수원시");
		list.setUserImage("6.jpg");
		
		userlist.add(list);
		
		UserListResponseDTO list2 = new UserListResponseDTO();
		list2.setUserName("임꺽정");
		list2.setUserAge("30");
		list2.setUserAddress("경기도 안양시");
		list2.setUserImage("9.jpg");
		
		userlist.add(list2);
		
		UserListResponseDTO list3 = new UserListResponseDTO();
		list2.setUserName("김철수");
		list2.setUserAge("28");
		list2.setUserAddress("경기도 오산시");
		list2.setUserImage("11.jpg");	
		
		userlist.add(list3);
		
		return userlist;
	}
}
