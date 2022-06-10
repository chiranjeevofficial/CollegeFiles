# 04. Write a python script to print greater between two numbers. Print number only once if both the numbers are same.
var1 = int(input("Enter 1st number: "));
var2 = int(input("Enter 2nd number: "));
if var1 > var2:
    print("%d is Greater"%(var1));
elif var2 == var1:
    print("%d Both are same"%(var1));
else:    
    print("%d is Greater"%(var2));
