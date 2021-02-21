
// tester class for BubbleSort.java
//takes input of integer array and sorts it using bubble sort
//outputs the solution to the command line

import java.util.Arrays;
public class BubbleSortMain
{
    public static void main(int[] args)
    {
        //create new bubble sort object
        BubbleSortSolution bubbleSortSoltion = new BubbleSortSolution();
        
        //create input variable inputArray from the arguments passed from the command line
        int[] inputArray = args;
        //Output the sorted array to the command line
        System.out.println(Arrays.toString(bubbleSortSolution.bubbleSort(inputArray)));
    }
}
