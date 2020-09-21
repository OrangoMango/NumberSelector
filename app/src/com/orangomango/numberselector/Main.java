package com.orangomango.numberselector;

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] e1 = NumberSelector.findFirstN(i -> true, 10);
    int[] e2 = NumberSelector.findFirstN(i -> i % 7 == 0, 10);
    int[] e3 = NumberSelector.findFirstN(i -> {
      if (i < 2){
        return false;
      }

      for (int it = 2; it < i; it++){
        if (i % it == 0){
          return false;
        }
      }

      return true;
    }, 10);
    
    System.out.println("Numbers from 1 to 10: "+Arrays.toString(e1));
    System.out.println("Number divisible by 7: "+Arrays.toString(e2));
    System.out.println("Prime numbers: "+Arrays.toString(e3));
  }
}