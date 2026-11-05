#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    ifstream file("sample.txt");

    if (!file)
    {
        cout << "Error opening file!" << endl;
        return 1;
    }

    string searchWord, word;
    bool found = false;

    cout << "Enter the word to search: ";
    cin >> searchWord;

    while (file >> word)
    {
        if (word == searchWord)
        {
            found = true;
            break;
        }
    }

    if (found)
        cout << "Word found in the file." << endl;
    else
        cout << "Word not found in the file." << endl;

    file.close();
    return 0;
}
