import java.util.Arrays;
public class BubbleSortSolution
{
    public int[] bubbleSort(int[] ogArr)
    {
        
        //while the array is not in order
        while (!(isSorted(ogArr)))
        {
            iterate over the array
            for (int i = 1; i < ogArr.length; i++)
            {
                //compare the values of 2 adjacent elements; if the first element is larger, swap the elements 
                if (ogArr[i-1] > ogArr[i])
                {
                    int tempMin, tempMax;
                    tempMax = ogArr[i-1];
                    tempMin = ogArr[i];

                    ogArr[i-1] = tempMin;
                    ogArr[i] = tempMax;

                }
            }
        }
        //return the sorted array
        return ogArr;
    }
    
    //method to check if the array is sorted
    public boolean isSorted(int[] arr)
    {
        //iterate over the array
        for(int i = 1; i < arr.length; i++)
        {
            //compare adjacent values; if the first one is larger, return false
            if (arr[i-1] > arr[i])
            {
                return false;
            }

        }
        return true;
    }
}
