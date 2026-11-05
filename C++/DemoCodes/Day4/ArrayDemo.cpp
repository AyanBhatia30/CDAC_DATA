#include<iostream>
using namespace std;
int main()
{
    int i,arr[5] = {10,20,30,40,50};
    int *ptr = arr;
    cout<<"\n arr = "<<arr<<"\n";
 //   cout<<"\n &arr[0] = "<<&arr[0]<<"\n";
    //ptr = ptr + 3;
    //cout<<"  "<<ptr[-1];   // try this with other syntax
    for(i=0;i<5;i++)
    {
       // cout<<"  "<<arr[i];  // *(arr+i)
       // cout<<"  "<<*(arr+i);
        // cout<<"  "<<*(i+arr);
        //cout<<"  "<<i[arr];
       // cout<<"  "<<ptr[i];
       // cout<<"  "<<i[ptr];
      // *(ptr+i) = 23;
      // cout<<ptr[i];
      cout<<"   "<<&arr[i];
    }

    cout<<"\n The End";

}
