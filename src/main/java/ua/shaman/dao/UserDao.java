package ua.shaman.dao;

import ua.shaman.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

