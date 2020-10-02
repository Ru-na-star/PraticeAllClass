package thirdclass;

public class LearnMethod {
 //Method is a block of code
 public static int Dosumition(){
     int num=40;
     int num2=40;
     int total=num+num2;
     System.out.println(" total is:"+total);
     return total;
 }

    public static int Dosum( int number1,int number2){
        int num1=number1;
        int num2=number2;
        int total=num1+num2;
        System.out.println(" total is:"+total);
        return total;
    }
    public static int DoMultiply( int number1,int number2){
        int num1=number1;
        int num2=number2;
        int total=num1*num2;
        System.out.println(" total is:"+total);
        return total;
    }
    public static void Studentinfo(){
     String name=" runa";
        String address=" queens";

        System.out.println(" my name is:"+ name+ " my address is:"+address);

    }

    public static void Studentinfo1(String name1,String address1){
        String name=" runa";
        String address=" queens";

        System.out.println(" my name is:"+ name+ " my address is:"+address);

    }


    public static  void display(){
     System.out.println(" hello world");
     System.out.println(" hello world");
     System.out.println(" hello world");
 }


    public static void main(String[] args) {
        display();
     LearnMethod.display();
        LearnMethod.Dosumition() ;
        LearnMethod.Dosum(50,70);
        LearnMethod.DoMultiply(30,40);
        LearnMethod.Studentinfo();
        LearnMethod.Studentinfo1("Runa","quens");
    }

}
