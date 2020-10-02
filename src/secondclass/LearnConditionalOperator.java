package secondclass;

public class LearnConditionalOperator {
    //&& and operator both condition must be true
    // || or operator if one condition is true then block of code will execuite
    public static void main(String[] args) {
        int age=40;


        int num =30;
        if (age==39&& num==30 ){
            System.out.println(" age equal to 40 and age equal to 30");
        }
if( age <=39 && num>=30){
    System.out.println(" age is greater than equal to 40 and num is less than equal to 30");
}

if ( age ==50 || num ==40 ){
    System.out.println("age is equal to 50 or age is equal to 30 ");
}
    }


}
