"use strict";
let studentName = "Amit";
let age = 25;
let fees = 45000.50;
let isActive = true;
let test;
let id;
id = 101;
id = "STU101";
// Error
// id = true;
test = "Hello, everyone!";
console.log(studentName);
console.log(age);
console.log(fees);
console.log(isActive);
let s1 = {
    sid: 101,
    sname: "Amit",
    age: 22,
};
console.log(s1.sname);

//literal type restrict values
let direction: "left" | "right" | "up" | "down";

direction = "left";
direction = "up";

// Error
// direction = "north";
