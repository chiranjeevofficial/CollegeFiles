#   05. Write a python script to calculate sum of first N even natural numbers.
n = int(input("Enter a number: "));
print("Sum of first %d Even natural number is: "%(n),end="");
sum = 0;
while n:
    sum = sum + (2*n);
    n-=1;
print(sum);