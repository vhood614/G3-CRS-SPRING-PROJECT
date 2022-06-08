///**
// * 
// */
//package com.lt.rest;
//
//import java.util.List;
//
//import javax.ws.rs.core.MediaType;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.RequestEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lt.dao.AdminDao;
//import com.lt.dao.StudentDao;
//
///**
// * @author 91988
// *
// *         This is an PaymentController class which will run all the methods
// *         from the PaymentDao class.
// */
//
//@RestController
//@CrossOrigin
//public class PaymentController {
//	private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);
//	
//	@Autowired 
//	StudentDao studentDao;
//	
//	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/payment/pay")
//	public ResponseEntity payFees(@RequestParam("courseName") String courseName, @RequestParam("amount") String amount) {
//		logger.debug("Making Payment for CourseName: {}, and amount: {} ", courseName, amount);
//		String result = studentDao.payFee(courseName, amount);
//		
//		return new ResponseEntity(result, HttpStatus.OK);
//	}
//
//}
