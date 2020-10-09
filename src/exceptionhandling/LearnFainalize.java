package exceptionhandling;

public class LearnFainalize {
    //what is final and fainally,faijnalize
    final String name="runa";
//gerbage collection:finalize
    //Finalize is uesd to process just before objective  garbage collected

    int div;

    public  int dodivision( int num1,int num2) {
        try{


          this. div=num1/num2;
            System.out.println(" divission value is:"+div);

        }catch (Exception e){
            System.out.println(" this is arethmetich exception");
        }finally{
            System.out.println(" this is finally block");
        }
        return div;
    }

    public static void main(String[] args) {
        LearnFainalize lm= new LearnFainalize() ;
        LearnFainalize lm1= new LearnFainalize() ;
        LearnFainalize lm2= new LearnFainalize() ;
        lm.dodivision(39,9);

        //lm.name();

       lm1=null;
       lm2=null;
        System.gc();
    }


}
