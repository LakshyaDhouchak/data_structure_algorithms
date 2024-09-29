package DataStructure.LinkedListDataStructure;

import java.util.Scanner;
public class CircularLinkedList {
    // define the properties
    node head;
    node dup;
    int count =0;
    // calling the Scanner
    Scanner input = new Scanner(System.in);

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
                node.next = head;
                count++;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node class Object
                node node = new node(data);
                dup.next = node;
                dup = node;
                node.next = head;
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
        int i=0;
        System.out.println("The element present in linkedList is:");
        while(i!=count){
            System.out.print(dup.data+" ");
            dup = dup.next;
            i++;
        }
        System.out.println();
    }

    // define the Insert() methord
    public void Insert(){
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
                while(dup.next!=head){
                    dup = dup.next;
                }
                System.out.println("Enter the data to be inserted at end:");
                data = input.nextInt();
                // calling the class node
                node  =  new node(data); 
                dup.next = node;
                node.next = head;
                count++;
                break;
            case 3:
                dup = head;
                int i=0;
                System.out.println("Enter the before data:");
                int Bdata = input.nextInt();
                while(i!=count){
                    if(dup.data == Bdata){
                        break;
                    }
                    dup = dup.next;
                    i++;
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
                int i =0;
                while(i!=count){
                    if(dup.next.next == head){
                        break;
                    }
                    dup = dup.next;
                    i++;
                }
                dup.next = head;
                count--;
                break;
            case 3:
                // define the properties
                dup = head;
                node point = head;
                int flag =0;
                i=0;

                System.out.println("Enter the data to be deleted:");
                int Ddata = input.nextInt();
                while(i!=count){
                    if(dup.data == Ddata){
                        flag =1;
                        break;
                    }
                    dup = dup.next;
                    i++;
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
