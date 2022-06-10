#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct Node
{
   int data;
   struct Node *next;
};
struct Node* head = NULL;
void insert(int new_data)
{
   struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
   new_node->data = new_data;
   new_node->next = head;
   head = new_node;
}
void display()
{
   struct Node* ptr;
   ptr = head;
   while (ptr != NULL)
    {
        printf("%d ",ptr->data);
        ptr = ptr->next;
    }
}
void main()
{
   insert(7);
   insert(4);
   insert(9);
   insert(8);
   insert(6);
   printf("The linked list is: \n");
   display();
   getch();
}
