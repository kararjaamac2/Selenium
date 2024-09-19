package methods.ConstructorDemo;

public class ConstructorDemo {
    int x, y;
    ConstructorDemo(){ // defualt constructor
        x=100;
        y=200;

    }
    ConstructorDemo(int a, int b){ // parameters constructor

        x=a;
        y=b;


    }
     void sum(){
         System.out.println(x+y);

    }

    public static void main(String[] args) {

        ConstructorDemo cd= new ConstructorDemo();
        cd.sum(); // defualt
        //parameters
        ConstructorDemo cm= new ConstructorDemo(10,50);
        cm.sum();


    }
}
