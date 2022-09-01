package CPS2232;

import java.util.ArrayList;

public class Discussion extends Exception{
    //Q1:setKthItem(k, item) that set the kth element of the array
    // to the value given in “item”. Please throw exceptions.

    /**
     *
     * @param k Kth
     * @param arr array
     * @param item the value
     */
    public static void setKthItem (int k, int[] arr,int item){
        if(k >=0 && k <= arr.length-1){
            arr[k] = item;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }
    //Q2: pickMaxIndex(arr, start, end) that returns the index of the largest value
    // of the array from index start to index end.

    /**
     *
     * @param arr array
     * @param start start index
     * @param end end index
     * @return
     */
    public static int pickMaxIndex (int [] arr, int start, int end){
        if(end >start){
            System.out.println("Invalid start and end");
            return 0;
        }
        if(start >= 0 && start <= arr.length-1
                && end >= 0
                && end <= arr.length-1 ) {
            int max = arr[start];
            int index = start;
            for (int i = 0; i <= end; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }
            return index;
        }
        else
            throw new IndexOutOfBoundsException();
    }
    //Q3: Swap(arr, index-i, index-j) that swaps the value in index i
    // with the value in index j.

    /**
     *
     *
     * @param arr array
     * @param i index
     * @param j index
     */
    public static void Swap(int [] arr, int i, int j){
        if(i > arr.length -1 || i < 0
        || j > arr.length-1 || j<0){
            throw new IndexOutOfBoundsException();
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Q4: selectionSort() that sorts the array in descending order,
    // i.e. the largest one comes first
//    public static void selectionSort(int [] arr, int low, int high){
//        int i,j,temp,t;
//        i = low;//pointer 1
//        j = high;//pointer 2
//        temp = arr[0]; // target
//        while(i<j){// if i =j , the loop will terminate
//            while(temp <= arr[j] && i<j){
//                j--;//pointer 1 find the number smaller than target
//            }
//            while(temp >= arr[i] && i< j){
//                i++;//pointer 2 find the number bigger than target
//            }
//            if(i <j){ // exchange two numbers
//                t = arr[j];
//                arr[j] = arr[i];
//                arr[i] = t;
//            }
//        }
//    //exchange the target with the termination number
//        arr[low] = arr[i];
//        arr[i] = temp;
//        //recursion to solve the smaller part and finally it can be sorted
//        selectionSort(arr,low,j-1);
//        selectionSort(arr,j+1,high);
 //   }
    public static void selectionSort(int [] arr){
    int length = arr.length, temp,index;
    for(int i = 0; i < length;i++ ){
        index = i;
        for(int j = i+1; j < length;j++ ){
            if(arr[index] < arr[j]){
                index = j;
            }
            if(index != i){
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
    }
}
