import java.util.*;
public class Bubble_sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,j,temp;
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] array = new int[50];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Array elemets are ");
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println();
        
    }
    
}
