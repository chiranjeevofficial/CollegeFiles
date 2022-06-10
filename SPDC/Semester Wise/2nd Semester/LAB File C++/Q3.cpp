/*3. Write a program to implement a class student having following members:
    data members
        sname: name of the student
        marks array: marks of the student
        total: total marks obtained
        tmax: total maximum marks
    member functions
        assign()  : assign initial values
        compute() : to compute total
        average display(): to display the data
*/

#include <iostream>
#include<conio.h>
using namespace std;
void inputdata(void);
void printdata(void);
float  compute(void);
float avg_display(void);
class student{
    private:
    char sname[20];
    float marks[5], Tmarks=0.0, Tmax=500.0;

    public:
    void inputdata(void)
    {
        cout<<"Enter Student name: ";
        gets(sname);
        cout<<"Enter "<<sname<<" 5 subject marks: \n";
        for(int i=0;i<5;i++)
        {
            cin>>marks[i];
        }
    }

    void printdata(void)
    {
        cout<<"\nStudent Name is: "<<sname;
        cout<<"\nStudent Secured Marks is: \n";
        for(int i=0;i<5;i++)
        {
            cout<<i+1<<" Subject Marks: "<<marks[i]<<"\n";
        }
        //cout<<"\n Total Marks is: "<<compute();
    }

    float compute(void)
    {
        return marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
    }

    float avg_display(void){
        return compute()/5;
    }
};

int main()
{
    class student s1;
    cout<<"Made By: Chiranjeev Kashyap\n";
    s1.inputdata();
    s1.printdata();
    s1.compute();
    cout<<"Average is: "<<s1.avg_display();
    getch();
    return 0;
}
