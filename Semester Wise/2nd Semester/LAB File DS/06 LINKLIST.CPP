#include<iostream.h>
#include<conio.h>
struct Node{
    int data;
    struct Node*next;
};
struct Node*head=NULL;
void insert(int new_data){
struct Node*new_node=(struct Node*)malloc(sizeof(struct Node));
new_node->data=val;
new_node->next=top;
top=newnode;
}
void pop(){
if(top==NULL)
cout<<"Stack Underflow"<<endl;
else{
cout<<"The popped element is"<<top->data<,endl;
top=top->next;
}
}
void display(){
struct Node*p;
if(top==NULL)
cout<<"stack is empty";
else{
p=top;
cout<<"stack elements are:";
while(p!=NULL){
cout<<p->data<<" ";
p=p->next;
}
}
cout<<endl;
}
void main(){
  int ch,val;
  cout<<"1) push in stack"<<endl;
  cout<<"2) pop from stack"<<endl;
  cout<<"3) Display stack"<<endl;
  cout<<"4) Exit"<<endl;
  do{
  cout<<"enter choice:"<<endl;
  cin<<ch;
  switch(ch){
case 1:{
  cout<<"enter value to be pushed:"<<endl;
  cin>>val;
  push(val);
  break;
  }
case 2:{
pop();
break;
}
case 3:{
display();
break;
}
case 4:{
cout<<"exit"<<endl;
break;
}
default:{
cout<<"invalid choice"<<endl;
}
}
}while(ch!=4);
getch();
}