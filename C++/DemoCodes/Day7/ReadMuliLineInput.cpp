#include<iostream>
using namespace std;
int main()
{
    char str[120];
    cin.read(str,120); //reads till ^z
    cout<<str;
    int cnt = 0,i;
    while(str[i]!='\0')
    {
        if(str[i]=='a')  cnt++;
        i++;
    }
    cout<<"\n "<<cnt;
    return 0;

}
