#include<iostream.h>
#include<conio.h>
int top=-1,stack[20],n=4;
void push (int val)
{
if(top>=n-1)
cout<<"stack overflow"<<endl;
else
{
top++;
stack[top]=val;
}
}
void pop()
{
if (top<=-1)
cout<<"stack overflow"<<endl;
else
{
cout<<"pop out element is :"<<stack[top]<<endl;
top--;
}}
void display()
{
if (top>=0)
{
cout<<"stack element are :";
for(int i =top;i>=0;i--)
cout<<stack[i]<<endl;
}
else
{
cout<<"stack empty:";
}
}
void main ()
{
clrscr();
int val,ch;
cout<<"1.push in stack:"<<endl;
cout<<"2.pop from stack:"<<endl;
cout<<"3.display stack:"<<endl;
cout<<"4.exit"<<endl;
do
{
cout<<"enter choice :";
cin>>ch;
switch(ch)
{
case1:
{
cout<<"enter value to be pushed :"<<endl;
cin>>val;
push(val);
break;
}
case2:
{
pop();
break;
}
case3:
{
display();
break;
}
case4:
{
cout<<"exit";
break;
}
default:
{
cout<<"invalid choice";
}
}
}
while (ch!=4);
}


