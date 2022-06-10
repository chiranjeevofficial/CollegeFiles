#   08. Write a python script to calculate sum of digits of a given number.
n = int(input("Enter a number: "));
print("Sum of digit of %d is: "%(n),end="");
sum = 0;
while n:
    sum = sum + (n%10);
    n//=10;
print(sum);