package com.healthy.service;

import com.healthy.bean.Service;

public interface ServiceService {
	void saveService(Service service);
	void updateService(Service service);
	void deleteService(Service service);
	public Service getService(String id);
}
