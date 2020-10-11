package oop.abstruction;

public class Test {
    public static void main(String[] args) {
        GeneralMotor gm = new GeneralMotor();
        gm.acceleration();
        gm.CarBreak();
        gm.CarEnginne();
        gm.CarWheel();
        gm.startCar();
        gm.steering();
        gm.stopCar();
        //gm.CarDoor();
        Car.carDoor(12);
        gm.navigation();
        gm.selfDriven();
        gm.acceleration();
        gm.emerganyBreak();
        gm.LargeDisplay();
        gm.display();
        gm.camera();
        Tesla runa = new Tesla();
        runa.LargeDisplay();
        runa.steering();
        Tesla runa1 = new Tesla();
        runa1.CarWheel();
        Autopilot boby = new Tesla();
        boby.Autopilot();

        ModernCar ala=new GeneralMotor() ;

         ((GeneralMotor) ala).stopCar()   ;


            }
        }


