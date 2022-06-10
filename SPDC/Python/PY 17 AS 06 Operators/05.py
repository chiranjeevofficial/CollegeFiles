# 05. Write a python script which takes a three digit number from user and display only its middle digit.
var = int(input("Enter a number: "));
var = (var/10)%10;
print("Middle digit is: %d"%(var));