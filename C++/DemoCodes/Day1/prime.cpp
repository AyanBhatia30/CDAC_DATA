#include<iostream>
using namespace std;
int main()
{
   int num,i;
   cout<<"\n Enter a number :";
   cin>>num;                              // 11
   for(i=2 ;i<num ;i++)
   {
       if((num %i) == 0)  break;

   }
   if(num == i)
    cout<<"\nPrime "<<num;
   else
    cout<<"\n Not Prime "<<num;
   return 0;
}
