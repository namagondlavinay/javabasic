package basics.corejava;

public class ConditionalStatements {

	public static void main(String[] args) {
		// if condition
		
		int i = 15 ;
		 if ( i>10) {
			 System.out.println("15 is greater than 10");
		 }
		 //System.out.println("out of block");
		 System.out.println("...............................");
		 int  j = 9;
		 if (j == 10) {
			 System.out.println("true");
		 }
		 System.out.println("fasle");
		 System.out.println("...............................");
		  boolean p = false ; 
		  if(!p) {
			  System.out.println("iam p");
		  }
		  System.out.println("...............................");
		  
		  // IF ELSE CONDITON
		  
		  boolean a = true; 
		  if(!a) {
			  System.out.println("true");
		  }else {
			  System.out.println("false");
		  }
		  System.out.println("...............................");
		  // NESTED IF CONDITION
		  
		  int k = 12; 
		  if(k == 12) {
			  //first if statement
			  if(k<15) {
				  System.out.println("k is smaller than 15");
				  // nested if statement will only be executed if statement above is true 
			  }
			  if (k<12) {
				  System.out.println("k is smaller than 14 too");
			  }else {
				  System.out.println("k is greater than 15");
			  }
		  }
		  System.out.println("...............................");
		  
		  // SWITCH STATEMENT
		  
		  int d = 1;
		  switch(d){
		  case 0:
			  System.out.println("d is 0");
			  break;
		  case 1:
			  System.out.println("d is 1");
			  break;
		  case 2:
			  System.out.println("d is 2");
			  break;
			  default:
				  System.out.println("d is greater than 15");
		  }
		  
		  
	}

}
