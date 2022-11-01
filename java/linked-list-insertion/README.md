# Challenge Summary
make methods which can insert a value at the end of a list, a method to insertAfter a given value is found in an index, and a method before the given value.

## Whiteboard Process
wasn't sure if this was necisary as it wasn't required in our last lab???
![Visualization](null (2).png)

## Approach & Efficiency
I took the approach to add to an arraylist of integers. This is not the most efficient way to accomplish it as java has a great linked-list built in method but this was the best way i could come up with without using these built in methods.

## Solution
for append I just took the existing list and added our node to the end of the list with the .add function
for insert before the method loops through the list unilt the value is found, then we get that index and and shift the list 1 index over in a positive transformation.
the same principles used in the method insert before are used here in insert after with the exception that it set the current place value to the value and will cast the order after that to a new array and return that.
