class Sum{
  public static void main(String[]args) {
    int a[]={5,10,15,20,25,30,35};
    int s = 0;
    for (int m : a) // for each m in a 
    {
      s = s + m;
    }
    System.out.println("Sum : " + s);
  }
}