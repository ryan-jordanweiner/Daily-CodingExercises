import java.util.Arrays;
public class BubbleSort
{
    public int[] bubbleSort(int[] ogArr)
    {
        while (!(isSorted(ogArr)))
        {
            for (int i = 1; i < ogArr.length; i++)
            {
                if (ogArr[i-1] > ogArr[i])
                {
                    int tempMin, tempMax;
                    tempMax = ogArr[i-1];
                    tempMin = ogArr[i];

                    ogArr[i-1] = tempMin;
                    ogArr[i] = tempMax;

                }
            }
            System.out.println(Arrays.toString(ogArr));
        }import java.util.Arrays;
public class BubbleSortSolution
{
    public int[] bubbleSort(int[] ogArr)
    {
        while (!(isSorted(ogArr)))
        {
            for (int i = 1; i < ogArr.length; i++)
            {
                if (ogArr[i-1] > ogArr[i])
                {
                    int tempMin, tempMax;
                    tempMax = ogArr[i-1];
                    tempMin = ogArr[i];

                    ogArr[i-1] = tempMin;
                    ogArr[i] = tempMax;

                }
            }
            System.out.println(Arrays.toString(ogArr));
        }
        return ogArr;
    }

    public boolean isSorted(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            if (arr[i-1] > arr[i])
            {
                return false;
            }

        }
        return true;
    }
}

        return ogArr;
    }

    public boolean isSorted(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            if (arr[i-1] > arr[i])
            {
                return false;
            }

        }
        return true;
    }
}
