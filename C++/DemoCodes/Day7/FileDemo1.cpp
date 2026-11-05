#include<iostream>
#include<fstream>
using namespace std;

int main()
{
   /*  ofstream file("mytext.txt");   // text file ASCII file
     file<<"Janhavi Deo";
     file<<"19-10-2026";
     file<<"C++ Classroom session";
     file.close();
     ifstream file("mytext.txt");
     char ch;
     while(file)
     {
         file>>ch;
         cout<<ch;
     }
     ofstream file("mytext.txt");
     string word=" ";
     cout<<"\n Enter text :";
     while(1)
     {
         cin>>word;
         if(word == "end")   break;
         file<<word;
         file<<" ";
     }
*/


     ifstream file("mytext.txt");
     string word;
     while(file)
     {
         file>>word;
         if(word == "name")  cout<<"\n Found";
          cout<<word;
          cout<<" ";
     }
     file.close();

     return 0;
}
