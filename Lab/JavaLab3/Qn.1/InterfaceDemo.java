//Multiple Inheritance (Using Class and Interface)
interface College{
    String Cname = "NCIT";
    String phone = "9860099933";
    void showDetail();
}
class Student{
    String name,faculty;
    Student (String n ,String f){
        name = n;
        faculty = f;
    }
}
class NCITStudent extends Student implements College{
        NCITStudent (String n, String f){
            super (n,f);
        }
public void showDetail(){
    System.out.println("Name :" + name);
    System.out.println("Faculty :" + faculty);
    System.out.println("CName :" + Cname);
    System.out.println("Phone :" + phone);
}
}
public class InterfaceDemo{
    public static void main(String[]args){
        NCITStudent obj = new NCITStudent("Sameeksha","BEIT");
        obj.showDetail();
    }
}
