import java.util.ArrayList;
public class BinarySearchSolution
{
    public boolean containsVal_Rec_binSearch(int val, int[] arr)
    {
       ArrayList<Integer> arrL = new ArrayList<>();
       for (int element:arr)
       {
           arrL.add(element);
       }
       int midIndex = 0;
       boolean done = false;
       while (!done)
       {
           if(val == arrL.get(midIndex))
           {
               return true;
           }
           midIndex = Math.round((arrL.size()-1)/2);
           if (val < arrL.get(midIndex))
           {
               arrL.subList(arrL.size() - midIndex, arrL.size()).clear();
           }
           else
           {
               for (int i = 0; i < midIndex; i++)
               {
                   arrL.remove(i);
               }
           }
           
       }
       return false;
    }
}
