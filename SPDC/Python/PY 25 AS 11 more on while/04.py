#   04. Write a python script to calculate sum of first N odd natural numbers.
n = int(input("Enter a number: "));
print("Sum of first %d Odd natural number is: "%(n),end="");
sum = 0;
while n:
    sum = sum + 2*n-1;
    n-=1;
print(sum);