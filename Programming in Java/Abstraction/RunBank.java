public class RunBank{
  public static void main( String[] args){
    //abstract class ko object hudaina.
    Bank b = new EverestBank();
    System.out.println("Name = " + b.getName());
    System.out.println("Rate = " + b.getRate());
    b.moneyEx();
  }
}
