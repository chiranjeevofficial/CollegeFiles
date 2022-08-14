/*	Write c++ programs that illustrate how the Multiple inheritance are supported:
	B)multiple inheritance
*/
//B. Multiple Inheritance: Multiple Inheritance is a feature of C++ where a class can inherit from more than one classes.
// Multiple level inheritance
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

class FourWheeler
{
public:
	FourWheeler()
	{
	cout << "This is a Four wheeler Vehicle\n";
	}
};

class Car: public Vehicle, public FourWheeler
{

};

int main()
{
	Car obj;
	getch();
	return 0;
}
