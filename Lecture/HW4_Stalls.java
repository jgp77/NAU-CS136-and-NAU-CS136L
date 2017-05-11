public class HW4_Stalls
{
  public static void printStall(boolean bool[])
  // Creates printStall that takes in a boolean
  // This will print out the stalls
  {
      for(int i=0;i<bool.length;i++)
      // for loop of using stalls length
      {
          if(bool[i])
          // If the stall is filled, prints x
          {
              System.out.print("x");
          }
          else
          // else prints _
          {
              System.out.print("_");
          }
      }
      System.out.print("\n");
      // Creates newline for next print s
  }

  public static int nextStall(boolean stalls[])
  // Creates nextStall that takes in a boolean
  {
      boolean bool=false;
      // Boolean value, default is false
      int largestPosition=-1;
      // largestPosition with default int of -1
      int position=-1;
      // position with default int of -1
      int largestChange=0;
      // sets current largest change to 0
      int currentChange=0;
      // sets the current change to 0
      for(int i=0;i<stalls.length;i++)
      {
          if(bool&&stalls[i])
          // checks if bool is true and stalls position is true
          {
              bool=false;
              // sets bool to false
              if(currentChange>=largestChange)
              // if the current change is greater then the largestChange
              {
                  largestChange=currentChange;
                  // makes the currentChange the new largestChange
                  largestPosition=position;
                  // and position the new largestPosition
              }
          }
          if(!bool&&!stalls[i])
          // if the opposite of bool and the opposite of stalls is true
          {
              bool=true;
              // sets bool equal to true
              position=i;
              // sets position to the current index
              currentChange=1;
              // sets the current change to 1
          }
          if(bool&&!stalls[i])
          // if bool and the opposite of stalls is true
          {
              currentChange += 1;
              // current change has 1 added to it
          }
      }
      if(bool)
      // if bool is true
      {
          if(currentChange>=largestChange)
          // if the currentchange is greater or equal to the largest
          {
              largestChange=currentChange;
              // sets largest to the current change
              largestPosition=position;
              // sets the largest position to the current position
          }
      }
      return(((largestChange-1)/2)+largestPosition);
      // returns the largestChange-1 diveded by 2 and then added to largest position
  }

  public static void main(String[] args)
  {
      boolean array[]=new boolean[50];
      // Creates new boolean with 50 places
      for(int i=0;i<array.length;i++)
      // for loop to access each index
      {
          array[nextStall(array)]=true;
          // Finds the next stall needed and changes to true
          printStall(array);
          // Prints out the current stalls
      }
  }
}
