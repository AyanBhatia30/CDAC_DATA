#include<iostream>
using namespace std;

int var;   // global


class Demo{
   int var;

   public :
       Demo()
       {
           var = 500;
       }

       void display()
       {
           int var = 15;
           cout<<"\n var = "<<var;
           cout<<"\n Another var = "<<this->var;
           cout<<"\n Another var = "<<::var;
           ::var = 7000;
       }


};
int main()
{
    int var = 50;
    cout<<"\n Var = "<<var;
    ::var = 5000;
    Demo obj;
    obj.display();
    cout<<"\n"<<::var;
    return 0;
}
