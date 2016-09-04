package com.alandwiprasetyo.quicksort;

/**
 * Created by alandwiprasetyo on 9/4/16.
 */
public class BubbleSortt {

    void data(int [] data){
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if(data[j] > data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortt bubbleSortt = new BubbleSortt();
    }
}
