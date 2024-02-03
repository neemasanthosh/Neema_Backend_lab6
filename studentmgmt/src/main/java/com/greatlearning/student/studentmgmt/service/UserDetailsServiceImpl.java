package com.greatlearning.student.studentmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.student.studentmgmt.entity.User;
import com.greatlearning.student.studentmgmt.repository.UserRepository;
import com.greatlearning.student.studentmgmt.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		return new MyUserDetails(user);
	}

}
