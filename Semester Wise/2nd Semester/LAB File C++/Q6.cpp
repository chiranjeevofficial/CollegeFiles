//6. Write a program to demonstrate friend function and friend class.
#include <iostream>
#include<conio.h>
using namespace std;

class integer
{
private:
    int a, b, d1;
    friend class F_integer;

public:
    integer() : d1(10) {}
    void set_value(int a1, int b1)
    {
        a=a1;
        b=b1;
    }
    friend int mean(integer);
};

class F_integer
{
private:
    int d2;
public:
    F_integer() : d2(5) {}

    int multiply()
    {
        integer m;
        return m.d1*d2;
    }
};

int mean(integer s)
{
    return int(s.a+s.b)/2.0;
}

int main() {
    F_integer n;
    cout<<"Multiplication: "<<n.multiply();
    integer c;
    c.set_value(15,30);
    cout<<"\nMean value:"<<mean(c);
    getch();
    return 0;
}
