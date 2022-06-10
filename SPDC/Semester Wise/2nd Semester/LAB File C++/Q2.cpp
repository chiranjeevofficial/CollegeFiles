//2. Write a c++ program to generate all the prime numbers between 1 and n, where n is a value supplied by the user.

#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int i, j, cnt, n, p=1;
    cout<<"Made By: Chiranjeev Kashyap\n";
    cout<<"Enter a number: ";
    cin>>n;
	for(i=1;i<n;i++)
    {
		if(i==1||i==0)
			continue;
		cnt=1;

		for(j=2;j<=i/2;++j)
        {
			if(i%j==0)
			{
				cnt=0;
				break;
			}
		}
		if(cnt==1)
        {
            if(p)
            {
                cout<<"Prime number between 1 to "<<n<<":\n";
                p=0;
            }
            cout<<" "<<i; //prime number print
        }
	}
	getch();
	return 0;
}
