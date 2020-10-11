package oop.inheritance;

public class Son extends Father {

    //variable
    String favoriteDish=" pizza" ;
    String favoritespot =" hideandsick" ;
    String fatherSocal=" 346873211" ;
    private String soaccountNum;



    public String getAccountNum() {
        return soaccountNum;
    }

    public void setAccountNum(String accountNum) {
        this.soaccountNum = accountNum;
    }
    Son(){

    }


    //constructor
    public Son( String favoriteDish){
        this.favoriteDish=favoriteDish;

        System.out.println("son hight is 5.6feet ");
    }
    public Son( String favoriteDish,String favoritespot){
        this.favoriteDish=favoriteDish;
        this.favoritespot=favoritespot;
        System.out.println("son favoriteDish is:"+favoriteDish+"son favoritespot is "+favoritespot);
    }

    //method
    public void Handsome(){
        System.out.println("son is Strong ");
    }
    public void nicehair(){
        System.out.println("son can playgame");


    }


    public void Smart(){
        System.out.println("son can playgame");


    }

public void iSmart(){
        System.out.println("son can playgame");


        }
}
