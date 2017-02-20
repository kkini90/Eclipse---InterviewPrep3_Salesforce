package Salesforce;

public class StringIntDiff {
	
	private static int stringToInt(String str){
	    boolean flag = false;
	    int i=0;
	    int num = 0;
	    
	    if(str.charAt(0) == '-'){
	        flag = true;
	        i =1;
	    }
	    
	    while(i<str.length()){
	        num = num*10;
	        num = num + str.charAt(i++) -'0';
	    }
	    
	    if(flag){
	        num = -num;
	    }
	    
	    return num;
	}
	
	
	private static final int MAXDIGITS = 10;

	private static String intToString(int num){
	    char[] temp = new char[MAXDIGITS +1];
	    boolean flag = false;
	    int i = 0;
	    StringBuilder sb = new StringBuilder();
	    
	    if(num < 0){
	        flag = true;
	        num =-num;
	        
	    }
	    
	    while(num!=0){
	        temp[i++] = (char) ((num%10) + '0');
	        num/=10;
	    }
	    if(flag){
	        sb.append("-");
	    }
	    while(i>0){
	        sb.append(temp[--i]);
	    }
	    
	    return sb.toString();
	    	    
	}
	
	public static void main(String[] args) {
		String num1 ="1",num2="10";
		
	    int n1 = stringToInt(num1);
	    int n2 = stringToInt(num2);
	    
	    int diff = n1-n2;
	    	
	    String difference = intToString(diff);
	    System.out.println(difference);
	}

}
