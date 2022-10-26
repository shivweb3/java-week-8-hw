package homeworkweek8;

import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {

        int lastDigit = num % 10;
        int firstDigit = num;
        int sum = firstDigit + lastDigit;


        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
            sum = firstDigit + lastDigit;
        }
        System.out.println("first digit :" + firstDigit);
        System.out.println("last digit:" + lastDigit);
        System.out.println("sum =" + sum);
        return sum;
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = obj.nextInt();
        sumFirstAndLastDigit(num);
    }


}
