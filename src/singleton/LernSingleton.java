package singleton;

public class LernSingleton {
    String nmae="gh";

    // singleton class: we are allowed to create one instance of a class at  time
    //using private constrouctor we are ensure than no more object can be created at a time

  private LernSingleton (){

  }

 public static   LernSingleton loo=new LernSingleton();
public static LernSingleton lofbb( ){
    return loo;
}
    public static void main(String[] args) {
        LernSingleton ls=new LernSingleton();

    }

}

