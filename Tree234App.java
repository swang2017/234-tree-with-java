
import java.io.*;
import java.util.*;

class Tree234App
{
  
  public static void main(String[] args) throws IOException
  {
    Node root = new Node();  
 
    Tree234 theTree = new Tree234();
    
    
    //-------------------------------------------------------
    List<String> list = new ArrayList<String>();
    Scanner stdin = new Scanner(System.in);
    
    do {
      System.out.println("Current list is " + list);       // this part generates an array of numbers 
                                                           // from user input
      System.out.println("Add more? (y/n)");
      if (stdin.next().startsWith("y")) {
        System.out.println("Enter : ");
        list.add(stdin.next());
      } else {
        break;
      }
    } while (true);
    
    System.out.println("Array is " + list);
    
    String[] arr = list.toArray(new String[0]);            // this part generates an array of numbers 
                                                           // from user input
    
    int[] num=new int[arr.length];
    for (int i=0; i < arr.length; i++) 
    {
      num[i] = Integer.parseInt(arr[i]);
      theTree.insert(num[i]);                             // the 2-3-4 tree is generated based on the input number
    }
    
    //---------------------------------------------------- 
    
    
    while(true)                                           // interaction with user, select to display tree or show 
                                                          // the sorted (in-order traversal )numbers
    {
      System.out.print("Enter first letter of ");
      System.out.print("display or sort  : ");
      char choice = getChar();
      switch(choice)
      {
        case 'd':
          theTree.displayTree();
          break;
        case 's':
          System.out.print("The sorted numbers are: ");
          theTree.inOrder(theTree.root);
         
          break;
       default:
          System.out.print("Invalid entry\n");
      }  // end switch
    }  // end while
  }  // end main()
//--------------------------------------------------------------
  public static String getString() throws IOException                 // this part gets input from users
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }
//--------------------------------------------------------------
  public static char getChar() throws IOException                    // this part gets input from users
  {
    String s = getString();
    return s.charAt(0);
  }
  
//-------------------------------------------------------------
  public static int getInt() throws IOException                     // this part gets input from users
  {
    String s = getString();
    return Integer.parseInt(s);
  }

}
//-------------------------------------------------------------








