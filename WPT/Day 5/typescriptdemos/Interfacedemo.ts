interface Employee {
    empid: number;
    empname: string;
    salary: number;
}

let e1: Employee = {
    empid: 101,
    empname: "Rahul",
    salary: 45000
};

console.log(e1);

interface Person {
    name: string;
    age: number;
}

interface Student extends Person {
    readonly studid: number; //readonly property, cannot be modified after initialization
    marks: number;
    address?:string
}

let stud: Student = {
    name: "Amit",
    age: 25,
    studid: 101,
    marks: 85
};

let stud1: Student = {
    name: "Raju",
    age: 25,
    studid: 102,
    marks: 85,
    address:"Pune"
};