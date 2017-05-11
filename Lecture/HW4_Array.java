public class HW4_Array
{
    public static void main(String[] args)
    {
        int array[]= new int[10];
        // Creates an array with 10 positions
        for(int i=0;i<10;i++)
        {
            array[i]=(int)((Math.random()*200)+1);
        }
        // Changes the arrays to random numbers between 1 and 200
        System.out.print("This is the array: ");
        // Print statement
        for(int i=0;i<array.length;i++)
        {
          // Prints out the entire array for troubleshooting
                System.out.print(array[i]+" ");
        }


        System.out.print("\nElements at an even index: ");
        // Print statement
        for(int i=0;i<array.length;i++)
        {
            if(i%2==0)
              // Checks if the position is even or not
            {
                System.out.print(array[i]+" ");
            }
        }

        System.out.print("\nEven elements: ");
        // Print statement
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            // Checks to see if the array content is even or not
            {
                System.out.print(array[i]+" ");
            }
        }

        System.out.print("\nArray elements in reverse order: ");
        // Print statement
        for (int i=array.length-1;i>-1;i--)
        // For loop to reverse the array
        {
            System.out.print(array[i]+" ");
        }

        System.out.print("\nFirst and last element: ");
        // Print statement
        System.out.print(array[0]+" "+array[array.length-1]);
        // Prints out the number in the 1st and last elements.
        // Uses length to calculate last position
    }
}
