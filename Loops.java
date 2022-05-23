package com.vstl.loops;

public class Loops {
	//using Each loop :
	public void findBelguamCollegeNamesUsingEachLoop()   {

	
   String strArray[] = {"Shivanand College", "KLE College", "Bk college", "St Jhons College","St Martas College"};

      int intCounter=0;
      
      for(String string : strArray)  {
    	  
    	  if(string.equals("KLE College"));
    	  System.out.println("Display KLE College ");
    	  break;
      }
   
	}
	//do while loop :
	public void findTrainningEmloyeeListUsingDoWhileLoop() {
		String strArray [] = {"Rohini","Sonali","Laxmi","sarika","Divya","Priya"};
		 int intCounter =0;
	do {
	 if(strArray[intCounter].equals("laxmi"))  {
	  System.out.println("Display Name Laxmi");
	   break;
	 }
	
		intCounter++;
	}
	   while (strArray.length>intCounter);
	}
	
}
     
