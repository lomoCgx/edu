package api.service;

import api.entity.DubboUser;

public interface UserService {

	DubboUser selectByPrimaryKey(Long id);
	
}
