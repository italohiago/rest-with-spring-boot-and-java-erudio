package br.com.erudio.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {
	
	public double calculateRaizFromString(String numberStr) {
		try {
			if(isDoubleAndNotEmpty(numberStr)) {
				double number = Double.parseDouble(numberStr);
				return Math.sqrt(number);
			}
		}catch (Exception e) {
			throw new UnsupportedOperationException("Please set a numeric value");
		}
		
		return Double.NaN;
        
    }
	/*
	public double calculateSumFromString(String numberOneStr, String numberTwoStr) {
        return numberOne+numberTwo;
    }
	
	public double calculateSubFromString(String numberOneStr, String numberTwoStr) {
        return numberOne-numberTwo;
    }
	
	public double calculateDivFromString(String numberOneStr, String numberTwoStr) {
        return numberOne/numberTwo;
    }
	
	public double calculateMedFromString(String numberOneStr, String numberTwoStr) {
        return (numberOne+numberTwo)/2;
    } */
	
	public static boolean isDoubleAndNotEmpty(String numberStr) {
		try {
			Double.parseDouble(numberStr);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
