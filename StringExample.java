package com.vstl.javatraining;

public class StringExample {
	
	// 1.ConCate Method :-
	public String getActorName(String strFirstname ,String strLastName)  {
		String strActorname=strFirstname.concat(strLastName);
 		return strActorname;
	}	
	
	// 2:Length :-
	public String getCompanyName (String strName)  {
		return strName ;
		
	}	
	//3.Split :- 
	public String verifyTechnologiesWordInCompanyName(String strName) {
		
		String strArray[] =strName.split(" ");
		String strReturnValue=" ";
		for (String string :strArray)  {
			if(string.equals("Technologies")) {
				 strReturnValue = string;
				 break;
			}
			
		}
		return strReturnValue;	
	}	
		//5 .Trim : Trim is used to remove the spaces.
		public String getCollegeName(String strName) {
			String strCollegeName = "   shivanand  College      ";
              System.out.println("College Name : "+strCollegeName);
		   
              String strCollegeNaming =strCollegeName.trim();
              System.out.println("Name is : "+strCollegeNaming);
               return strName;
		}       
              
         //6.SUBSTRING :Start to end.
		public String verifyCollegeNameInGetCollegeName(String strCollegeName) {
			String strWord ="KLE College";
			if(strCollegeName.equals("College")) {
				
			}
			String getWord ="College";
			 return strCollegeName;
		}
      //7.SUBSTRING :-Start to end-Returns a substring from start from end index,start index is included and end is excluded
		public String getAnDistName(String strName) {
			 String strDistName = "Belgaum";
			 if(strDistName.equals("Belgaum"))  {
				 
			 }
			String strBelgaumInDistName ="Belgaum";
			return strName;
		}	
         //8.Replace :-     
		public String getSmartPhoneName(String strName) {
			String strSmartPhoneName ="Samsung";
			 
			System.out.println("Samart Phone Name is: "+strSmartPhoneName);
			return strName;
		}
		
		 //9.StartWith :
		//10.EndWith :
		public String collegeName(String strName) {
			 String strCollegeName ="Shivanand";
			 System.out.println("College Name is :"+strCollegeName);
			 return strName;
		}
		//11.CharAt :-Return Character of a index position in this case.
		public String schoolName(String strName) {
			String strschoolName ="Swami vivekanand";
			
			System.out.println("Bank Name is : "+strschoolName);
			return strName;
			
		}
		
		//12.IndexOf :Start to end -start 1st letter :
		//13.Indexof:(String ,interger):
		//14.LastIndexOf :It start from the end.
		
		public String verifyTrainnerName(String strName) {
			String strTrainnerName ="Sudha";
			
			System.out.println("The trainner name is : "+strTrainnerName);
			  return strName;
			  
		}
			
			//15.Equals :Return true if string is equals.
		   //16.EqualsIgnoreCase:It ignore the lower and upper cases.
		
		public String verifyGetHospName(String strName) {
			
			String strHospNameInbelguam ="Kims Hosp";
		 System.out.println("Hosp Name is : "+strHospNameInbelguam);

			return strName;
		}

		//Escape sequence :\n(New line), \t(tab),\'(single quote),\\(back slash).
		 
		public String verifyGetCollegeName(String strName) {
			
			String strCollegeName ="KLE College";
			String strTeacherName="Asha";
			String strCollegeNameWithTeacherName="strCollegeName".concat(strTeacherName);
			
			return strName;
			
		}

			 
}		

		
    
	  
		  
		  
	  
	  
			
	

