package com.dsa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsa.constant.DsaAlgoConstants;
import com.dsa.dto.CommonResponse;
import com.dsa.service.DataStructureServiceA;


@RestController
@RequestMapping("/ds-a")
public class DataStructureControllerA {

	private static Logger logger = LoggerFactory.getLogger(DataStructureControllerA.class);
	
	@Autowired
	DataStructureServiceA dataStructureServiceA;
	
	@GetMapping("/v1/ping")
	public CommonResponse ping() throws Exception {
		logger.info("Entry in ping");
		
		CommonResponse commonResponse = new CommonResponse(HttpStatus.OK.value(), DsaAlgoConstants.SUCCESS, dataStructureServiceA.ping());
		
		logger.info("Entry in ping");
		return commonResponse;
	}
}
