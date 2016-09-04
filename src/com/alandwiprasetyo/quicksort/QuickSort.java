package com.alandwiprasetyo.quicksort;

/**
 * Created by alandwiprasetyo on 9/3/16.
 */
public class QuickSort {

    int partition(int [] data, int left,int right) throws InterruptedException {
        int i = left, j = right;
        int temp;
        int pivot = data[(left+right)/2];
        while (i <= j){
            while (data[i] < pivot)
                i++;
            while (data[j] > pivot)
                j--;
            if(i <= j){
//                swap(data[i],data[j]);
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    void quickSort(int [] data,int left, int right) throws InterruptedException {
        int index = partition(data,left,right);
        if(index - 1 > left)
            quickSort(data,left,index-1);
        if(index < right)
            quickSort(data,index,right);
    }
    void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) throws InterruptedException {
        QuickSort quickSort = new QuickSort();
        int [] data = {4,2,1,6,5,3};
        quickSort.quickSort(data, 0,data.length - 1);

    }
    void print(int [] data){
        for(int d : data){
            System.out.print(d+" ");
        }
        System.out.println();
    }
}
