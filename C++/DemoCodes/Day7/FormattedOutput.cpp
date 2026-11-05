#include<iostream>
using namespace std;

#include<iomanip>
int main()
{
    char *c = "ABCEFG";

    cout<<"\n c = "<<c<<endl;    // ABCDEFG

    cout<<"(void *)c = "<<(void *)c<<endl;  // address

    cout.write(c, 4);
    cout<<"\n";

    //Method put

    cout.put('A').put('B');
    cout<<"\n\n\n";

    // Part - 2 float format

    float a = 3.14159265f;
    cout.precision(2) ; // "3.14" will be output
    cout<<a<<endl;
    cout.precision(4);
    cout << a <<endl;// "3.142" will be output
    cout.precision(5);
    cout << a<<endl ;// "3.142" will be output

    //Part - 3  Stream Input

    char line[30];

    cout<<"\n Enter line :";
    cin.getline(line,30,'\n');
    cout<<"\n \n Entered Line : "<<line<<endl;

    //Part - 4 getting one character


    char ch;
    cin.get(ch);
    // Print ch
    cout << ch;

    // Part - 5 getting till cntrl Z
    char str[120];
    cin.read(str,120); //reads till ^z
    cout<<str;


// using manipulators
   cout << setw(10) << setfill('*') << 420 << endl;   // *******123
    cout << fixed << setprecision(2) << 3.14159 << endl; // 3.14
    cout << showpos << 100 << endl;   // +100
    cout << hex << 255 << endl;       // ff
    cout << dec;
   int numb; //define loop variable
    for(numb=1; numb<=10; numb++) //loop from 1 to 10
    {
        cout << setw(4) << numb; //display 1st column      #include<iomanip>
        int cube = numb*numb*numb; //calculate cube
        cout << setw(6) << cube << endl; //display 2nd column
        cout<<setfill('*');
    }
    return 0;
}
