package oop.abstruction;

public interface Car   {
    //interface: guideline for future use
    //interface is 100% abstruct method

//variable
    String name=" acura";
    int quantity=200;
    String seat=" 2";
    String headLinght="4";
    boolean gasTrunk=true;
    //method able to declear method without body
    public void startCar();

    public void stopCar();

    public void CarWheel();
    public void CarEnginne();
    public void CarBreak();
    public void steering();
    public void acceleration();

    //in interface we can only public and static

    public static int carDoor( int num){
       int num1=60;
       return num1;
    }

}
