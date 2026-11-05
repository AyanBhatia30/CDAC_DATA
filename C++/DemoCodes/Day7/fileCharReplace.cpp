#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    ifstream file("sample.txt");
    ofstream file1("AnotherSample.txt");

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
            word = "badly love"; found = true;
        }
        file1<<word;
        file1<<" ";
    }

    if (found)
        cout << "Word found in the file." << endl;
    else
        cout << "Word not found in the file." << endl;

    file.close();
    return 0;
}
