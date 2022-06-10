#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
int i,arr[10],num,first,last,mid;
cout<<"enter 10 elements(in ascending order):";
for(i=0;i<10;i++)
cin>>arr[i];
cout<<"\nEnter element to be search:";
cin>>num;
first=0;
last=9;
mid=(first+last)/2;
while(first<=last)
{
if(arr[mid]<num)
first=mid+1;
else if(arr[mid]==num)
{
cout<<"\n The number, "<<num<<" is found at position "<<mid+1;
break;
}
else
last=mid-1;
mid=(first+last)/2;
}
if(first>last)
cout<<"\nThe number,"<<num<<" is not found in given array";
cout<<endl;
getch();
}