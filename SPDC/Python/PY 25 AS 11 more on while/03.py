#   03. Write a python script to calculate sum of cubes of first N natural numbers.
n = int(input("Enter a number: "));
print("Sum of cubes of first %d natural number is: "%(n),end="");
sum = 0;
while n:
    sum = sum + (n*n*n);
    n-=1;
print(sum);