package homeworkweek8;

import java.util.Scanner;

public class ReadingUserInputChallenge1 {
    public boolean method1() {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("enter number #" + count);
            //check if enter number is int or not
            boolean number = sc.hasNext();
            //if int then sum of value
            if (number) {
                int a = sc.nextInt();
                sum += a;
                count++;
            } else {
                System.out.println("invalid number");
            }

        }
        System.out.println("sum of all number=" + sum);
        sc.close();
        return false;
    }
    public static void main(String[] args) {
        ReadingUserInputChallenge1 obj1 = new ReadingUserInputChallenge1();
        obj1.method1();
    }



}
