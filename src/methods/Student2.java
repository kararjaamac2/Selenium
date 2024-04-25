package methods;

public class Student2 {
    int sid;
    String sname;
    char grade;
    void  printStudentData(){
        System.out.println("sid + \"sname \" + sname + \"grade + \" +grade = " + sid + "sname " + sname + "grade + " +grade);
    }
    /*void setStudentData( int id, String name, char gr){
        sid= id;
        sname= name;
        gr= grade;


    } */
    Student2(int id, String name, char gr){

        sid= id;
        sname=name;
        gr= grade;

    }

}
