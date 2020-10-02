package IstClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LearnScannar {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in) ;
        System.out.println(" Enter my firstNmae");
        String name= scan.nextLine();

        System.out.println(" Hello My name is:"+name);
        System.out.println("  Enter last name");
        String lname=scan.nextLine();
        System.out.println(" My last name is "+ lname);
        System.out.println("  Enter total salary ");
        double salary=scan.nextDouble();
        System.out.println(" Totla salary is :"+ salary);
        System.out.println(" Enter course fee");
        double cfee=scan.nextDouble();
        System.out.println("  couser fee is "+ cfee);
        System.out.println(" Enter discount percentage ");

        double discountcfee=scan.nextDouble();
        System.out.println( "discount after couse fee "+ cfee*(.1-discountcfee)/100);
        scan.close();
        scan.close();

    }
}
