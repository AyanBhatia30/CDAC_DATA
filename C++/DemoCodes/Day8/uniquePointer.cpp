#include <iostream>
#include <memory>
using namespace std;

class Student {
    int rno;
    string name;
public:
    Student() {
        rno = 101;
        name = "unknown";
        cout << "Constructor\n";
    }
     Student(int r,string nm) {
        rno =r;
        name = nm;
        cout << "Constructor\n";
    }

    ~Student() {
        cout << "Destructor\n";
    }

    void display() {
        cout << "Student Object\n";
        cout<<"\n "<<rno<<"   "<<name<<"\n";
    }
};

int main() {
    unique_ptr<Student> s = make_unique<Student>(10,"Janhavi");

    s->display();

    shared_ptr<Student> ptr = make_shared<Student>();    // ptr is shareable pointer
    ptr->display();
    shared_ptr<Student> p2 = ptr;          // ptr is shared with p2, reference counter increased by 1
    p2->display();
    cout<<"\n"<<p2.use_count();


    weak_ptr<Student> ptr1 = ptr;           // ptr1 is non-owning pointer, will not increase ref count
    cout<<"\n"<<ptr1.use_count();
    return 0;
}

/*no delete statement. The smart pointer automatically releases
 memory when it goes out of scope. This is the main advantage of smart pointers over raw pointers. */
