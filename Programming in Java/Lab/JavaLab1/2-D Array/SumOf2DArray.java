class SumOf2DArray{
  public static void main(String[]args){
    int a[][]={{1,2,3},{4,5,6}};
    int sum = 0;
    for (int m[] : a){
      for (int n : m){
        sum = sum + n;
      }
    }
    System.out.println("Sum : " + sum);
  }
}