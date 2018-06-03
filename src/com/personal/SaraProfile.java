package com.personal;

public class SaraProfile implements IProfile {

	@Override
	public void myBasicInfo() {
	System.out.println(ProfileConstants.FIRST_NAME+"sara");	
	System.out.println(ProfileConstants.FIRST_NAME+"chandran");	
	System.out.println("Age:20");	
	
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobby is Watching Videos");	
		
	}

}
