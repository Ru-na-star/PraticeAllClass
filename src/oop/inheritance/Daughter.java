package oop.inheritance;

public class Daughter extends Father {

    //variable
    String favoriteDish=" friedRich" ;
    String favoritespot =" Tennies" ;
    String fatherSocal=" 563346873211" ;
    private String DaaccountNum;



    public String getAccountNum() {
        return DaaccountNum;
    }

    public void setAccountNum(String accountNum) {
        this.DaaccountNum = accountNum;
    }
    Daughter(){

    }


    //constructor
    public  Daughter ( String favoriteDish){
        this.favoriteDish=favoriteDish;

        System.out.println("son hight is 5.6feet ");
    }
    public Daughter( String favoriteDish,String favoritespot){
        this.favoriteDish=favoriteDish;
        this.favoritespot=favoritespot;
        System.out.println("Daughter favoriteDish is:"+favoriteDish+"Daughter favoritespot is "+favoritespot);
    }

    //method
    public void hot(){
        System.out.println("Daughter is Strong ");
    }
    public void Strong(){
        System.out.println("Daughter can playgame");


    }


    public void Honset(){
        System.out.println("Daughter can playgame");


    }

    public void Beautiful(){
        System.out.println("Daughter can playgame");


    }


}
