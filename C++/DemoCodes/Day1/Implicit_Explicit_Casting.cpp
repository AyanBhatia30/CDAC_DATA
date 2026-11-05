#include<iostream>
using namespace std;
int main()
{
   char c1,c2;
   int i1,i2;
	float f1,f2;
	c1='H';
	i1=80.56;		/*float converted to int, only 80 assigned to i1  */
	f1=12.6;
	c2=i1;		/*int converted to char */
	i2=f1;		/*float converted to int */
	/*Now c2 has the character with ASCII value 80, i2 is assigned value 12 */
	cout<<"\n c2 = "<<int(c2) << " i2 = "<<i2;     //c2 = 80   i2 = 80
	f2=i1;			/*int converted to float*/
	i2=c1;			/*char converted to int */
	/*Now i2 contains ASCII value of character 'H' which is 72*/
	cout<<"\n f2 = "<<f2<<"  i2 = "<<i2;      //f2 = 80   i2 = 72


	int x=5,y=2;
	float p,q;
	p=x/y;
	cout<<"\n p = "<<p;          //2
	q=(float)x/y;
	cout<<" q = "<<q;           //2.5
    return 0;
}
