package Salesforce;

public class CountSeq {

	public static void main(String[] args) {
		String text =" He is goinf to come but is he staying all night is";
		
		String pattern = "is";
		
		char[] txt = text.toCharArray();
		char[] pttn = pattern.toCharArray();
		
		int n = text.length();
		int m = pattern.length();
		int count =0 ;
		
		for(int i =0;i<=n-m;i++){
			int j=0;
			while(j<m && txt[i+j] == pttn[j]){
				j++;
			}
			if(j==m){
				count++;
			}
		}
		
		System.out.println("Sequence count is : " + count );

	}

}
