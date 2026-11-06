type Person = {
    name: string;
    age: number;
};

type Employee = {
    empid: number;
    salary: number;
};

type EmployeeDetails = Person & Employee;

let e: EmployeeDetails = {
    name: "Sneha",
    age: 24,
    empid: 101,
    salary: 60000
};