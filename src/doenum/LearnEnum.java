package doenum;

public class LearnEnum {
  //enum declearation can be done inside a class or out side a class but not inside a method
    //enum vs class
    // an enum can just like a class have attribute and method
    //enum constain are public,static ,unchangeable,final can not be override
    //enum can not be use object or it can not extends other class
    //but it can implement interfaces
    //use enam when you have valu that you know yor are going to change
    //ex days ,color interfaces


    public enum level{
       High,Medium,LOw;
    }



    public static void main(String[] args) {
        System.out.println(Color.Green);
        Color color=Color.blue;
        System.out.println(color);
        System.out.println(level.High);
    }



}
