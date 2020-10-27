package sorter;

public class BubbleSort {
    private int arr[];
    public BubbleSort(int arr[]) {
        this.arr = arr;
    }
   public void bubbleSort()
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    @Override
    public String toString(){
        bubbleSort();
        String res = new String();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                res += arr[i];
            }
            else res += "," + arr[i];
        }
       return res;
    }
}
