#include<iostream>
using namespace std;

void calculate(int , int , int *, int *, int *);

int main()
{
    int n1 = 20, n2 = 15, ad, sub, mul;
    cout<<"\n size of int * = "<<sizeof(int *);
    cout<<"\n size of char * = "<<sizeof(char *);
    cout<<"\n size of short * = "<<sizeof(short *);
    cout<<"\n Address of ad = "<<&ad;
    cout<<"\n Address of sub = "<<&sub;
    cout<<"\n Address of mul = "<<&mul;
    calculate(n1,n2,&ad,&sub,&mul);
    cout<<"\n addition = "<<ad;
    cout<<"\n sub = "<<sub;
    cout<<"\n mul = "<<mul;
    return 0;

}

void calculate(int a, int b, int *sum, int *sub, int *m)
{
    cout<<"\n sum = "<<sum;
    cout<<"\n sub = "<<sub;
    cout<<"\n m = "<<m;
    *sum = a + b;
    *sub = a - b;
    *m = a * b;
}
