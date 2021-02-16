public class Ques6
{
    public static void main(String args[])
    {
        int arr1[] = {4,4,2,2,3,6,6,7,7};
        int count,i,j;
        for(i =0; i<arr1.length; i++)
        {
            count=0;

            for(j=0; j<arr1.length; j++) //j = 0 because we want to check repeated elements again from the starting of the array
            {
                if(arr1[i] == arr1[j] && i!=j)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("Number not repeated twice is : "+arr1[i]);
            }

        }

    }
}
