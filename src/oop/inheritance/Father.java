package oop.inheritance;

public class Father extends GrandFather {
    //variable
    String favoriteDish=" salmon" ;
    String favoritespot =" football" ;
    String fatherSocal=" 4556677" ;
    private String FaaccountNum;
    private String accountNum;

    public String getAccountNum() {
        return FaaccountNum;
    }

    public void setAccountNum(String accountNum) {
        this.FaaccountNum = accountNum;
    }
    Father(){

    }


    //constructor
    public Father( String favoriteDish){
        this.favoriteDish=favoriteDish;

        System.out.println("Father hight is 5.6feet ");
    }
    public Father( String favoriteDish,String favoritespot){
        this.favoriteDish=favoriteDish;
        this.favoritespot=favoritespot;
        System.out.println("Father favoriteDish is:"+favoriteDish+"Father favoritespot is "+favoritespot);
    }

    //method
    public void Handsome(){
        System.out.println("Father is Strong ");
    }
    public void blueeyes(){
        System.out.println("Father can playgame");
    }





}
