package com.orangomango.numberselector;

import java.util.Arrays;

@FunctionalInterface
public interface NumberSelector{
  public boolean check(int number);

  public static int[] findFirstN(NumberSelector selector, int n){
    if (n < 0 || selector == null){
      throw new IllegalArgumentException("selektor can not be null or n < 0");
    }

    int[] output = new int[n];
    int index = 0;

    for (int i = 1; i<1000000 && index <n; i++){
      if (selector.check(i)){
        output[index++] = i;
      }
    }
    
    if (index > output.length){
     Arrays.copyOf(output, index);
    }
    

    return output;
  }
}