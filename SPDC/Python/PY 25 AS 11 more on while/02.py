#   02. Write a python script to calculate sum of squares of first N natural numbers.
n = int(input("Enter a number: "));
print("Sum of square of first %d natural number is: "%(n),end="");
sum = 0;
while n:
    sum=sum+(n*n);
    n-=1;
print(sum);