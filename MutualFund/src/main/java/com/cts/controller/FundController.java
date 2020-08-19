package com.cts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cts.entity.MutualFund;
import com.cts.service.FundService;

import io.swagger.annotations.ApiOperation;

@RestController
//@RequestMapping("/fund")
public class FundController {
	@Autowired
	FundService fundService;
	
	Logger logger = LoggerFactory.getLogger(FundController.class);
	
	@ApiOperation(value = "Add a fund", consumes = "A new fund details", notes = "Hit this URL to insert a new fund details")
	@PostMapping("/add")
	public void addFund(@RequestBody MutualFund fund){
		fundService.addFund(fund);
	}
	
//	@ApiOperation(value="Get fund details by customerId", produces="fund details of the customer")
//	@GetMapping(value="/getFund/{userName}")
//	List<MutualFund> getFundByUserName(@PathVariable String userName){
//		return fundService.getFundDetailsByUserName(userName);
//	}
	
	@ApiOperation(value = "Get all funds", produces = "List of funds", notes = "Hit this URL to get all funds")
	@GetMapping("/getFund/{userName}")
	public MutualFund getFundByUserName(@PathVariable("userName") String userName ) {
		logger.debug("Request: {} ", userName);
		MutualFund list = (MutualFund) fundService.getFundDetailsByUserName(userName) ;
//		if (list.isEmpty()) {
//            throw new RuntimeException("Failed Execution !");
//        } else {
//            logger.info("Response: Successfully Executed");
//        }

        return list;
	}

}
