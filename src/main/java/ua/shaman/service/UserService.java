package ua.shaman.service;

import ua.shaman.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}