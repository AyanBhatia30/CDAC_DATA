#include"clerk.h"
#include<string.h>
#include<iostream>
using namespace std;

clerk::clerk()
{
	overtime=0;
	cout<<"clerk - Default constructor is called"<<endl;
}
clerk::clerk(int en,char *nm,float sal,int ovt):emp(en,nm,sal)
{
	overtime=ovt;
	cout<<"clerk - Parameterized constructor is called"<<endl;
}
clerk::~clerk()
{
	cout<<"\nclerk - Destructor is called"<<endl;
}
float clerk::cal_sal()
{
	return bsal+(overtime*500);
}

