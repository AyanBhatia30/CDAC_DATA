#include<iostream>
using namespace std;
int main()
{

     char str[15];
     int i;
     /*cout<<"\n Enter a String :";
     cin>>str;
     */
     str[0] = 'I';
     str[1] ='E';
     str[2] = 'T';
     str[3] = 'P';
     str[4] = '\0';

     for(i=0;str[i]!='\0';i++)
        cout<<"\n"<<str[i];

     return 0;

}
