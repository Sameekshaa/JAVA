/*Create a class Person with String name, int age.
-Provide a constructor to initialize the variables.
-Create a class Student which is a subclass of Person.
-Add a field String faculty.
-Provide constructor to initialize the varibles.
-Provide a method void showDetail() to display student detail.
-Create a class Teacher which is a subclass of Person.
-Add a field double salary.
-Provide constructor and a method void showDetail().
-Provide a test class.*/
class Person{
    String name;
    int age;
    Person(String n, int a){
        name = n;
        age = a;
    }
}
class Student extends Person{
    String faculty;
    Student(String n, int a,String f){
        super (n,a);
        faculty =f;
    }   
public void showDetail(){
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Faculty : " + faculty);
}
}
class Teacher extends Person{
        double salary;
        Teacher(String n, int a,double s){
            super (n,a);
            salary = s;
        }
public void showDetail(){
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Salary : " + salary);
}
}
public class PersonDemo{
    public static void main(String[]args){
        System.out.println("Information of Student:");
        Student s = new Student("Sameeksha Khadka",19,"BEIT");
        s.showDetail();
        System.out.println("Information of Teacher:");
        Teacher t = new Teacher("Nabin Bhusal",45,50000.0);
        t.showDetail();
        
    }
}