package thirdclass;

public class LearnConstrouctor {
    // constructor name shoud be same as a class name
    //Constructor is a iniitilaiize objec t
//default constructor
String Nmae=" james";
    int num;
    double num1;
public LearnConstrouctor(){
    System.out.println("hello ");


}
public LearnConstrouctor(int num,String Nmae){
this.num=num;
    System.out.println(this.num);
   this.Nmae=Nmae;
    System.out.println(" my code is:"+this.num+"my anothher code is : " +this.Nmae);
}

    public LearnConstrouctor(int num,String Nmae,  double num1){
        this.num=num;
        System.out.println(this.num);
        this.Nmae=Nmae;
        this.num1=num1;
        System.out.println(" my code is:"+this.num+"my anothher code is : " +this.Nmae+ " my anothe byte is"+" " +this.num1 );
    }



    public static void main(String[] args) {
        LearnConstrouctor abcd= new LearnConstrouctor();
       LearnConstrouctor ab=new LearnConstrouctor();
LearnConstrouctor abr=new LearnConstrouctor(12,"James" );
LearnConstrouctor alif=new LearnConstrouctor( 12,"James", 12.34);
    }



}
