#include<iostream>
using namespace std;


class base{


   public:
       base() { cout<<"\n default constructor of base";}//i = 0;}
       base(int d) { cout<<"\n param constructor of base";}//i = d;}
       virtual ~base() {cout<<"\n destructor of base";}
      // void display_i() {cout<<"\n i = "<<i;}
       virtual void fun() =0;


};

class derived :public base {


   public:
       derived() { cout<<"\n default constructor of derived";}//j = 0;}
       derived(int d) { cout<<"\n param constructor of derived";}//j = d;}
       derived(int n, int m) : base(n)
       { cout<<"\n 2 param constructor of derived";
         }
       ~derived() {cout<<"\n destructor of derived";}
       void fun()                               // function overriding
       {
           cout<<"\n\n fun of derived is called..";
       }

};

class derived1 :public derived {


   public:
       derived1() { cout<<"\n default constructor of derived1";}//j = 0;}
       derived1(int d) { cout<<"\n param constructor of derived1";}//j = d;}
       derived1(int n, int m)// : base(n)
       { cout<<"\n 2 param constructor of derived1";
         }
       ~derived1() {cout<<"\n destructor of derived1";}
       void fun()                               // function overriding
       {
           cout<<"\n\n fun of derived1 is called..";
       }

};


int main()
{

    cout<<"\n "<<sizeof(base);
    cout<<"\n "<<sizeof(derived);
    base *obj = new derived();
    obj->fun();
    delete obj;

    base *ptr = new derived1();
    ptr->fun();
    delete ptr;

  /*  base obj;
    obj.fun();*/
    return 0;
}
