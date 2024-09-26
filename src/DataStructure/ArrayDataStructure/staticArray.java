package DataStructure.ArrayDataStructure;

import java.util.Scanner;
public class staticArray {
    // calling the Scanner
    Scanner input =  new Scanner(System.in);
    // define the properties
    int size = 5;

    // deceleration and initialization of an array
    int[] arr = new int[size];

    // define the insert() methord
    public void insert(){
        for(int i=0;i<size;i++){
            System.out.println("Enter the data at index "+i+" is:");
            int data = input.nextInt();
            arr[i] =  data; 
        }
    }

    // define the display() methord
    public void display(){
        System.out.println("The element present in array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the max() methord
    public void max(){
        int maxElement = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("The max element present in array is: "+maxElement);
    }

    // define the min() methord
    public void min(){
        int minElement = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]<minElement){
                minElement = arr[i];
            }
        }
        System.out.println("The min element present in an array is: "+minElement);
    }

    // define the isEmpty() methord
    public void contains(){
        // define the properties
        int flag =0;
        System.out.println("Enter the data to be searched:");
        int data = input.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == data){
                flag =1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Element is not present");
        }
        else{
            System.out.println("Element is present");
        }
    }

    // define the Get() methord
    public void Get(){
        System.out.println("Enter the index of element to be searched:");
        int index = input.nextInt();
        if(index<size&& index>=0){
            System.out.println("The element present in array is: "+arr[index]);
        }
        else{
            System.out.println("index out of range because index is greater than size");
        }
    }

    // define the set() methord
    public void set(){
        System.out.println("Enter the index if element to be updated: ");
        int index = input.nextInt();
        if(index<size&& index>=0){
            System.out.println("Enter the data:");
            int data = input.nextInt();
            arr[index] = data;
        }
        else{
            System.out.println("index out of range because index is greater than size");
        }
    }
}
