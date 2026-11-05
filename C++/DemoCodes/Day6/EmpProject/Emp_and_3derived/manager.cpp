#include"manager.h"
#include<string.h>
#include<iostream>
using namespace std;

manager::manager()
{
	bonus=0.0;
	cout<<"manager - Default constructor is called"<<endl;
}
manager::manager(int en,char *nm,float sal,float b):emp(en,nm,sal)
{
	bonus=b;
	cout<<"manager - Parameterized constructor is called"<<endl;
}
manager::~manager()
{
	cout<<"\nmanager - Destructor is called"<<endl;
}
float manager::cal_sal()
{
	return  bsal+bonus;
}

void manager::fun() {
			cout<<"\n Just to check in manager..";
		}
