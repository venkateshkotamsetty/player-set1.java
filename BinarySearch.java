import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    int i, first, last, middle, n, search, array[];
 
    Scanner in = new Scanner(System.in);
   
    n = in.nextInt();
    
    search = in.nextInt();
    array = new int[n];
   
    for (i = 0; i < n; i++)
    {
      array[i] = in.nextInt();
    }
    
    
 
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search )
      {
        System.out.println("yes");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if (first > last)
      System.out.println("no");
  }
}
