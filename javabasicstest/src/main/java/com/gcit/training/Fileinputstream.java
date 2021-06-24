package com.gcit.training;

import java.io.FileInputStream;  
public class Fileinputstream {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }
catch(Exception e){
System.out.println(e);
}             
}    
}  