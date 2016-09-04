package com.alandwiprasetyo.quicksort;

/**
 * Created by alandwiprasetyo on 9/4/16.
 */
public class BubbleSort {

    void bubbleSort(int [] data){
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
                print(data);
            }
        }
    }
    void print(int [] data){
        for (int d: data){
            System.out.print(d+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] data = {4,2,1,6};
        bubbleSort.bubbleSort(data);
        bubbleSort.print(data);
    }
}
