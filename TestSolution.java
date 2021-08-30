/*
* This program contains the main function to test the Solution class for value n.
*/

public class TestSolution {

    

    private static int sum;

    public static void main(String[] args) {

    
    Solution answer = new Solution();                               //This creates an instance of the Solutions class

          
    sum = answer.solution(1000);                                    //assigns the total sum of of all multiples of 3 and 5 to number n.

        System.out.println("The answer is  " + sum );               //Prints result to the console
    }
    
}
