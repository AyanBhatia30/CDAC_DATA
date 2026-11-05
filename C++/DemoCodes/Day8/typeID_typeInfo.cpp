#include <iostream>
#include <typeinfo>
using namespace std;

class Base {};
class Derived : public Base {};


typedef int my_int_type;

int main() {
      cout << "int vs my_int_type: ";
   cout << ( typeid(int) == typeid(my_int_type) ) << '\n';

   cout << "Base vs Derived: ";
   cout << ( typeid(Base)==typeid(Derived) ) << '\n';

   Base* pbase = new Derived;

   cout << "Base vs *pbase: ";
   cout << ( typeid(Base)==typeid(*pbase) ) << '\n';



   return 0;
}
