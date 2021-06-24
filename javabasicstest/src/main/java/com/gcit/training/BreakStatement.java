package com.gcit.training;
public class BreakStatement{

public int breakStatement(int n,int b) {
    int count = 0;
    for ( count = 0; count <= n; count++) {
      
      if (count == b) {
    	  break;       
      }     
    }
    return count;
  }
}