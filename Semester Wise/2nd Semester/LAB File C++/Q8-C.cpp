/*	Write c++ programs that illustrate how the multi level inheritance are supported:
    C) Multilevel inheritance
*/
//C. Multilevel Inheritance: In this type of inheritance, a derived class is created from another derived class.
//Multilevel Inheritance
#include <iostream>
#include<conio.h>
using namespace std;

class Vehicle
{
public:
	Vehicle()
	{
	cout << "This is a Vehicle\n";
	}
};

class fourWheeler: public Vehicle
{ public:
	fourWheeler()
	{
	cout<<"Objects with 4 wheels are vehicles\n";
	}
};

class Car: public fourWheeler
{
public:
	Car()
	{
	cout<<"Car has 4 Wheels\n";
	}
};

int main()
{
	Car obj;
	getch();
	return 0;
}
