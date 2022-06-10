//1. Write a c++ program to find the sum of individual digits of a positive integer.

#include <iostream>
#include<conio.h>
using namespace std;
int main()
{
    int n, sum=0;
    cout<<"Made By: Chiranjeev Kashyap\n";
    cout<<"Enter a number: ";
    cin>>n;
    if(n>0)
    {
        while(n)
        {
            sum+=n%10;
            n/=10;
        }
        cout<<"Sum of individual digits is: "<<sum;
    }
    else
        cout<<n<<" is non-positive integer";
    getch();
    return 0;
}
