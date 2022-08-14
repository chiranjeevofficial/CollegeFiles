/*8. Write c++ programs that illustrate how the single level inheritance are supported:
    A)single inheritance
*/
//A. Single Inheritance: In single inheritance a class is allowed to inherit from only one class
//Single level inheritance
#include <iostream>
#include<conio.h>
using namespace std;

class Vehicle
{
public:
	Vehicle()
	{
	cout << "This is a Vehicle\n" ;
	}
};

class Car: public Vehicle
{
public:
    Car()
    {
        cout << "This is a Car\n" ;
    }
};

int main()
{
	Car obj;
	getch();
	return 0;
}
