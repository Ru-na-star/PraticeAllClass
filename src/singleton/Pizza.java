package singleton;

public class Pizza {

   String foodname=" piyara";
   String address=" bangladesh";
double num;

    //default constrouctor

 public Pizza(){

 }

    public static void main(String[] args) {
Pizza mypizza=new Pizza();
Pizza yourpizza=new Pizza();
        LernSingleton ln=LernSingleton.lofbb();
        System.out.println(ln.nmae);


    }


}
