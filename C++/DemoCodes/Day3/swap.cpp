
#include<iostream>
using namespace std;

void mySwap(int *, int *);

int main()
{

    int n1 = 15, n2 = 25;
    cout<<"\n Before swap : n1 = "<<n1<<"  n2 = "<<n2;
    mySwap(&n1, &n2);
     cout<<"\n Before swap : n1 = "<<n1<<"  n2 = "<<n2;
     return 0;
}

void mySwap(int *a, int *b)
{
    int t;
    t = *a;
    *a = *b;
    *b = t;
}
