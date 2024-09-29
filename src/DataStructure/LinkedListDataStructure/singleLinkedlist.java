package DataStructure.LinkedListDataStructure;

import java.util.Scanner;

public class singleLinkedlist {
    // define the properties
    node head;
    node dup = head;
    int count =0;
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the inner class
    static class node{
        // define the properties
        int data;
        node next;

        // calling the constructor
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // define the create() methord
    public void create(){
        // define the properties
        int choice;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the class node Object
                node node =  new node(data);
                head = node;
                dup = node;
                count++;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node node = new node(data);
                dup.next = node;
                dup = node;
                count++;
            }
            System.out.println("*************CHOICE*************\n"+
                               "    Case 1: Add more node\n"+
                               "    Case 2: Don't add node\n"+
                               "********************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
        }
        while(choice ==1);    
    }

    // define the display() methord
    public void display(){
        dup = head;
        System.out.println("The data present in linkedList is:");
        while(dup!=null){
            System.out.print(dup.data+" ");
            dup = dup.next;
        }
        System.out.println();
    }

    // define the Max() methord
    public void max(){
        dup = head;
        int maxElement = dup.data;
        while(dup!=null){
            if(dup.data>maxElement){
                maxElement = dup.data;
            }
            dup = dup.next;
        }
        System.out.println("The max element present in linkedList is: "+ maxElement);
    }

    // define the min() methord
    public void min(){
        dup = head;
        int minElement = dup.data;
        while(dup!=null){
            if(dup.data<minElement){
                minElement = dup.data;
            }
            dup = dup.next;
        }
        System.out.println("The min element present in linkedList is: "+ minElement);
    }

    // define the isEmpty() methord
    public void isEmpty(){
        if(head == null){
            System.out.println("The linkedList is empty");
        }
        else{
            System.out.println("The linkedList is not empty");
        }
    }

    // define the insert() methord
    public void insert(){
        int choice =0;
        System.out.println("**************CHOICE****************\n"+
                           "    Case 1: Insert in starting\n"+
                           "    Case 2: Insert in end\n"+
                           "    Case 3: Insert in middle\n"+
                           "************************************");
        System.out.println("Enter the choice:");
        choice = input.nextInt(); 
        
        switch(choice){
            case 1:
                System.out.println("Enter the data to be inserted in starting:");
                int data = input.nextInt();
                // calling the node class
                node node =  new node(data);
                node.next = head;
                head = node;
                count++;
                break;
            case 2:
                dup = head;
                while(dup.next!=null){
                    dup = dup.next;
                }
                System.out.println("Enter the data to be inserted at end:");
                data = input.nextInt();
                // calling the class node
                node  =  new node(data); 
                dup.next = node;
                count++;
                break;
            case 3:
                dup = head;
                System.out.println("Enter the before data:");
                int Bdata = input.nextInt();
                while(dup!=null){
                    if(dup.data == Bdata){
                        break;
                    }
                    dup = dup.next;
                } 
                System.out.println("Enter the data in middle:");
                data = input.nextInt();
                // calling the class node
                node = new node(data);
                node.next = dup.next;
                dup.next = node;
                count++;
                break;       
        }
    }

    // define the delete() methord
    public void delete(){
        int choice =0;
        System.out.println("**************CHOICE****************\n"+
                           "    Case 1: Delete in starting\n"+
                           "    Case 2: Delete in end\n"+
                           "    Case 3: Delete in middle\n"+
                           "************************************");
        System.out.println("Enter the choice:");
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                head = head.next;
                count--;
                break;
            case 2:
                dup = head;
                while(dup!= null){
                    if(dup.next.next == null){
                        break;
                    }
                    dup = dup.next;
                }
                dup.next = null;
                count--;
                break;
            case 3:
                // define the properties
                dup = head;
                node point = head;
                int flag =0;

                System.out.println("Enter the data to be deleted:");
                int Ddata = input.nextInt();
                while(dup!=null){
                    if(dup.data == Ddata){
                        flag =1;
                        break;
                    }
                    dup = dup.next;
                }
                if(flag == 1){
                    while(point.next!= dup){
                        point = point.next;
                    }
                    point.next = point.next.next;
                    count--;
                }
                else{
                    System.out.println("Data is not present");
                }
                break;
        }
    }
}
