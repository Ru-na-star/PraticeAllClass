package secondclass;

public class Burger {
   double totalValue;
   char size;
   String NameOfBurger;
   String topping;
   int QtyOfBurger;
   boolean isBurgerAva;

  //defult constructor
  public Burger(){

  }
   //parameterized constroctor
    public Burger( String NameOfBurger){
      this.NameOfBurger=NameOfBurger;
        System.out.println(" Burger name is:"+   this.NameOfBurger );
    }

    public Burger( String NameOfBurger,int QtyOfBurger ){
        this.NameOfBurger=NameOfBurger;
        this.QtyOfBurger=QtyOfBurger;
        System.out.println(" Burger name is :"+NameOfBurger);
        System.out.println(" Burger name is :"+NameOfBurger+" Burger quality is :"+  this.QtyOfBurger);
}


    public Burger( String NameOfBurger,int QtyOfBurger,String topping ){
        this.NameOfBurger=NameOfBurger;
        this.QtyOfBurger=QtyOfBurger;
        this.topping=topping;
        System.out.println(" Burger name is :"+NameOfBurger);
        System.out.println(" Burger name is :"+NameOfBurger+" Burger quality is :"+  this.QtyOfBurger);
        System.out.println(" Burger name is :"+NameOfBurger+" Burger quality is :"+  this.QtyOfBurger+"" +
                "Burger Topping is : "+topping);

    }

    public Burger( String NameOfBurger,int QtyOfBurger,String topping ,char size) {
        this.NameOfBurger = NameOfBurger;
        this.QtyOfBurger = QtyOfBurger;
        this.topping = topping;
        this.size = size;
        System.out.println(" Burger name is :" + NameOfBurger);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping + " Burger size is :" + this.size);

    }

    public Burger( String NameOfBurger,int QtyOfBurger,String topping ,char size,double totalValue) {
        this.NameOfBurger = NameOfBurger;
        this.QtyOfBurger = QtyOfBurger;
        this.topping = topping;
        this.size = size;
        this.totalValue=totalValue;
        System.out.println(" Burger name is :" + NameOfBurger);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping + " Burger size is :" + this.size);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping + " Burger size is :" + this.size+" Burger Value is :"+totalValue );



    }

    public Burger( String NameOfBurger,int QtyOfBurger,String topping ,char size,double totalValue,boolean isBurgerAva ) {
        this.NameOfBurger = NameOfBurger;
        this.QtyOfBurger = QtyOfBurger;
        this.topping = topping;
        this.size = size;
        this.totalValue=totalValue;
        this.isBurgerAva=isBurgerAva;

        System.out.println(" Burger name is :" + NameOfBurger);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping + " Burger size is :" + this.size);
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping + " Burger size is :" + this.size+" Burger Value is :"+totalValue );
        System.out.println(" Burger name is :" + NameOfBurger + " Burger quality is :" + this.QtyOfBurger + "" +
                "Burger Topping is : " + topping + " Burger size is :" + this.size+" Burger Value is :" +
                ""+totalValue+" Is Burger avaliable "+isBurgerAva );

}

    public static void main(String[] args) {
        Burger Roba=new Burger("cheese burger");
        Burger runa=new Burger("beef burger",12);
        Burger ru=new Burger(" beef burger",12,"onion");
        Burger ab =new Burger(" chicken ",12,"onion",'l');
        Burger ac=new Burger(" ckoo",12," pickels",'l',30.40);
        Burger ad=new Burger("chicken",78,"latus",'l',20.50,true);
    }
}
