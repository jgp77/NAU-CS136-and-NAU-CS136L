public class HW3
 {
    public static void main(String[] args)
    {
        int[] numberArray=new int[10];
        for(int i=0;i<10;i++)
        {
            numberArray[i]=(int)(Math.random()*100+1);
        }
        System.out.println("Every even index element:");
        for(int i=0;i<numberArray.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(numberArray[i]+" ");
            }
        }
        System.out.println("\nEvery even element:");
        for(int i=0;i<numberArray.length; i++)
        {
            if(numberArray[i]%2==0)
            {
                System.out.print(numberArray[i]+" ");
            }
        }
        System.out.println("\nAll elements in reverse order:");
        for (int i=numberArray.length-1;i>-1;i--)
        {
            System.out.print(numberArray[i]+" ");
        }
        System.out.println("\nFirst and last element:");
        System.out.print(numberArray[0]+" "+numberArray[numberArray.length - 1]);
    }
}
