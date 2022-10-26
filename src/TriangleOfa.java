package homeworkweek8;

import java.util.Scanner;

public class TriangleOfa {

    public static void method(int n) {

        for (int i = 1; i <=n; i++) { //for row
            for (int j = 1; j <=i; j++) { //for colum
                System.out.print('@');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt(); //to enter howmany number of row
        method(n);
    }

}
