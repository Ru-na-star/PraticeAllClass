package IstClass;

public class Block {
    {// block start point
        System.out.println(" this is blcck");
    }// blopck end ppoint

   public  static void display (){
       System.out.println(" this is out side of block");

       {
           System.out.println(" this is inside aa block");
           System.out.println(" this is inside aa block");
       }


       }

    public static void main(String[] args) {
        System.out.println(" hello all ");
        Block.display ();
    }

   }

