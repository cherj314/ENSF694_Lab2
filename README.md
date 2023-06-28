# ENSF694_Lab2

Q1. (10 + 10 = 20 marks)
Implement the linear search algorithm and the interpolation algorithm (either iterative or
recursive) for an integer array and search for a key in the array. Prompt the user for all inputs.

Q2. (5 marks)
Compare their running times and show them. Which one performed better and why?

Linear
Search key FOUND at index 2.
Run time is 186841 Nanoseconds

Interpolation
Search key FOUND at index 1.
Run time is 1566369 Nanoseconds

Linear performed better because the search key is found near the beginning of the array and there is no sorting and less 
steps required when compared to interpolation.

Q3 (5 marks)
Try to improve the running time of the linear search by at least 20% and explain your logic.

Linear with attempt to improve speed.
Search key FOUND at index 2.
Run time is 229182 Nanoseconds

My logic here was by skipping every second value that the linear search would perform faster, but it actually took longer. 
This also has the flaw of missing all the odd index values in the list. 
