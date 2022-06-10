#   04. Write a python script to print first N odd natural numbers in reverse order.
n = int(input("Enter a number: "));
while n>=1:
    print(2*n-1,end=" ");
    n-=1;