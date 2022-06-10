#   06. Write a python script to calculate factorial of a number.
n = int(input("Enetr a number: "));
print("Factorial of %d is: "%(n),end="");
fact = 1;
while n:
    fact = fact * n;
    n-=1;
print(fact);