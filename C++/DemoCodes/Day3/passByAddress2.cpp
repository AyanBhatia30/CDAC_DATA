#include<iostream>
using namespace std;

int *fun();

int main()
{
    int *ptr;

    ptr = fun();
    cout<<"\n *ptr = "<<*ptr;
    return 0;
}

int *fun()
{

    int var = 67;

    return &var;
}
