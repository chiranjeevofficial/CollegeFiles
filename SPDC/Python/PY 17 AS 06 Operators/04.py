# 04. Write a python script to swap data of two int variables.
print(">>> Swap two int variable data");
var1 = int(input("Enter 1st number: "));
var2 = int(input("Enter 2nd number: "));
print("Before Swaping:\na=%d & b=%d\n"%(var1,var2));
temp = var1;
var1 = var2;
var2 = temp;
print("After Swaping:\na=%d & b=%d\n"%(var1,var2));
