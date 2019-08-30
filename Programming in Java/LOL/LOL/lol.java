class A{
    private int qt;         //data member 1
    private String name;    //data member 2
    //Class vitra rakhna parxa ni hawa method and data lai
    public void setQt(int x){ //method 1
    qt = x;
    }  
    //setName ni banauna
    public void setName(String x){  //method 2
      name = x;
    }//k hunxa gara setter function ma void vako chai hamle set garne ho value so
    
    public void display(){          //method 3
        System.out.println(qt + "  " + name); //direct access hunxa k object ni banauna pardaina
    }
}//private member ko access class A vitra matra xa k
public class lol{//public class ko name Main file ko name Main.java vako vayera
  public static void main(String[]args) { //haha k k garya ho yo manxe le
      A lol;  //object reference vayo yo
      lol = new A();
      //talako chai object le method access garya
      lol.setQt(5); //method matra use garne ho qt is hidden
      //direct access napai lol.name="Hehe"; uo chai???
      //object ko through bata method call gareko method no return type with args wala xa ta
      lol.setName("Hello");
      lol.display(); //???non static function ho class le call garna paidaina obj chainxa
      
  } 
}