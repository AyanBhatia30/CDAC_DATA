#include<iostream>
using namespace std;
int main()
{
   int i = 2;
   int num = 0;


   for( ; ; )
   {
        cout<<"\n i = "<<i;
        i++;
        if(i>5) break;

   }


   cout<<"\n outside loop i = "<<i;
   return 0;
}
