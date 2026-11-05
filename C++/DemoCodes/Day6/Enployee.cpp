#include<iostream>
using namespace std;

class Employee {
   protected:
       int empno;
       string name;
       float b_sal;
   public:
    Employee() {
        cout<<"\n Default constructor of emp ";
        empno = 0; name="unknown"; b_sal = 0.0f;}
    Employee(int e, string nm, float bs)
    {
        cout<<"\n Parameterized constructor of emp ";
        empno = e;
        name=nm;
        b_sal = bs;
    }
    virtual ~Employee()
    {
         cout<<"\n Destructor of emp ";
    }
    // getter and setter

    virtual float calNetSal()=0;
   /* {
        //cout<<"\n calNetSal of Employee";
        return b_sal;
    }*/
};

class Manager : public Employee
{
protected:
    float bonus;
    public:
    Manager()
    {
        cout<<"\n Default constructor of manager ";
        bonus = 0.0f;
    }
    Manager(int e, string nm, float bs, float b):Employee(e,nm,bs)
    {
        cout<<"\n Parameterized constructor of manager ";
        bonus = b;
    }
    ~Manager()
    {
        cout<<"\n Destructor of Manager ";
    }
    //setter getter

};

class SalesManager : public Manager
{
protected:
    float totalSal;
    public:
    SalesManager()
    {
        cout<<"\n Default constructor of sales manager ";
        totalSal = 0.0f;
    }
    SalesManager(int e, string nm, float bs, float b, float ts):Manager(e,nm,bs,b)
    {
       cout<<"\n Parameterized constructor of sales manager ";
       totalSal = ts;
    }
    ~SalesManager()
    {
        cout<<"\n Destructor of sales Manager ";
    }
    float calNetSal()
    {
        //cout<<"\n calNetSal of sales manager";
        float nsal;
        nsal = b_sal + bonus + ((totalSal * 15) / 100);
        return nsal;
    }

};

class Clerk:public Employee
{
protected:
    int overtime;
public:
    Clerk()
    {
        cout<<"\n Default Constructor of clerk is called..";
        overtime = 0;
    }
    Clerk(int no, string nm, float b, int ot):Employee(no,nm,b)
    {
        cout<<"\n Param Constructor of clerk is called..";
        overtime = ot;
    }
    ~Clerk()
    {
        cout<<"\n Destructor of clerk is called..";
    }
    float calNetSal()
    {
        return b_sal + overtime * 1200;
    }
};

class CEO : public Employee{
 protected:
     float incen;
 public:
    CEO()
    {
        cout<<"\n default constructor of CEO";
        incen= 0.0f;
    }
    CEO(int n, string nm, float sa, float in):Employee(n,nm,sa)
    {
        cout<<"\n parameter constructor of CEO";
        incen= in;
    }
    ~CEO()
    {
        cout<<"\n destructor of CEO";
    }
    float calNetSal()
    {
        return b_sal + incen;
    }
};

int main()
{
   /* Employee e(120,"Pooja",55000.00f);
    cout<<"\n Salary = "<<e.calNetSal();

    Clerk e(12, "Pooja",55000.00f,5);
    cout<<"\n Salary = "<<e.calNetSal();

    SalesManager e(12,"Pooja",55000.00f,1500,250);
    cout<<"\n Salary = "<<e.calNetSal();*/

    /*Employee *ptr = new Clerk(12, "Pooja",55000.00f,5);
    cout<<"\n Salary = "<<ptr->calNetSal();
    delete ptr;*/

  //  Manager obj(12,"Pooja",50000.0f,4500);

  /*  Employee *ptr = new SalesManager(12, "Pooja",55000.00f,15000,250);
    cout<<"\n Salary = "<<ptr->calNetSal();
    delete ptr;*/

    Employee *ptr[3];
    ptr[0] = new Clerk(12, "Pooja",55000.00f,5);
    ptr[1] = new SalesManager(15, "Pankaj",75000.00f,15000,250);
    ptr[2] = new CEO(13,"Janhavi",25000.00,65000.00);

    for(int i=0;i<3;i++)
        cout<<"\n Salary = "<<ptr[i]->calNetSal();


    for(int i=0;i<3;i++)
            delete ptr[i];


    return 0;

}
