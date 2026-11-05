#include<iostream>
using namespace std;


class base{
    protected:
       int i;

   public:
       base() { cout<<"\n default constructor of base";i = 0;}
       base(int d) { cout<<"\n param constructor of base";i = d;}
       ~base() {cout<<"\n destructor of base";}
       void display_i() {cout<<"\n i = "<<i;}

};

class derived :public base {

   int j;
   private :
   public:
       derived() { cout<<"\n default constructor of derived";j = 0;}
       derived(int d) { cout<<"\n param constructor of derived";j = d;}
       derived(int n, int m) : base(n)
       { cout<<"\n 2 param constructor of derived";
         j = m;}
       ~derived() {cout<<"\n destructor of derived";}
       void display_j() {cout<<"\n j = "<<j;}

};

int main()
{
    derived obj(2,3);
    obj.display_i();
    obj.display_j();
    return 0;
}
