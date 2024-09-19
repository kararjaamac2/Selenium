package methods.ConstructorDemo;

public class constructorDemo1 {
    int x, y;
    constructorDemo1(){ // default constructor
        x=100;
        y= 200;
    }

    constructorDemo1(int a, int b){ // parameters constructor
        x=a;
        y=b;
    }

   void sum(){
       System.out.println(x+y);

    }

    public static void main(String[] args) {

        constructorDemo1 cd= new constructorDemo1();
        cd.sum();

    }
}
