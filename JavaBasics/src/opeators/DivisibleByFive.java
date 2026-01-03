package opeators;

public class DivisibleByFive {
	public static void main(String[] args) {
        int num = 26;
        String result = (num % 5 == 0)?(num + " is divisible by 5."):(num + " is not divisible by 5.");

        System.out.println(result);
    }
}
