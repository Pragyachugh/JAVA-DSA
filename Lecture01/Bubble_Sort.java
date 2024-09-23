public class Bubble_Sort {
    //bubble sorting
    static void bubble_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //display function
    static void display(int[] arr){
        for (int i:arr)
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        System.out.println("** Program to bubble sort an array **");
        int[] arr = {1,4,54,32,38,14,68,36};//array
        System.out.print("Unsorted array : ");
        display(arr);
        System.out.println();
        bubble_sort(arr);
        System.out.print("Sorted Array : ");
        display(arr);
    }
}
