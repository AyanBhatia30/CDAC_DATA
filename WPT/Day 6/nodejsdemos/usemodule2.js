const m1=require('./module2');
m1.function1()
m1.function2()
console.log("User Name: "+m1.user.name);
console.log("User Age: "+m1.user.age);

const person1 = new m1.Person("Smita", 25);
person1.display();  