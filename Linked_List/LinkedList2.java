package Linked_List;

import org.w3c.dom.Node;

public class LinkedList2 {
    Node head;
    private int size;

    LinkedList2(){
        size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){          //function 1) add element to the first of the list
        Node newNode = new Node(data);
        newNode.next= head;
        head = newNode;
    }
    public void addLast(String data){          //function 1) add element to the Last of the list
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next= newNode;
    }
    public void printList(){
        Node currNode = head;           //function to print the list

        while(currNode.next !=null){
            System.out.println(currNode.data+ " ->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){        //removing first element of the list and making second element the head.
        if(head ==null){
            System.out.println("List is empty, nothing to delete");
            return;
        }
        head = this.head.next;   //when removing first the second element becomes the head and then we decrease the size of the list
        size--;
    }
    public void removeLast(){        //removing Last element of the list
        if(head ==null){
            System.out.println("List is empty, nothing to delete");
            return;
        }
        size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
            currNode.next= null;
    }
    public int getSize(){
        return size;
    }
}

