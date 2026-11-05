#include<iostream>
using namespace std;

int main()
{
    int num1 = 10, num2 = 50;
    int *ptr = &num2;

    cout<<"\n num1 = "<<num1;
    cout<<"\n &num1 = "<<&num1;
    cout<<"\n &num2 = "<<&num2;
    cout<<"\n ptr = "<<ptr;
    cout<<"\n *ptr = "<<*ptr;
    cout<<"\n &ptr = "<<&ptr;
    ptr = ptr + 1;
    cout<<"\n ptr = "<<ptr;
    cout<<"\n *ptr = "<<*ptr;
    cout<<"\n &ptr = "<<&ptr;
    return 0;
}
