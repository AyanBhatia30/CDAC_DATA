#include<iostream>
using namespace std;

void accept_array_elements(int *);

int main()
{
    int arr[5];
    accept_array_elements(arr);
    cout<<"\n";
    for(int i=0 ;i<5;i++)
    {
        cout<<"   "<<arr[i];
    }
    return 0;

}

void accept_array_elements(int *arr)
{
    int i;
    for(i=0;i<5;i++)
    {
        cout<<"\n Enter a number :";
        cin>>arr[i];
    }
}





