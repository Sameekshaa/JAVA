class Peter{
    String name;
    int age;
    double salary;
}
public class Person{
  public static void main(String[]args){
    Peter P = new Peter();
    P.name = "Peter";
    P.age = 20;
    P.salary = 15000;
    System.out.println("Name:" + P.name + "\n" + "Age:" + P.age + "\n" + "Salary:" + P.salary);
  }
}