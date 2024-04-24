package methods;

public class Greetings {
    // no params no return value
   void m1()// no return
    {
        System.out.println("hello...");

    }
    String m2(){
       // 2) no prams return value
        return("Hellow how are you");

    }
    // takes params no return type
   void m3(String name){
       System.out.println("hello " + name);


    }

    String m4(String name){ // 4) take params and return value
       return ("Hellow " + name);


    }

}
