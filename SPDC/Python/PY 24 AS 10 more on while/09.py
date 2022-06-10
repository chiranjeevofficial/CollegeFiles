#   09. Write a python script to print table of user choice.
n = int(input("Enter a number: "));
i = 1;
while i<=10:
    print("%d x %d = %d"%(n, i, i*n));
    i+=1;