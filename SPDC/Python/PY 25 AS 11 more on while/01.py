#   01. Write a python script to calculate sum of first N natural numbers.
#   Sum of n natural number is: (n^2+n)/2
#   Solutin-01
n = int(input("Enter a number: "));
sum = 0;
print("Sum of first %d Natural Number is: "%(n),end="");
while n:
    sum=sum+n;
    n-=1;
print(sum);

#   #solution-02
#   n = int(input("Enter a number: "));
#   temp = n;
#   sum = 0;
#   while n:
#       sum = sum+n;
#       n-=1;
#   print("Sum of first %d Natural Number is: %d"%(temp,sum));

#   with the help of formula
#   print("Sum of first %d Natural Number is: %d"%(n, (n*n+n)/2))