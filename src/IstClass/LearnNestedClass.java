package IstClass;
public  class LearnNestedClass{
int age=20;
int salary =40;

    public static void main(String[] args) {
        LearnNestedClass loo=new LearnNestedClass();
        System.out.println(loo.age);
        System.out.println(loo.salary);
        computer learn=new computer();
        System.out.println(learn.compName);
        System.out.println(learn.contactNum);
        System.out.println(LearnNestedClass.computer.contactNum);


    }

  public static class computer{
String compName=" hp";
  static String contactNum=" 3464547";
      public computer(){

      }

    }


        }





