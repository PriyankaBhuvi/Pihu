package com.vstl.javatraining;

public class TestStringExample {

	public static void main(String[] args) {

		StringExample objStringExample= new StringExample(); 
		
		String strActorname =objStringExample.getActorName("Deepika ","Padukone");
		 System.out.println("Actor Name : "+strActorname);
		 
		
		 String	getCompanyName  =objStringExample.getCompanyName("verve Square Technologies Pvt.Ltd");
		 System.out.println("Compamy Name : "+getCompanyName );
		 
		
		 String getCollegeName=objStringExample.getCollegeName("Shivanand College");
		 System.out.println("College Name : "+getCollegeName);
		 
	    String strCollegeName=objStringExample.getCollegeName("KLE College");
		 System.out.println("College Name : "+strCollegeName);
		 
		 String getAnDistName=objStringExample.getAnDistName("Belgaum");
		 System.out.println("Dist Name : "+getAnDistName);
		 
		 String getSmartPhoneName =objStringExample.getSmartPhoneName("sumsung");
		 System.out.println("SmartPhone Name : "+getSmartPhoneName);
		 
		 
		 String strschoolName=objStringExample.schoolName("Swami vivekanand");
		 System.out.println("school name : "+strschoolName);
		 
		 String strverifyTrainnerName=objStringExample.verifyTrainnerName("Sudha");
		 System.out.println("Trainner name : "+strverifyTrainnerName);
		 
		 String strverifyGetHospName=objStringExample.verifyGetHospName("KLE College");
		 System.out.println("Hospital name  : " +strverifyGetHospName);
		 
	}	 
		 

		 
		 
		 
	}
	

		 
		
		
		
	   			
	


