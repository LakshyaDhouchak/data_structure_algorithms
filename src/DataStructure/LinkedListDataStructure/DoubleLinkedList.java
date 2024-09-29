package DataStructure.LinkedListDataStructure;

import java.util.Scanner;
public class DoubleLinkedList {
    // define the properties
    node head;
    node tail;
    node dup = head;
    // calling the Scanner
    Scanner input =  new Scanner(System.in);
    
    // define the inner class
    static class node{
        // define the properties
        int data;
        node left;
        node right;

        // calling the constructor
        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // define the create() methord
    public void create(){
        // define the properties
        int choice =0;
        do{
            if(head == null){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node Object
                node node =  new node(data);
                head = node;
                tail = node;
                dup = node;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                // calling the node Object
                node node = new node(data);
                dup.right = node;
                node.left = dup;
                dup = node;
                tail = node;
            }
            System.out.println("**************CHOICE**************\n"+
                               "    Case 1: Add more node\n"+
                               "    Case 2: Don't add node\n"+
                               "**********************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
        }
        while(choice ==1);
    }

    // define the display() methord
    public void display(){
        dup = head;
        System.out.println("The data present in linkedList is:");
        while(dup!= null){
            System.out.print(dup.data+" ");
            dup = dup.right;
        }
        System.out.println();
    }

    // define the display() methord
    public void RevDisplay(){
        dup = tail;
        System.out.println("The data present in linkedList in reverse order is:");
        while(dup!= null){
            System.out.print(dup.data+" ");
            dup = dup.left;
        }
        System.out.println();
    }

    // define the insert() methord
    public void Insert(){
        // define the properties
        int choice;
        System.out.println("*************CHOICE*************\n"+
                           "   Case 1: Insert in starting\n"+
                           "   Case 2: Insert in end\n"+
                           "   Case 3: Insert in middle\n"+
                           "********************************");
        System.out.println("Enter the choice:");
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter the data to be inserted:");
                int data = input.nextInt();
                // calling the node class Object
                node node =  new node(data);
                node.right = head;
                head.left = node;
                head = node;
                break;
            case 2:
                System.out.println("Enter the data to be inserted:");
                data = input.nextInt();
                // calling the node class Object
                node = new node(data);
                tail.right = node;
                node.left = tail;
                tail = node;
                break;
            case 3:
                dup = head;
                int flag =0;
                System.out.println("Enter the before data:");
                int Bdata = input.nextInt(); 
                while(dup!=null){
                    if(dup.data == Bdata){
                        flag =1;
                        break;
                    }
                    dup = dup.right;
                }
                if(flag ==1){
                    System.out.println("Enter the data to be inserted:");
                    data = input.nextInt();
                    // calling the node class Object
                    node = new node(data); 
                    node.right = dup.right;
                    node.left = dup;
                    dup.left = node;
                    dup.right.left = node;
                }
                else{
                    System.out.println("Element not found");
                }
                break;
        }
    }

    // define the delete() methord
    public void delete(){
         // define the properties
         int choice;
         System.out.println("*************CHOICE*************\n"+
                            "   Case 1: Delete in starting\n"+
                            "   Case 2: Delete in end\n"+
                            "   Case 3: Delete in middle\n"+
                            "********************************");
         System.out.println("Enter the choice:");
         choice = input.nextInt();

         switch(choice){
            case 1:
                head = head.right;
                head.left = null;
                break;
            case 2:
                dup = head;
                tail = tail.left;
                tail.right = null;
                break;
            case 3:
                dup = head;
                int flag =0;
                System.out.println("Enter the data to be deleted:");
                int data = input.nextInt();
                while(dup!= null){
                    if(dup.data == data){
                        flag =1;
                        break;
                    }
                    dup = dup.right;
                }
                if(flag ==1){
                    dup.left.right = dup.right;
                    dup.right.left = dup.left;
                }
                else{
                    System.out.println("Element not found");
                }
                break;
         }
    }
}
