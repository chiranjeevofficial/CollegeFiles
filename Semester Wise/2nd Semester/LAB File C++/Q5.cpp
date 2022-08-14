//5. Write a program to demonstrate the inline function.
#include<iostream>
#include<conio.h>
using namespace std;
inline int expo(int n, int p)
{
    int s=1, i;
    for(i=p;i>0;i--)
    {
        s*=n;
    }
    return s;
}
int main()
{
    int n, p;
    cout<<"Enter the number & exponentiation {like n^P(2^2=4)}: \n";
    cin>>n>>p;
    cout<<"Exponentiation of "<<n<<" is: "<<expo(n,p);
    getch();
    return 0;
}
