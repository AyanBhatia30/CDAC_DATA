#include<iostream>
using namespace std;

int sum(int,int);
int sum(int,int,int);
float sum(float,float);
float sum(float,float,float);
float sum(int,float);

int main()
{
    cout<<"\n 2 int "<<sum(23,34);
    cout<<"\n 3 int "<<sum(23,34,10);
    cout<<"\n 2 float "<<sum(23.5f,34.7f);
    cout<<"\n 3 float "<<sum(23.6f,34.9f,10.2f);
    cout<<"\n 1 int 1 float "<<sum(23,33.75f);
    return 0;
}


int sum(int a,int b)
{
    return a+b;
}

int sum(int a,int b,int c)
{
    return a + b + c;
}
float sum(float a,float b)
{
    return a + b;
}
float sum(float a,float b,float c)
{
    return a+b+c;
}
float sum(int a,float b)
{
    return a + b;
}
