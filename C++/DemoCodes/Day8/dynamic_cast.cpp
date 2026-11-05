#include <iostream>
#include <typeinfo> // Header for typeid operator
using namespace std;

// Base class
class MyBase {
  public:
    virtual void Print() {
        cout << "Base class" << endl;
    }

};

// Derived class
class MyDerived : public MyBase {
  public:
    void Print() {
        cout << "Derived class" << endl;
    }
    void fun()
    {
    	cout<<" \nfun of MyDerived is called..";
	}
};

int main()
{
    // Using typeid on custom types for RTTI
    MyBase* b1 = new MyBase();
    MyBase* d1 = new MyDerived();

    MyBase* ptr1;
    ptr1 = d1;

    cout << typeid(*b1).name() << endl;
    cout << typeid(*d1).name() << endl;
    cout << typeid(*ptr1).name() << endl;

    if ( typeid(*ptr1) == typeid(MyDerived) ) {
       cout << "\n Inside if - Ptr1 has MyDerived object" << endl;
       //ptr1->fun();  will not work because compile time type is MyBase
    }

    // Using dynamic_cast for RTTI
    MyDerived* ptr2 = dynamic_cast<MyDerived*> ( d1 );
    /* here d1 compile time type is MyBase and run-time type is MyDerived so, the conversion is success*/
    cout<<"\n ptr2 = "<<ptr2;
    if ( ptr2 ) {
       cout << "\nPtr2 has MyDerived object" << endl;
       ptr2->fun();
    }

	return 0;
}
