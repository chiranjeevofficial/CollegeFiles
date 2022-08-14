/*4. Write a program to demonstrate the
    B) function overloading.
*/
#include <iostream>
#include<conio.h>
using namespace std;
class Cal
{
public:
    static int add(int a,int b)
    {
        return a + b;
    }
    static int add(int a, int b, int c)
    {
        return a + b + c;
    }
};
int main()
{
    Cal C;  //class object declaration.
    cout<<C.add(10, 20)<< endl;
    cout<<C.add(12, 20, 23)<< endl;
    getch();
    return 0;
}
