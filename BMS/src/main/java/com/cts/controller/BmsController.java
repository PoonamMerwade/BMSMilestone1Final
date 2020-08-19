package com.cts.controller;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.entity.BankAccount;
import com.cts.entity.Customer;
import com.cts.entity.MutualFund;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "The customer Bank Management", description = "Rest controller for BMS")
public class BmsController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	Logger logger = LoggerFactory.getLogger(BmsController.class);

	private JSONObject CustomerJsonObject;
//
	private HttpHeaders headers;
	
	@ApiOperation(value = "Get a customer", produces = "customer by username", notes = "Hit this URL to get customer by username")
	@GetMapping(value="/getCustomer/{userName}", produces="application/json")
	public String getCustomerByUserName(@PathVariable("userName") String userName){
		final String Url = "http://localhost:9191/customer/getCustomer/{userName}";
		RestTemplate restTemplate = new RestTemplate();
		String customer = restTemplate.getForObject(Url, String.class, userName);
		return customer;
	}
	
	@ApiOperation(value = "Get a account", produces = "account by username", notes = "Hit this URL to get account by username")
	@GetMapping("/getAccount/{userName}")
	public String getAccountByUserName(@PathVariable("userName") String userName){
		final String Url = "http://localhost:9191/account/getAccount/{userName}";
		RestTemplate restTemplate = new RestTemplate();
		String account = restTemplate.getForObject(Url, String.class, userName);
		return account;
	}
	
	@ApiOperation(value = "Get a fund", produces = "fund by username", notes = "Hit this URL to get fund by username")
	@GetMapping("/getFund/{userName}")
	public String getFundByUserName(@PathVariable("userName") String userName){
		final String Url = "http://localhost:9191/fund/getFund/{userName}";
		RestTemplate restTemplate = new RestTemplate();
		String fund = restTemplate.getForObject(Url, String.class, userName);
		return fund;
	}
	
//	@ApiOperation(value = "add the customer", consumes = "JSON details", notes = "Hit this url to post the details")
//	@PostMapping("/add")
//	public void addCustomer(@RequestBody Customer customer){
//		final String Url = "http://localhost:8081/add";
//		CustomerJsonObject = new JSONObject();
//		headers = new HttpHeaders();
//		HttpEntity<String> request = new HttpEntity<String>(CustomerJsonObject.toString(), headers);
//		RestTemplate restTemplate = new RestTemplate();
//		Customer customers= restTemplate.postForObject(Url, request, Customer.class);
//	}

}