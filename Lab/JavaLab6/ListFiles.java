// 1. WAP to list all files of a directory.
import java.io.*;
public class ListFiles{
    public static void main (String[]args){
          File f =new File ("/home/sameeksha/Documents"); //directory whose file name should be displayed.
          if (f.isDirectory()){
            String fn[]=f.list();
            for (int i=0; i<fn.length; i++)
            System.out.println(fn[i]);
          }
          else{
            System.out.println("File not found.");
          }
    }
}