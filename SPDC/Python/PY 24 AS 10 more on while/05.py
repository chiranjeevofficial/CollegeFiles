#   05. Write a python script to print first N even natural numbers.
n = int(input("Enter a number: "));
i = 1;
while i<=n:
    print(2*i,end=" ");     #General term is: 2n
    i+=1;