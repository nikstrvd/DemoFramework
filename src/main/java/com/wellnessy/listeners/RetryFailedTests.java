package com.wellnessy.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.wellnessy.enums.ConfigProperties;
import com.wellnessy.utils.PropertyUtils;

public class RetryFailedTests implements IRetryAnalyzer{

	private int count = 0;
	private int retries = 1;

	@Override
	public boolean retry(ITestResult result) {
		
		boolean value = false;
		try {
			if(PropertyUtils.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes"))
			{
				value = count < retries;
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

}
