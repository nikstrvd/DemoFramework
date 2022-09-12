package com.wellnessy.utils;

public final class DaynamicXpathUtils {

	private DaynamicXpathUtils() {}
	
	
	  public static String getXpath(String xpath, String value) { return
	  String.format(xpath, value);
	  
	  }
	  
	  public static String getXpath(String xpath, String value1, String value2) 
	  { 
		  return String.format(xpath, value1,value2);
	  
	  }
}
