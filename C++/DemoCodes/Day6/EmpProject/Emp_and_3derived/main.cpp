#include"emp.h"
#include"manager.h"
#include"clerk.h"
#include<iostream>
using namespace std;

int main()
{
   emp *e1=new manager(10,"Janhavi",55000.00,15000.00);
   cout<<"Total Salary pointer of emp pointing to manager = "<<e1->cal_sal()<<endl<<endl;

   emp *e2=new clerk(20,"Sonal",20000,2);
   cout<<"Total Salary pointer of emp pointing to clerk = "<<e2->cal_sal()<<endl<<endl;
   delete e1;
   delete e2;




return 0;
}
