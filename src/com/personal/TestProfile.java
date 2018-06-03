package com.personal;

import com.personl.DhivyaProfile;

public class TestProfile {
	
public static void printProfile(IProfile p) {
		p.myBasicInfo();
		p.myHobbies();
	}     
public static void main (String args[]) {
	
IProfile MyProfile=new DhivyaProfile();	
printProfile(MyProfile);	
	
	
}
}