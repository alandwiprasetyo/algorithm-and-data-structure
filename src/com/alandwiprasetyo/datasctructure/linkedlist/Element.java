package com.alandwiprasetyo.datasctructure.linkedlist;

/**
 * Created by alandwiprasetyo on 9/3/16.
 */
public class Element {
    Info info;
    Element next;
    Element(int id,String name){
        info = new Info(id,name);
        next = null;
    }
}
