# 05. Write a python script to print two given words in dictionary order.
print("Enter two words: ");
str1 = input("Enter 1st word: ");   #Aman
str2 = input("Enter 2nd word: ");   #Amit
if str1<str2:
    print(str1, str2);
else:
    print(str2, str1);