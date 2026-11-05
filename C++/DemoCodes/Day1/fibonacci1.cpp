#include<iostream>
using namespace std;
int main()
{
    int t1, t2, t3, t4, i,n;
    cout<<"Enter terms :";
    cin>>n;
    t1 = 0;
    t2 = 1;
    t3 = 1;
    cout<<" "<<t1<<"  "<<t2<<"  "<<t3;           //0 1 1 2 4 7
    for(i=4 ; i<=n ;i++)
    {
        t4 = t1 + t2 + t3;
        cout<<"   "<<t4;
        t1 = t2;
        t2 = t3;
        t3 = t4;
    }
    return 0;
}
