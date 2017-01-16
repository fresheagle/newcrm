package com.crm.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.service.UserService;

@Controller
public class FulinLoanController {

	private final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	/**
	 * 跳转福麟卡放款页面
	 * @return
	 */
	@RequestMapping(value = "loan/fulinLoan",method = RequestMethod.GET)
    public String fulinLoan() {
        return "loan/fulinLoan";
    }
}
