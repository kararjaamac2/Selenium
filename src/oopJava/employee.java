package oopJava;

public class employee {
    int id;
    String ename;
    String job;
    int sal;

    //method
    void display(){
        System.out.println(id);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);

    }

    public static void main(String[] args) {
        employee enp= new employee();
        enp.id= 123;
        enp.ename= "john";
        enp.job= "account";
        enp.sal= 2000;
        enp.display();
        employee emt2= new employee();
        // second object
        emt2.id= 102;
        emt2.ename= "karar";
        emt2.job= "supervisor";
        emt2.sal= 5000;
        emt2.display();


    }
}
