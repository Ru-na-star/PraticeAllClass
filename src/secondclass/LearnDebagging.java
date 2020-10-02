package secondclass;


import java.util.Scanner;

public class LearnDebagging {

    public static void main(String[] args) {
        int num=20;
        int num1=30;
        int sum=num-num1;
        System.out.println(" Summision is :"+ sum);
       LearnDebagging.doPattern();

    }
public static void doPattern ( ){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int rowNumber = input.nextInt();

        for(int i = 1; i <= rowNumber;--i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }





}
