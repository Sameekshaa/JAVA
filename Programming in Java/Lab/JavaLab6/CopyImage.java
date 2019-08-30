/*WAP to copy an image.*/
import java.io.*;
class CopyImage{
  public static void main(String[]atrgs){
    try{
      FileInputStream fin = new FileInputStream("/home/sameeksha/Image/ok.png");
      FileOutputStream fout = new FileOutputStream("/home/sameeksha/Image1/ok.png");
      int a;
      while((a=fin.read())!=-1){
        fout.write(a);
      }
      fin.close();
      fout.close();
    }
    catch(Exception ex){
      System.out.println(ex);
    }
  }
}