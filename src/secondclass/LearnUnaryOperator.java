package secondclass;

public class LearnUnaryOperator {
    //increment operator:++[alwaye add1
    //++pre increment operator
    //post increment operator++
    //decrement opertaor:--[decrease -1
    //--pre increment operator
    //post decrement operator--
    public static void main(String[] args) {
    int number =40;
        System.out.println(++number);//alwqys add one

        System.out.println(number++);// numnber+1 [this 1 is for future use
        System.out.println(number);
number++;
number++;
++number;
        System.out.println(number);
        --number;
        --number;
        --number;
        number--;
        number--;
        ++number;
        number++;
        System.out.println(number);
        for(int i=0;i<3;i++ ){
            System.out.println("hello");
        }


    }
}
