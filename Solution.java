/*
* This program finds the sum of all the multiples of 3 or 5 for number.
*/


public class Solution {

    public int solution(int number) {
      
      //int numberN = number;
      //int[] numbers;
      int total = 0;                          //this sets a int variable to store total
      if(number < 0){                         //checks for negative numbers, returns 0 if negative
        return 0;
      }
      for (int i = 0 ; i < number ; i++){     
        if(i % 3 == 0){                       //checks to see if index i is a multiple of 3
            total = total + i;                //adds total to total int count for multiples found 
        }else if( i % 5 == 0){                //checks to see if index i is a multiple of 5
          if (i % 3 == 0){                    //checks to see if we already added, if so, we do nothing
          }else {
            total = total + i;                //adds total to total int count for multiples found
            }
        }
      }
      return total;                           //returns total
    }
  }