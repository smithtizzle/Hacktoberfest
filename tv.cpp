#include<iostream>
using namespace std;
class tv
{
	private : int unit, price, total;
	public : void accept();
		 void calculate();
		 void display();

}s;

inline void tv :: accept()
{
	cout<<"Enter the unit and price";
	cin>>unit>>price;

	}
inline void tv :: calculate()
{
	total=unit*price;
}
inline void tv :: display()
{
	cout<<"unit is "<<unit<<endl<<"price is "<<price<<endl<<"Total Amount is "<<total;
	}

int main()
{
	s.accept();
	s.calculate();
	s.display();
}