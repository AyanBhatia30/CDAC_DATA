let studentName = "Amit";
let age: number = 25;
let fees: number = 45000.50;
let isActive: boolean = true;
let test:string;
type myType = string | number;
let id: myType;

id = 101;
id = "STU101";

// Error
// id = true;
test="Hello, everyone!";
console.log(studentName);
console.log(age);
console.log(fees);
console.log(isActive);

type Student = {
    sid: number;
    sname: string;
    age: number;
};

let s1: Student = {
    sid: 101,
    sname: "Amit",
    age: 22,
   
};

console.log(s1.sname);