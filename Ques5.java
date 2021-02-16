public class Ques5
{
    public static void main(String args[])
    {
        int arr1[] = {4,2,3,6,7,1,5};
        int arr2[] = {5,10,2,11,3,12,4};

        System.out.println("Common elements in array are : ");
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.printf(arr1[i]+" ");
                    break;
                }
            }
        }
    }
}