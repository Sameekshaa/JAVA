class A{
    public int qt;
    public String name;
}
public class ClassObj{
    public static void main(String[] args) {
        A samee;
        A don;
        samee = new A();
        don = new A();
        //A samee = new A();
        samee.qt = 5;
        samee.name = "Samee";
        don.qt = 10;
        don.name = "lol";
        System.out.println(samee.qt);
        System.out.println(samee.name);
        System.out.println(don.qt);
        System.out.println(don.name);
    }
}