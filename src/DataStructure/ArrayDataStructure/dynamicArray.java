package DataStructure.ArrayDataStructure;

import java.util.Scanner;
public class dynamicArray {
    // define the properties
    int[] arr;
    int index;
    int capacity;

    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    //calling the constructor
    public dynamicArray(int initialCapacity){
        this.arr = new int[initialCapacity];
        capacity = initialCapacity;
        index =0;
    } 

    // define the properties
    public void create(){
        if(index == capacity){
            reSize();
        } 
        System.out.println("Enter the data at index "+index+" is:");
        int data = input.nextInt();
        arr[index] = data;
        index++;
    }

    // define the resize() methord
    public void reSize(){
        capacity = 2*capacity;
        int[] dup =  new int[capacity];
        System.arraycopy(arr, 0, dup, 0, index);
        arr = dup;
        dup = null;
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in linkedList is: ");
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the isEmpty() methord
    public void IsEmpty(){
        if(index == 0){
            System.out.println("The ArrayList is Empty");
        }
        else{
            System.out.println("The ArrayList is not Empty");
        }
    }

    // define the Insert() methord
    public void Insert(){
        System.out.println("************CHOICE************\n"+
                           "   Case 1: Insert in starting\n"+
                           "   Case 2: Insert in middle\n"+
                           "   Case 3: Insert in end\n"+
                           "******************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                if(index == capacity){
                    reSize();
                } 
                System.out.println("Enter the data in starting:");
                int data = input.nextInt();
                for(int i=0;i<index;i++){
                    arr[i+1]= arr[i];
                }
                arr[0]= data;
                index++;
                break;
            case 2:
                if(index == capacity){
                    reSize();
                }   
                System.out.println("Enter the index :"); 
                int index1 = input.nextInt();
                System.out.println("Enter the data to be inserted in middle:");
                data = input.nextInt();

                for(int i = index1;i<index;i++ ){
                    arr[i] = arr[i+1];
                }
                arr[index1] = data;
                index++;
                break;
            case 3:
                System.out.println("Enter the data to inserted in end:");
                data = input.nextInt();
                arr[index] = data;
                index++;
                break;
        }
    }

    // define the Delete() methord
    public void Delete(){
        System.out.println("************CHOICE************\n"+
                           "   Case 1: Delete in starting\n"+
                           "   Case 2: Delete in middle\n"+
                           "   Case 3: Delete in end\n"+
                           "******************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                for(int i=0;i<index;i++){
                    arr[i]= arr[i+1];
                }
                index--;
                break;
            case 2:
                System.out.println("Enter the index :"); 
                int index1 = input.nextInt();
                for(int i = index1;i<index;i++ ){
                    arr[i] = arr[i+1];
                }
                
                index--;
                break;
            case 3:
                index--;
                break;
        }
    }

    // define the max() methord
    public void max(){
        int maxElement = arr[0];
        for(int i=1;i<index;i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("The max element present in array is: "+maxElement);
    }

    // define the min() methord
    public void Min(){
        int minElement = arr[0];
        for(int i=1;i<index;i++){
            if(arr[i]<minElement){
                minElement = arr[i];
            }
        }
        System.out.println("The min element present in an array is: "+minElement);
    }
}

