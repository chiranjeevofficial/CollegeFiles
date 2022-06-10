/*  Write c++ programs that illustrate how the Hierarchical level inheritance are supported:
    D) Hierarchical inheritance
*/
//D. Hierarchical Inheritance: In this type of inheritance, more than one sub class is inherited from a single base class.
// Hierarchical Inheritance
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

class Car: public Vehicle
{

};

class Bus: public Vehicle
{

};

int main()
{
	Car obj1;
	Bus obj2;
	getch();
	return 0;
}
