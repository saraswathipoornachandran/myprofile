package com.personl;

import com.personal.IProfile;
import com.personal.ProfileConstants;

public class DhivyaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"dhivya");	
		System.out.println(ProfileConstants.FIRST_NAME+"sami");	
		System.out.println("Age:20");	
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Her Hobby is Watching Videos");
		
	}
	
		
		
	}
