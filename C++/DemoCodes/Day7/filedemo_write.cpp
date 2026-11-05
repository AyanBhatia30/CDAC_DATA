#include<fstream>
#include<iostream>
using namespace std;
int main()
{
	char arr[]="Infoway Technologies Pvt. Ltd., Pune";
	ofstream f1("d:\\text1.txt");
    f1<<arr;
    //cout<<arr;
/*	or
    for(int i=0;arr[i]!='\0';i++)
	{
		f1.put(arr[i]);
	}
*/	f1.seekp(5,ios::beg);
	f1.put('P');
	f1.put('p');
}

