package com.dsa.service.impl;

import org.springframework.stereotype.Service;

import com.dsa.service.DataStructureServiceA;

@Service
public class DataStructureServiceImplA implements DataStructureServiceA {

	@Override
	public String ping() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

}
