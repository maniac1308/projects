package algo;
class Nonrepeating 
{
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
     
     static void getCount(String str) 
     {
         for (int i = 0; i < str.length();  i++)
              count[str.charAt(i)]++;
     }
      
    static int firstNonRepeating(String str)
    {
        getCount(str);
        int index = -1, i;
      
        for (i = 0; i < str.length();  i++)
        {
            if (count[str.charAt(i)] == 1)
            {
                index = i;
                break;
            }   
        }  
       
      return index;
    }
 
    public static void main (String[] args)
    {
        String str = "indeed";
        int index =  firstNonRepeating(str);
         
        System.out.println(index == -1 ? "no non repeating character found" 
                    : "First non-repeating character is " +  str.charAt(index));
    }
}
