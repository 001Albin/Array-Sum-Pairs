
Array Pair Sum
A simple Java program to find all pairs in an array whose sum equals a given target. 
The program takes an array of integers as input, sorts it, and efficiently identifies pairs using a two-pointer technique.

Features
+ Input validation for array size and elements.
+ Supports arrays with up to 100 elements.
+ Efficient O(n log n) solution using sorting and two pointers.
+ Displays all pairs and counts the total number of pairs.
+ Handles edge cases, including no matching pairs


Example Output

Input
+ Enter the array size (size should <=100): 
+ 6
+ Enter the elements: 
+ 3 4 5 6 7 8
+ Enter the sum required: 
+ 10

Output:
+ Sorted Array: 3 4 5 6 7 8
+ Pair: 3 and 7
+ Pair: 4 and 6
+ Total Pairs: 2

How It Works
+ Sorting: The array is sorted using Arrays.sort().
+ Two-Pointer Technique:
+ One pointer starts at the beginning (i).
+ The other starts at the end (j).
+ The sum of elements at i and j is compared to the target:
+ If equal, a pair is found, and both pointers move.
+ If greater, decrement j.
I>f smaller, increment i.
