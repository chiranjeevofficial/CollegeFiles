#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
int myarr[10]={12,4,3,1,15,23,22,10,2,17};
cout<<"\nInput list is\n";
for(int i=0;i<10;i++)
{
cout<<myarr[i]<<"\t";
}
for(int k=1;k<10;k++)
{
int temp=myarr[k];
int j=k-1;
while(j>=0 && temp<=myarr[j])
{
myarr[j+1]=myarr[j];
j=j-1;
}
myarr[j+1]=temp;
}
cout<<"\n sorted list is\n";
for(i=0;i<10;i++)
{
cout<<myarr[i]<<"\t";
}
getch();
}