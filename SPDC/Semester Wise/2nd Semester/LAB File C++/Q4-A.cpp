/*4. Write a program to demonstrate the
    A)operator overloading
*/
#include <iostream>
#include<conio.h>
using namespace std;
class Test
{
private:
    int num;
public:
    Test(): num(8){}
    void operator ++()
    {
        num = num+2;
    }
    void Print()
    {
        cout<<"The Count is: "<<num;
    }
};
int main()
{
    Test tt;
    ++tt;
    tt.Print();
    getch();
    return 0;
}
