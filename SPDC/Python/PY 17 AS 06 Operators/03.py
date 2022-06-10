# 03. Write a python script to find x^y, where values of x and y are given by user.
print("Calculate x^y: \nWhere x is Mantissa & y is Exponent");
man = int(input("Enter a mantissa part: "));
exp = int(input("Enter a exponent part: "));
print("%d^%d is: %d"%(man,exp,man**exp));
