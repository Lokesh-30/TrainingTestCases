package com.gcit.training;
import java.io.FileOutputStream;
public class Fileoutputstream {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  