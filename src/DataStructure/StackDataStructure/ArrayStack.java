package DataStructure.StackDataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayStack {
    // define the properties
    int index =0;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    //define the push() methord
    public void push(){
        int choice =0;
        do{
            System.out.println("Enter the data:");
            int data = input.nextInt();
            arr.add(data);
            index++;
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
        System.out.println("The element present in stack is:");
        for(int i=0;i<index;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

    // define the pop() methord
    public void pop(){
        System.out.println("The top element of stack is: "+arr.get(index-1));
        index--;
        System.out.println("The last element is removed SuccessFully");
    }

    // define the IsEmpty() methord
    public void IsEmpty(){
        if(index == 0){
            System.out.println("The stack is Empty");
        }
        else{
            System.out.println("The stack is not Empty");
        }
    }

    // define the peek() methord
    public void peek(){
        System.out.println("The last Element of stack is: "+arr.get(index-1));
    }
}
