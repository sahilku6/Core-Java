package opeators;

public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        int num = 20;

        String result = (num % 3 == 0 && num % 5 == 0) ? "Divisible by both": (num % 3 == 0) ? "Divisible by 3 only": (num % 5 == 0) ? "Divisible by 5 only": "Not Divisible";
        System.out.println(result);
    }
}
