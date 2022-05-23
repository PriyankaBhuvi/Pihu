package com.vstl.javatraining;

public class StringConcatenation {
	
	public void hospNameAndtotalNumOfHosp()  {
	
	String strGovHospName="KLE Hosp";
	  int intTotalNumOfGovHosp=40;
	String strPriHospName="Kims Hosp";
	 int intTotalNumOfPriHosp=70;
	  
	 System.out.println(strGovHospName+intTotalNumOfGovHosp+intTotalNumOfGovHosp+intTotalNumOfPriHosp);
	 System.out.println(strGovHospName+intTotalNumOfGovHosp+intTotalNumOfPriHosp);
	 System.out.println(intTotalNumOfGovHosp+intTotalNumOfPriHosp+strPriHospName);
	 System.out.println(intTotalNumOfGovHosp+intTotalNumOfPriHosp+strPriHospName);
	 
	

}
}