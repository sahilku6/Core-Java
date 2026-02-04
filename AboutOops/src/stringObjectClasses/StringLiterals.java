package stringObjectClasses;

public class StringLiterals {
	public void printString() {
		System.out.println("This is simple Printing for String");
	}
	
	public int lengthOfStringWithoutLength(String str) {
		char[] arr=str.toCharArray();
		int count=0;
		for(char ch:arr) {
			count++;
		}
		return count;
	}
	
	public String ReverseAString(String str) {
		char[] arr=str.toCharArray();
		String str1="";
		for(int i=arr.length-1;i>=0;i--) {
			str1+=arr[i];
		}
		return str1;
	}
	
	public boolean StringIsPalindrome(String str) {
		char[] strArr=str.toCharArray();
		int right=strArr.length-1;
		int left=0;
		
		while(left<right) {
			if(strArr[left]!=strArr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public void CountVowelsAndConsonants(String str) {
		int vCount=0;
		int cCount=0;
		char[] strArr=str.toCharArray();
		int right=strArr.length;
		int left=0;
		
		for(char ch:strArr) {
			if(ch=='a' ||ch=='e' || ch=='i' 
					|| ch=='o' ||ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' ||
					ch=='O' || ch=='U') {
				vCount++;
			}else {
				cCount++;
			}
		}
		System.out.println("Total Vowel Count : "+vCount+" And total Consonants is : "+cCount);
		
	}
	
	public int CountNumberOfCharacters(String str) {
		int num=0;
		char[] strArr=str.toCharArray();
		for(char ch:strArr) {
			num++;
		}
		return  num;
	}
	
	
	public int CountNumberOfWords(String str) {
		String[] strArr=str.split(" ");
		return strArr.length;
	}
	
	
	public void ConvertStringToUppercaseAndLowercase(String str){
		System.out.println("UpperCase is : "+str.toUpperCase());
		System.out.println("LowerCase is : "+str.toLowerCase());
	}
	
	
	public void CompareTwoStrings(String str1,String str2) {
		System.out.println("Using == operator : "+(str1==str2));
		System.out.println("Using equals operator : "+str1.equals(str2));
	}
	
	public void  RemoveSpacesFromString(String str) {
		System.out.println(str.replace(" ", ""));
	}
	
}
