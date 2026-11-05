#include<iostream>
using namespace std;
int main()
{
    int num = 20;
    int *ptr = new int;
    *ptr = 10;
    cout<<"\n ptr = "<<ptr;
    cout<<"\n &num = "<<&num;
    cout<<"\n *ptr = "<<*ptr;
    delete ptr;
    return 0;
}
