#include<fstream>
#include<iostream>
using namespace std;
class student{
	int rno;
	char name[15];
	public:
		void set_data()
		{
			cout<<"Enter Rno";
			cin>>rno;
			cout<<"\nEnter Name";
			cin>>name;
		}
		void display()
		{
			cout<<"Rno: "<<rno<<"Name: "<<name<<endl;
		}
};

int main()
{
	ofstream f1;
	ifstream f2;
	f1.open("mydata.dat");
    student obj1,obj2;
	obj1.set_data();
	f1.write((char *)&obj1,sizeof(obj1));
	obj1.display();	
	f1.close();
	
	f2.open("mydata.dat");
	f2.read((char *)&obj2,sizeof(obj2));
	obj2.display();
	f2.close();
}
