# Lab 10: Stack and Queue

## Stacks and Queues
Implementing a Stack and a Queue Data Structure

### Challenge
1. Creating a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
2. Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
3. Defining a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
4. Defining a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.

### Approach & Efficiency
All test passed.

### API
1. Insert methods takes a int value, creates a new node and assign the value . <br/>
   insert(int value) .    
2. Includes methods takes a int value and returns a boolean . <br/>
   includes(int value) . 
3. Print methods does not take any value, returns a Arraylist will all the values in the linkedlist . <br/>
   print() . 

### Reference
https://www.youtube.com/watch?v=SMIq13-FZSE

