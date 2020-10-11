package oop.abstruction;

public  abstract class ModernCar {
//abstract class is not fully abstct
    //variable
    String ModernCarBrand=" tesla";
    double ModernCarSuggestedPrice=6500;
    //method
    public abstract void navigation();
    public abstract void autoLeanControl();
    public abstract void autoGear  ();
    public abstract void selfDriven();
    public abstract void camera();
    public abstract void display();
    public abstract void emerganyBreak();
 //static and non static method are allowed in here
public void dualClaimetControl(){
    System.out.println(" Modern Car Has dula climeat control feathre");
}

}
