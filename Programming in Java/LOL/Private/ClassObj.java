class A{
    private int qt;
    private String name; 
    public void setQt(int x){
        qt = x;
        }  
    public void setName(String x){
        name =x;
    }
        public void display(){
            System.out.println(qt + " " + name);
        }
}
public class ClassObj{
public static void main(String[]args) {
    A lol;
    lol = new A();
    lol.setQt(5);
    lol.setName("Hehe");
    lol.display();
    A don;
    don = new A();
    don.setQt(10);
    don.setName("Hey");
    don.display();
} 
}
