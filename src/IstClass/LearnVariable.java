package IstClass;

public class LearnVariable {
    //variable is a container
    //variable name must be meaningn ful
//variable folow the camelcase

//data type variable name =variable value
    //global variable
int a=20;

int b=30;
//declear variable
    int age;
    int year;
    //initialize variable
    int yeara=20;
    int yearb=30;
    int n=50;//hard code
    int d=n;//daynimic value when depend on another variable
//non static global variable
    int abc=50;
//static global variable
    static int ab=50;
    static int cb=50;

    /**
     * types of variable
     * global variable/instance variable
     * globla variablle call by claass name from any calss
     * local variable call by obj namne
     * any variaable inside in mathod its called local variable
     */


    public static void main(String[] args) {
       LearnVariable lab=new LearnVariable();
int price=50;
        System.out.println(price);
        System.out.println(lab.abc);
        System.out.println(lab.a);

        Helloworld hm=new Helloworld();
        System.out.println(hm.nuber1);




    }


public void di8spaly(){
        int bfg=3;
    System.out.println(bfg);
}



}
