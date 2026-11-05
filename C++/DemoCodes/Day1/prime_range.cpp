#include<iostream>
using namespace std;
int main()
{
   int num,num1,num2,i;
   cout<<"\n Enter range :";
   cin>>num1;
   cin>>num2;
  // for(num =  num1 ; num <= num2 ;num++)
   while(num1 <= num2)
   {
      for(i=2 ;i<num1 ;i++)
      {
         if((num1 %i) == 0)  break;

      }
       if(num1 == i)
           cout<<"  "<<num1;

     num1++;
   }
   return 0;
}
