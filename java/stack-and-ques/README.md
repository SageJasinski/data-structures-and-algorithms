# Stacks and Queues
a stack and qu class for the Node class

## Challenge
push
  - Arguments: value
  - adds a new node with that value to the top of the stack with an O(1) Time performance.
pop
  - Arguments: none
  - Returns: the value from node from the top of the stack
  - Removes the node from the top of the stack
  - Should raise exception when called on empty stack
peek
  - Arguments: none
  - Returns: Value of the node located at the top of the stack
  - Should raise exception when called on empty stack
is empty
  - Arguments: none
  - Returns: Boolean indicating whether or not the stack is empty.

## Approach & Efficiency
each method manipulates the data and next properties on each instantiared node class.
for que the method will manipulate either the top or the tail of the node.

## API
no api was used
