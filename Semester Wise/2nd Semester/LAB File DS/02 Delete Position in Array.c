//2.	Write a program to delete in a specific position in the array.
#include<stdio.h>
#include<conio.h>
void main()
{
    int arr1[10],i,pos;
    printf("Input 10 elements in the array: \n");
    for(i=0;i<10;i++)
    {
        printf("Enter %2d element: ",i+1);
        scanf("%d",&arr1[i]);
    }

    printf("\nInput the position where to delete: ");
    scanf("%d",&pos);
    i=0;
    while(i!=pos-1)
        i++;
    while(i<10)
    {
        arr1[i]=arr1[i+1];
        i++;
    }
    printf("The new list is : ");
    for(i=0;i<10-1;i++)
    {
        printf(" %d",arr1[i]);
    }
    getch();
}
