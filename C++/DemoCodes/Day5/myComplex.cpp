#include<iostream>
using namespace std;

class myComplex {
   int real, imag ;

   public:
       myComplex()
       {
           cout<<"\n Default constructor.";
           real = imag = 0;
       }
       myComplex(int r, int i)
       {
           cout<<"\n Paramter constructor.";
           real = r;  imag = i;
       }
       ~myComplex()
       {
           cout<<"\n Destructor is called..";
       }
       void display()
       {
           cout<<"\n( "<<real<<" + "<<imag<<"i ) \n";
       }
       myComplex operator +(myComplex &c)
       {
           myComplex temp;
           temp.real = real + c.real;
           temp.imag = imag + c.imag;
           return temp;
       }
       myComplex operator +=(myComplex &c)
       {

           real = real + c.real;
           imag = imag + c.imag;
           return *this;
       }
       bool operator ==(myComplex c)
       {
           if((real == c.real)  && (imag==c.imag))
              return true;
           else
            return false;
       }
};



int main()
{
    myComplex c1(3,4);
    myComplex c2(2,2);
    myComplex c3;
    c1.display();
    c2.display();

    c3 = c1 + c2;    // c1.operator+(c2)
    c3.display();

    c3 = c1 += c2;
    c1.display();
    c3.display();

    if(c1 == c3)     // c1.operator==(c2)
    {
        cout<<"\nsame";
    }
    else
    {
        cout<<"\ndifferent";
    }
    return 0;

}


/*class myInt {
    int *ptr;

public:
   myInt()
   {
      ptr = new int;
     *ptr = 0;
   }
   myInt(int i)
   {
       ptr = new int;
       *ptr= i;
   }
  ~myInt()
  {
    delete ptr;
  }

  void display()
  {
     ..
  }
  overload operators     +, -, *, /, +=, -=, *=, /=, %, %=, >, <, >=, <=, ==, !=, &, <<, >>, ++, -- etc.


  obj++;
  ++obj;

  myInt operator++()


  myInt operator++(int p)

*/
