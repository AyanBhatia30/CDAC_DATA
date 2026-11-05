#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    fstream file("sample.txt",ios::in | ios::out | ios::ate);


    if (!file)
    {
        cout << "Error opening file!" << endl;
        return 1;
    }
    cout << "Current position: " << file.tellg() << endl;
    file.seekp(-10,ios::end);
    file<<"This will be overwritten on some content of file";
    file.close();
    return 0;
}
