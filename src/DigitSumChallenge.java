package homeworkweek8;
// Digit Sum Challenge
public class DigitSumChallenge {    

    public static void main(String[] args){
        DigitSumChallenge obj = new DigitSumChallenge();
        obj.sumDigits(109);
    }
    public static int sumDigits(int number) {
        int sum = 0;
        int reminder;
        if (number >=10) {
            while (number > 0) {
                reminder = number % 10;
                sum = sum + reminder;
                number = number / 10;
            }
            System.out.println("sum of the digit :" + sum);
        }else{
            sum = -1;
            System.out.println("invalid value: " + sum);

        }
        return sum;
    }


}


