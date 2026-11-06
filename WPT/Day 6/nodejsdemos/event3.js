console.log("Start");

setTimeout(() => {
    console.log("Inside setTimeout 2000");
}, 2000);
setTimeout(() => {
    console.log("Inside setTimeout 0");
}, 0);
console.log("End");