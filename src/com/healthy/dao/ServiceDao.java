package com.healthy.dao;

import com.healthy.bean.Service;
import com.healthy.bean.User;

public interface ServiceDao {

	public void saveService(Service service);
	public void updateService(Service service);
	public void deleteService(Service service);
	public Service getService(String id);
}
