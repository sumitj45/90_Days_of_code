<br>
#Arrays
<br/>

## Day 1
>[C++ program to reverse an array](https://github.com/sumitj45/90_Days_of_code/edit/main/Array.java)

class Array{
 static void reverseArray(int[] arr , int start , int end){
   int  temp;

 while(start<end){
     temp=arr[start];
     arr[start]=arr[end];
     arr[end]=temp;
     start++;
     end--;
 }
 }

 static void printArray(int[] arr , int size){
for(int i = 0; i<size;i++){
    System.out.print(arr[i]+" ");
   
}
System.out.println();

 }

 public static void main(String[] args){
     int[] arr={4,5,6,7,8,9};
     printArray(arr, 5);
     reverseArray(arr, 0, 4);
     System.out.print("After reversing a array..\n");
    printArray(arr, 5);

    //diff APPROACH 
    System.out.println("Original Array");
     int[] arr2 ={1,2,3,4,5};
    
     for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
     }
     System.out.println();
     System.out.println("After reversing..");
     for(int i= arr2.length-1;i>=0;i--){

         System.out.print(arr2[i]+" ");
     }
    


 }



}
