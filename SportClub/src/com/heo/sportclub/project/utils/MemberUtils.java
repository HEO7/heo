package com.heo.sportclub.project.utils;

import com.heo.sportclub.project.models.Members;

public class MemberUtils {
	
	public static Members loginedMembers;
	

	public static String getValue(Object value) {
		if(value==null) 
			return "";
		else 
			return value.toString();
	}
}
