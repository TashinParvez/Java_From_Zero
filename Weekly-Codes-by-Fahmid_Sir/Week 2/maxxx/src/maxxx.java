public class maxxx {


    public static void main(String[] args) {

        int arr[] = {5,7,3,1,4,2};
        int maxxx = arr[0];

        for(int i=0; i<=5;i++)
        {
            if(arr[i]>maxxx)
            {
                maxxx = arr[i];
            }
        }
        System.out.println("Max of array = "+maxxx);
    }
}
