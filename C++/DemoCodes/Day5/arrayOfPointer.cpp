#include<iostream>
using namespace std;

int main()
{
    int a = 9, b = 10, c = 22;
    int *ptr[3] = {&a, &b, &c};
    cout<<"ptr = "<<ptr;
    cout<<"&ptr[0] ="<<&ptr[0];
    for(int i = 0;i<3;i++)
    {
        cout<<"\n"<<*ptr[i];
    }
    return 0;

}
