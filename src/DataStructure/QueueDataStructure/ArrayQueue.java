package DataStructure.QueueDataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayQueue {
     int start = 0;
    int end =0;
    ArrayList<Integer> aList = new ArrayList<Integer>();

    // define the Scanner
     Scanner input =  new Scanner(System.in);

     //define the Dequeue() methord
     public void Dequeue(){
        int choice =0;
        do{
            if(start == 0){
                System.out.println("Enter the data:");
                int data = input.nextInt();
                aList.add(data);
                start++;
            }
            else{
                System.out.println("Enter the data:");
                int data = input.nextInt();
                aList.add(data);
                end++;
            }    
            System.out.println("***************CHOICE*************\n"+
                               "     Case 1: Add more node\n"+
                               "     Case 2: Don't add node\n"+
                               "**********************************");
            System.out.println("Enter the choice:");
            choice = input.nextInt();                   
        }
        while(choice == 1);
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in Queue is:");
        for(int i=0;i<end;i++){
            System.out.print(aList.get(i)+" ");
        }
        System.out.println();
    }

    // define the pop() methord
    public void Enqueue(){
        System.out.println("The top element of stack is: "+aList.get(end-1));
        end--;
        System.out.println("The last element is removed SuccessFully");
    }

    // define the IsEmpty() methord
    public void IsEmpty(){
        if(start == 0){
            System.out.println("The stack is Empty");
        }
        else{
            System.out.println("The stack is not Empty");
        }
    }

    // define the peek() methord
    public void peek(){
        System.out.println("The last Element of stack is: "+aList.get(end-1));
    }
}
