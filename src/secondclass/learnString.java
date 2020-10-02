package secondclass;

import java.sql.SQLOutput;

public class learnString {

    //String is a class
    //String is a datatype
    String name =" james";

    public static void main(String[] args) {
        String burgerName="burger";
        String burgerName2="burger";
        System.out.println( burgerName.charAt(3)    );
        System.out.println(burgerName.concat(burgerName));
        System.out.println(burgerName.substring(2));


       try{
           System.out.println(burgerName.charAt(45));;
       } catch( Exception e){
           //e.printStackTrace();
           System.out.println(" try to handle of thisway");

       }



    }
    }

