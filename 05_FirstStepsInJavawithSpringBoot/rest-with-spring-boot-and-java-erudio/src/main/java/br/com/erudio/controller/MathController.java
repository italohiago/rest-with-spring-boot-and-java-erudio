package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
			if(!numberOne.isEmpty() && isDouble(numberOne) && !numberTwo.isEmpty() && isDouble(numberTwo)) {
				Double n1 = Double.parseDouble(numberOne);
				Double n2 = Double.parseDouble(numberTwo);
				return (n1 + n2);
			}else {
				throw new UnsupportedOperationException("Please set a numeric value");
			}
			
		}
	
	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public double mul(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
			if(!numberOne.isEmpty() && isDouble(numberOne) && !numberTwo.isEmpty() && isDouble(numberTwo)) {
				Double n1 = Double.parseDouble(numberOne);
				Double n2 = Double.parseDouble(numberTwo);
				return (n1 * n2);
			}else {
				throw new UnsupportedOperationException("Please set a numeric value");
			}
			
		}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public double div(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
			if(!numberOne.isEmpty() && isDouble(numberOne) && !numberTwo.isEmpty() && isDouble(numberTwo)) {
				Double n1 = Double.parseDouble(numberOne);
				Double n2 = Double.parseDouble(numberTwo);
				return (n1 / n2);
			}else {
				throw new UnsupportedOperationException("Please set a numeric value");
			}
			
		}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public double med(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
			if(!numberOne.isEmpty() && isDouble(numberOne) && !numberTwo.isEmpty() && isDouble(numberTwo)) {
				Double n1 = Double.parseDouble(numberOne);
				Double n2 = Double.parseDouble(numberTwo);
				return ((n1 + n2)/2);
			}else {
				throw new UnsupportedOperationException("Please set a numeric value");
			}
			
		}
	
	@RequestMapping(value = "/raiz/{numberOne}", method=RequestMethod.GET)
	public double raiz(
			@PathVariable(value = "numberOne") String numberOne
			) throws Exception{
			if(!numberOne.isEmpty() && isDouble(numberOne)) {
				Double n1 = Double.parseDouble(numberOne);
				return Math.sqrt(n1);
			}else {
				throw new UnsupportedOperationException("Please set a numeric value");
			}
			
		}
	
	public static boolean isDouble(String strNumber) {
		try {
			Double.parseDouble(strNumber);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
		
	}
	
