package com.myproject;

public class Examples {

	int test = 0;
	public static void main(String args[]){
	  Student s1 = new Student("test2", 11);//creating an object of Student  
	  System.out.println(s1.id);
	  System.out.println(s1.name);
	} 
	
	static public int multiply(int m1, int m2) {
		int m3 = m1*m2;
		return m3;
		
	}
	
	static void fibonnaci() {
		int n1=0, n2=1,n3,i,count=10 ;
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;++i){    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
			  
	}  
	
	static boolean primenumber(int k) {
		
		boolean answer = true;
		for(int l=2;l<k;l++) {
			if(k%l == 0){
				answer = false;
			}
		}
		return answer;
	}
	 
	static int factorialNumber(int factorial) {
		
		int ans = 1;
		for(int i=factorial;i>0;i--) {
			
			ans = ans*i;
			
			
		}
		
		return ans;
		
	}
	
}
		

	
	
	


