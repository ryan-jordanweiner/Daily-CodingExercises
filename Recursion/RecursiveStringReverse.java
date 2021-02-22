public class RecursiveStringReverse
{
    public String recursiveStringReverse(String str)
    {
        //exit condition
        //if the string is of length 1 or less
        if(str.length() <= 1)
        {
            return str;
        }
        
        //isolate the last characeer
        String character = Character.toString(str.charAt(str.length()-1));
        //reassign str to exclude the last character
        str = str.substring(0, str.length()-1);
       
        //return the character then the next iteration of the recursive algorithm to create the reversed string
        return character+recursiveStringReverse(str);
    }
}
