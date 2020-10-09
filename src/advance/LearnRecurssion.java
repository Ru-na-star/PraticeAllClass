package advance;

public class LearnRecurssion {
//recurssion : process in which a method call itself continusly
//must calls itself
    //must have a base case
    //must change its
// must change its state and move toward the base case

    public static int count=0;



    public static void  computer(){
        count++;
        if( count<10){
        System.out.println(" this is a computer");
        computer();
    }
    }

   public static void main(String[] args) {
       computer();
    }
}
// meed to discussion with team