//1.	Write a program to insert the element in the array.
#include<stdio.h>
#include<conio.h>
void main()
{
    int array[10], i;
    printf("Enter elements: \n");
    for(i=0;i<10;i++)
    {
        printf("Enter %2d element: ",i+1);
        scanf("%d",&array[i]);
    }
    getch();
}
