#include"emp.h"
#include<string.h>
#include<iostream>
using namespace std;
emp::emp()
{
	empno=0;
	bsal=0.0;name=new char[3];
	
	strcpy(name,"NA");
	cout<<"emp - Default Constructor is called"<<endl;
}

emp::emp(int en,char *nm,float sal)
{
	empno=en;
	name=new char[strlen(nm)+1];
	strcpy(name,nm);
	bsal=sal;
	cout<<"emp - Parameterized Constructor is called"<<endl;
}

void emp::fun()
{
	cout<<"\nJust to check other functions"<<endl<<endl;
}

emp::~emp()
{
 	delete []name;
	cout<<"emp - Destructor is called"<<endl;
}


float emp::cal_sal()
{
	return -999.99;
}
