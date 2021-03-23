/*
This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and
constant space. In other words, find the lowest positive integer that does not exist in
the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2.
The input [1, 2, 0] should give 3.

You can modify the input array in-place.
*/

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class DCP004 {
   public static void main(String[] args){
      
      //declare sample array
      int[] arrayGiven = {3, 4, -1, 1};
            
      //sort array
      Arrays.sort(arrayGiven);
      
      //get rid of negative numbers from array
      for(int i=0; i < arrayGiven.length; i++) {
         if (arrayGiven[i] < 0)
            arrayGiven = ArrayUtils.remove(arrayGiven, i);
      }
      
      //loop through array elements looking for gaps
      int n = 0;
      boolean found = false; //flag in case of no gaps
      for(int i=0; i < arrayGiven.length; i++) {
         if (arrayGiven[i] > (n + 1)) {
            System.out.print(n + 1);
            found = true;
            break;
         }
         else
            n++;
      }
      
      // handles the case if the array does not contain gaps and we need the next integer
      if (found == false)
         System.out.print(arrayGiven[arrayGiven.length - 1] + 1);
      
//       for(int i=0; i < arrayGiven.length; i++)
//          System.out.print(arrayGiven[i]);
   
   } // end main
} // end class