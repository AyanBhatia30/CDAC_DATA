#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;
struct Student
{
    int rollNo;
    string name;
    float marks;
};
vector<Student> students;

// Function to add student
void addStudent()
{
    Student s;
    cout << "\nEnter Roll Number: ";
    cin >> s.rollNo;     // 102

    cin.ignore();    // ignores the new line character entered for rollno and control waits for next getLine
      /*  #include <limits>

          cin.ignore(numeric_limits<streamsize>::max(), '\n');
          */

    cout << "Enter Name: ";
    getline(cin, s.name);

    cout << "Enter Marks: ";
    cin >> s.marks;

    students.push_back(s);

    cout << "Student Record Added Successfully!\n";
}

// Function to display all students
void displayStudents()
{
    if (students.empty())
    {
        cout << "\nNo student records found.\n";
        return;
    }

    cout << "\n----- Student Records -----\n";

    for (const auto &s : students)
    {
        cout << "Roll No : " << s.rollNo << endl;
        cout << "Name : " << s.name << endl;
        cout << "Marks : " << s.marks << endl;
        cout << "--------------------------\n";
    }
}

// Function to sort students by marks
void sortByMarks()
{
    sort(students.begin(), students.end(),[](const Student &a, const Student &b)
    {
        return a.marks > b.marks;
    }
    );

    cout << "\nStudents Sorted by Marks (Descending Order).\n";
}

// Function to search student by roll number
void searchStudent()
{
    int roll;

    cout << "\nEnter Roll Number to Search: ";
    cin >> roll;

    auto it = find_if(students.begin(), students.end(),[roll](const Student &s)
    {
        return s.rollNo == roll;
    }
    );

    if (it != students.end())
    {
        cout << "\nStudent Found:\n";
        cout << "Roll No : " << it->rollNo << endl;
        cout << "Name : " << it->name << endl;
        cout << "Marks : " << it->marks << endl;
    }
    else
    {
        cout << "\nStudent Not Found.\n";
    }
}

struct mycompare {
  bool operator()(Student &a, Student &b) {
      cout<<"\n By mycompare functor  ";
    return a.marks < b.marks;
  }
};

// Function to display top 3 scorers
void displayTop3Scorers()
{
    if (students.empty())
    {
        cout << "\nNo records available.\n";
        return;
    }

    vector<Student> temp = students;

    sort(temp.begin(), temp.end(),mycompare());
    /*
    sort(students.begin(), students.end(),
         [](const Student &a, const Student &b)
         {
             return a.marks > b.marks;
         });*/

    cout << "\n----- Top Scorers -----\n";

    int limit = min(3, (int)temp.size());  /* take whatever is
    minimum, 3 or size of array to prevent loop runs out of array elements*/


    for (int i = 0; i < limit; i++)
    {
        cout << i + 1 << ". "
        << temp[i].name
        << " (Roll No: " << temp[i].rollNo
        << ", Marks: " << temp[i].marks << ")\n";
    }
}

int main()
{
    int choice;

    do
    {
        cout << "\n===== STUDENT RECORD MANAGEMENT =====\n";
        cout << "1. Add Student\n";
        cout << "2. Display All Students\n";
        cout << "3. Sort Students By Marks\n";
        cout << "4. Search Student By Roll Number\n";
        cout << "5. Display Top 3 Scorers\n";
        cout << "6. Exit\n";
        cout << "Enter Choice: ";
        cin >> choice;

        switch (choice)
        {
            case 1:
            addStudent();
            break;

            case 2:
            displayStudents();
            break;

            case 3:
            sortByMarks();
            break;

            case 4:
            searchStudent();
            break;

            case 5:
            displayTop3Scorers();
            break;

            case 6:
            cout << "\nThank You!\n";
            break;

            default:
            cout << "\nInvalid Choice!\n";
        }

    } while (choice != 6);

    return 0;
}
/*
STL Concepts Used
STL Feature	Usagevector<Student>	Dynamic storage of student records
push_back()	Add new student
sort()	Sort students by marks
find_if()	Search student by roll number
Lambda Functions	Custom sorting and searching criteria
min()	Display top 3 scorers safely
Sample Output
Plain Text
===== STUDENT RECORD MANAGEMENT =====
1. Add Student
2. Display All Students
3. Sort Students By Marks
4. Search Student By Roll Number
5. Display Top 3 Scorers
6. Exit
 
Enter Choice: 1
 
Enter Roll Number: 101
Enter Name: Janhavi
Enter Marks: 95
 
Student Record Added Successfully!

*/
