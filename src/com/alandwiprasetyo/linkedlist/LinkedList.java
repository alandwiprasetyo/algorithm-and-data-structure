package com.alandwiprasetyo.linkedlist;

/**
 * Created by alandwiprasetyo on 9/3/16.
 */
public class LinkedList {
    Element first;
    LinkedList(){
        first = null;
    }
    void insertFirst(int id,String name){
        Element element = new Element(id,name);
        if(first == null){
            first = new Element(id,name);
        }else{
            element.next = first;
            first = element;
        }
    }
    void insertLast(int id,String name){
        Element element = new Element(id,name);
        if(first == null){
            first = element;
        }else{
            Element lastElement = first;
            while (lastElement.next != null){
                lastElement = lastElement.next;
            }
            lastElement.next = element;
        }

    }
    void insertAr(int id,String name,int idBefore){
        Element element = new Element(id,name);
        if(first == null){
            first = element;
        }else{

        }
    }
    void deleteFirst(){
        if(first != null){
            first = first.next;
        }
    }
    void deleteLast(){
        if(first != null){
            Element lastElement = first;
            Element beforeLast = null;
            while (lastElement != null){
                beforeLast = lastElement;
                lastElement = lastElement.next;
            }
            beforeLast.next = null;
        }
    }
    void print(){
        Element element = first;
        while (element != null){
            System.out.println("id : "+element.info.id + "|| Name "+element.info.name);
            element = element.next;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(2,"Hello");
        linkedList.print();
//        linkedList.insertAt(2,4);
    }
}
