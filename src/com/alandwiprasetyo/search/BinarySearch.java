package com.alandwiprasetyo.search;

/**
 * Created by alandwiprasetyo on 9/4/16.
 */
public class BinarySearch {

    public boolean binarySearch(int[] data,int key){
        int low = 0;
        int high = data.length - 1;
        while (high >= low){
            int middle = (low +high) / 2;
            if(data[middle] == key){
                return true;
            }
            if(data[middle] < key){
                low = middle + 1;
            }
            if(data[middle] > key){
                high = middle + 1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int [] data = {4,5,2,5,6,8,10};
        System.out.println(binarySearch.binarySearch(data,1) ? "Data ditemukan":"data tidak ditemukan");

    }
}
