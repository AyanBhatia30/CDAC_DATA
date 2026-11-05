#include<fstream>
#include<iostream>
using namespace std;
int main()
{
	char ch[120];
	ifstream f1("d:\\text1.txt");
    int count = 1;
	while(f1)
	{
		f1.getline(ch,120,'\n');
		cout<<ch;
		count++;
	/*	if(ch=='E')
		   f1.seekg(1,ios::cur);
        f1.get(ch);
		cout<<ch;
	*/}
	cout<<"\n No of lines = "<<count;
	f1.close();
	return 0;
}

