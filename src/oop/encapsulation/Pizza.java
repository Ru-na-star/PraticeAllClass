package oop.encapsulation;
//encapsulation:data hiding
public class Pizza {
    public String pizzaName;
    private String toppingName;
    private int price;
    private char size;
    private  String typeOfpizza;
    private boolean isAvealive;
    //getter and setter

    //getter mathod

    public String getToppingName() {
        return toppingName;
    }


    //setter mathod


    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getTypeOfpizza() {
        return typeOfpizza;
    }

    public void setTypeOfpizza(String typeOfpizza) {
        this.typeOfpizza = typeOfpizza;
    }

    public boolean isAvealive() {
        return isAvealive;
    }

    public void setAvealive(boolean avealive) {
        isAvealive = avealive;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;





    }
}
