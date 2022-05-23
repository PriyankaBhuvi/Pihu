package com.vstl.javatraining;

public class StringMutable {

		
		/*Buffer:- Java StringBuffer class is used to create mutable (modifiable) String objects. 
	The StringBuffer class in Java is the same as String class except it is mutable*/
				     //APPEND :
		public void getEMployeeNames() {
			
				String strArray[]= {"Rohini","Sonali","Laxmi","sarika","Divya","Priya"};
				
				StringBuffer strNames = new StringBuffer("Rohini");
				strNames.append(" Laxmi");
				strNames.append('S');
				
				System.out.println(strNames);
			}

			        //Delete :
			public void getActorName() {
				String strActrorName = "Deepika";
				
				StringBuffer strName = new StringBuffer("Deepika");
				strName.charAt(5);
				strName.delete(0, 5);
				System.out.println(strName);
			}
			
			       //INSERT INDEX TO SOME LETTERS
			public void getComapnyName() {
				String strComapnyName = "Infosys";
				
				StringBuffer strName = new StringBuffer("Infosys");
				strName.equals("Infosys");
				strName.insert(0,"info");
				System.out.println(strName);
			}
			
			
		/*Builder:-Java StringBuilder class is used to create mutable (modifiable) String. 
			The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.*/
			public void getTrainerName() {
				String strTrainerName = "sihi";
				
				StringBuilder strName = new StringBuilder("sihi");
				//strName.append(" Trainer");
				strName.replace(0, 3, "Tn");
				System.out.println(strName);
			}

		
		
		
	}


