class Sum{
  public static void main(String[]args) {
    int a[]={5,10,15,20,25};
    int s = 0;
    for (int i=0; i<5; i++){
      s = s + a[i];
      System.out.println( s + a[i] + s);
    }
    System.out.println("Sum : " + s);
  }
}