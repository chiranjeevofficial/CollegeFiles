#   07. Write a python script to count digits in a given number.
n = int(input("Enter a number: "));
print("Number %d have "%(n),end="");
cnt = 0;
while n:
    n=n//10;
    cnt+=1;
print("%d digit"%(cnt));