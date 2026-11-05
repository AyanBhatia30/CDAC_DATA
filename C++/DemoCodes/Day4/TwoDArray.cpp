#include<iostream>
using namespace std;
void display(int (*p)[3]);
int main()
{
    int arr[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
    int i,j;


    cout<<"\n arr = "<<arr;
    for(i=0 ;i<3;i++)
    {
        cout<<"\n arr["<<i<<"] = "<<arr[i];
        for(j=0;j<3;j++)
        {
            cout<<"\n &arr["<<i<<"]["<<j<<"] = "<<&arr[i][j];
        }
    }
    display(arr);
    return 0;
}

void display(int (*ptr)[3])
{
    int i,j;
    for(i=0 ;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            cout<<"   "<<ptr[i][j];
        }
        cout<<"\n";
    }
}
