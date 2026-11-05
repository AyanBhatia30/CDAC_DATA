#include<iostream>
using namespace std;

class intArray {
   int len;
   int *arr;
   public:
       intArray()
       {
           cout<<"\n Default constructor ..";
           len = 5;
           arr = new int[len];
       }

       intArray(int l)
       {
           cout<<"\n parameter constructor..";
           len = l;
           arr = new int[len];
       }

       intArray(intArray &c)
       {
           cout<<"\n Copy constructor..";
           len = c.len;
           arr = new int[len];
           for(int i = 0;i<len ;i++)
               arr[i] = c.arr[i];

       }
       void accept_array_elements()
       {
           int i;
           for(i=0;i<len ;i++)
           {
               cout<<"\n Enter a number :";
               cin>>arr[i];
           }
       }
       void display()
       {
           int i;
           for(i=0;i<len;i++)
            cout<<"  "<<arr[i];
       }
       ~intArray()
       {
           cout<<"\n destructor is called..";
           delete []arr;
       }

       intArray operator=(intArray &c)
       {
           cout<<"\n Assignment operator..";
           delete []arr;
           len = c.len;
           arr = new int[len];
           for(int i = 0 ;i<len; i++)
              arr[i] = c.arr[i];

           return *this;
       }

};

int main()
{                                           // try the code for more than one objects
    intArray obj1(4);
    intArray obj2(10);
    obj1.accept_array_elements();
    obj1.display();
    intArray obj3(obj1);
    obj3.display();

    obj2 = obj3;       //obj2.operator=(obj3)
    obj2.display();
    obj3.display();

    return 0;
}
