// package Lecture01;
import java.util.Arrays;
public class Binary_Search{
    static boolean binary_search(int[] arr,int target){
        int high = arr.length-1;
        int low=0;
        while (low<=high)
        {
            int mid=(high+low)/2;
            if (arr[mid]==target)
            return true;
            else if (arr[mid]<target)
            low = mid+1;
            else
            high = mid-1;
        }
        return false;

    }
    public static void main(String[] args){
        int[] arr ={1,6,3,33,36,7,4,76,25,13};
        Arrays.sort(arr);
        System.out.println(binary_search(arr,9));
        System.out.println(binary_search(arr,33));
        
    }
}