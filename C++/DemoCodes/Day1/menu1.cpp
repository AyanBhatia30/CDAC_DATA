#include<iostream>
using namespace std;
int main()
{
    int num1, num2, res, ch;
    do {
    cout<<"\n Menu";
    cout<<"\n 1. Addition";
    cout<<"\n 2. Subtract";
    cout<<"\n 3. Multiply";
    cout<<"\n 4. Division";
    cout<<"\n 5. Exit";
    cout<<"\n Enter your choice (1..5)";
    cin>>ch;
    if((ch>=1) && (ch<=4))
    {
        cout<<"\n Enter 2 numbers ";
        cin>>num1;
        cin>>num2;
    }
    switch(ch) {
      case 1: cout<<"\n Addition = "<<num1+ num2;
              break;
      case 2: cout<<"\n Subtraction = "<<num1- num2;
              break;
      case 3: cout<<"\n Multiplication = "<<num1* num2;
              break;
      case 4: cout<<"\n Division = "<<num1 / num2;
              break;
      case 5: break;
      default : cout<<"\n Invalid choice..";

    }
    }while(ch!=5);

    return 0;
}
