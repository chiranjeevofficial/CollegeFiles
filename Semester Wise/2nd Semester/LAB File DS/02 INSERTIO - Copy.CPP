#include<iostream.h>
#include<conio.h>
void main(){
clrscr();
int i,n,pos,arr[20];
cout<<"enter the size of array:";
cin>>n;
cout<<"enter the element:";
for(i=0;i<=n;i++)
{
cin>>arr[i];
}
cout<<"Array after insertion:\n";
for(i=0;i<=n;i++)
{
cout<<arr[i]<<" "<<endl;

}
/*deletion in a specific position*/
cout<<"enter the position:";
cin>>pos;
if(pos>=n+1)
cout<<"\nDeletion not possible:\n";
else{
for(i=pos;i<n;i++)
arr[i]=arr[i+1];
}
cout<<"Array after deletion:";
for(i=0;i<n;i++)
cout<<arr[i]<<" ";
getch();
}
