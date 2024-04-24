package methods;

public class GeeringMain {
    public static void main(String[] args) {
        Greetings gr= new Greetings();
        gr.m1();
        String s=gr.m2();
        System.out.println(s);
        gr.m3("John");
        String v=gr.m4("jama");
        System.out.println(v);


    }
}
