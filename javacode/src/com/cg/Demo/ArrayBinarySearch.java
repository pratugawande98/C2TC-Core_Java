package com.cg.Demo;
import java.util.Arrays;
public class ArrayBinarySearch {
// Main driver method
 public static void main(String[] args)
 {
     // Declaring and initializing byte arrays
     // to search over them
     byte byteArr[] = { 10, 20, 15, 22, 35 };
     char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
     
     // Using sort() method of Arrays class
     // and passing arrays to be sorted as in arguments
     Arrays.sort(byteArr);
     Arrays.sort(charArr);
    
     // Primitive datatypes
     byte byteKey = 35;
     char charKey = 'g';
     

     // Now in sorted array we will fetch and
     // return elements/indiciesaccessing indexes to show
     // array is really sorted

     // Print commands where we are implementing
     System.out.println(
         byteKey + " found at index = "
         + Arrays.binarySearch(byteArr, byteKey));
     System.out.println(
         charKey + " found at index = "
         + Arrays.binarySearch(charArr, charKey));
     
 }
}