//Write a program to find first non repeated characters from String in Java	

import java.util.HashSet;		
public class NonRepeatChar {

	public static  char nonRepeated(String s) {
		char[] c = s.toCharArray();
		boolean found =false;
		char a='\0';
     for(int i=0; i<c.length-1; i++)
     {
    	 
    	for(int j=i+1; j <c.length-1 ;j++){
    		if(c[i]== c[j]){
    			found = true;
    			break;
    		}
    		else{
    			found = false;
    		}
    	}
    	if(!found){
    		a= c[i];
    		found=false;
    		break;
    	}
    	
     }
	return a;
		
	}
				
 public static void main(String[] args) {
	 String str = "chancdana";
	 System.out.println(nonRepeated(str));
 }
}
	
	
	
	
	
	
	

	