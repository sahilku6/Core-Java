package stringObjectClasses;

public class MainApp {
	public static void main(String[] args) {
		StringLiterals str=new StringLiterals();
//		Question 1
		str.printString();

//		Question 2
		System.out.println(str.lengthOfStringWithoutLength("Sahil"));

//		Question 3
		System.out.println(str.ReverseAString("Sahil"));
		
//		Question 4
		System.out.println(str.StringIsPalindrome("12321"));
		
//		Question 5
		str.CountVowelsAndConsonants("This is not a normal code");
		
//		Question 6
		System.out.println(str.CountNumberOfCharacters("Kumar"));
		
//		Question 7
		System.out.println(str.CountNumberOfWords("Yes, it is ready to eat"));
		
//		Question 8
		str.ConvertStringToUppercaseAndLowercase("This is not a normal code");
		
//		Question 9
		str.CompareTwoStrings("Sahil", "Sahil");
		
//		Question 10
		str.RemoveSpacesFromString("This is not a normal code");
	}
}
