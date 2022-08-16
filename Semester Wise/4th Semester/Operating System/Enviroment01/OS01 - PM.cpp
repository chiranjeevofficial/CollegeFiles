#include<stdio.h>
#include<conio.h>
main()
{
    int bt[20], wt[20], tat[20], i, n;
    float wtavg, tatavg;
    printf("Enter the number of processes: ");
    scanf("%d",&n);
    printf("\n");
    for(i=0;i<n;i++)
    {
        printf("Enter Burst Time for Process P%d: ", i);
        scanf("%d",&bt[i]);
    }
    wt[0] = wtavg = 0;
    tat[0] = tatavg = bt[0];
    for(i=1;i<n;i++)
    {
        wt[i] = wt[i-1] +bt[i-1];
        tat[i] = tat[i-1] +bt[i];
        wtavg = wtavg + wt[i];
        tatavg = tatavg + tat[i];
    }
    printf("\n\t PROCESS \tBURST TIME \t WAITING TIME\t TURNAROUND TIME");
    for(i=0;i<n;i++)
        printf("\n\t P%d \t\t %d \t\t %d \t\t %d", i, bt[i], wt[i], tat[i]);
    printf("\n\nAverage Waiting Time: %0.2f", wtavg/n);
    printf("\nAverage Turnaround Time: %0.2f", tatavg/n);
    getch();
}
