package oop.inheritance;

public class GrandFather {
    //variable
   String favoriteDish=" pizza" ;
    String favoritespot =" Kabadi" ;
    String fatherSocal=" pizza" ;
    private String accountNum;



    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    //constructor
    public GrandFather(){  }

   public GrandFather( String favoriteDish){
        this.favoriteDish=favoriteDish;

       System.out.println("GrandFather hight is 5.6feet ");
   }
    public GrandFather( String favoriteDish,String favoritespot){
        this.favoriteDish=favoriteDish;
        this.favoritespot=favoritespot;
        System.out.println("GrandFather favoriteDish is:"+favoriteDish+"GrandFather favoritespot is "+favoritespot);
    }

    //method
    public void Strong(){
        System.out.println("GrandFather is Strong ");
    }
    public void playgame() {
        System.out.println("GrandFather can playgame");
    }
        public void blueeyes() {
            System.out.println("GrandFather has blueeyes");
        }
            public void beard() {
            System.out.println("GrandFather has beard");

        }
    }


