package exceptionhandling;

public class SalaryCalculator {
    static
    int div;

    public static int dodivision( int num1,int num2) throws Exception{
        try{


            int div=num1/num2;
            System.out.println(" divission value is:"+div);

        }catch (Exception e){
            System.out.println(" this is arethmetich exception");
        }
        return div;
    }

    public static void main(String[] args) throws Exception {
        SalaryCalculator boo=new SalaryCalculator();
//        try{
//            SalaryCalculator.dodivision(100,0);
//        }catch(Exception e){
//         //e.printStackTrace();
//            System.out.println(" this is a index boundery exception");
//        }


        SalaryCalculator.dodivision(29,0);



    }


    }


