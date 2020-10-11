package oop.encapsulation;

public class TestPizza {
    public static void main(String[] args) {
        Pizza mypizza=new Pizza();
        System.out.println(mypizza.pizzaName=" dominosPizza");
        mypizza.setToppingName(" mashroom" );
        System.out.println(mypizza.getToppingName());
mypizza.setAvealive(true);
        System.out.println(mypizza.isAvealive());
        mypizza.setPrice(12);
        System.out.println(mypizza.getPrice());
        mypizza.setTypeOfpizza(" dominos");
        System.out.println(" My favorite pizza is:"+mypizza.getTypeOfpizza());

    }
}
