function f1() {
    console.log("Hello from f1");
}

function f2() {
    console.log("Hello from f2");
    console.log("calling private function f3");
    f3()
}
//private function f3, can be used only within this module, not exported
function f3() {
    console.log("Hello from f3");
}

user={name: "John", age: 30};
class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    display() {
        console.log(`Name: ${this.name}, Age: ${this.age}`);
    }               
}

module.exports = 
{ function1:f1, 
    function2:f2,
     user:user, 
     Person:Person };