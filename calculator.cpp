#include<iostream>
using namespace std;
class calculator
{
public : float a, b, c;
 char op;
public : void accept();
 float operation();
 void display();
}s;
inline void calculator :: accept()
{
cout<<"Enter the two numbers";
cin>>a>>b;
cout<<"Enter the operator";
cin>>op;
}
inline float calculator :: operation()
{
switch(op)
{ case '+' : c=a+b;
break;
case '-' : c=a-b;
break;
case '*' : c=a*b;
break;
case '/' : if(b==0)
{ cout<<"Input Error"; }
 else
{ c=a/b;}
break;
case '^' : cout<<"Square of first number will be performed"
<<endl;
 c=a*a;
break;
}
}
inline void calculator :: display()
{
cout<<"Result is "<<c<<endl;
}
int main()
{
char e;
do
{ s.accept();
s.operation();
s.display();
cout<<"Do you want to perform another operation(y/n)";
cin>>e;
}
while(e=='y');
cout<<"END";
}