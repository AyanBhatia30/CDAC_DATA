//Node.js processes Promise callbacks using the Microtask Queue. After the current synchronous execution finishes, microtasks are processed before moving on to the next event-loop phase.
console.log("Start");

setTimeout(() => {
    console.log("Timer");
}, 0);

Promise.resolve().then(() => {
    console.log("Promise");
});

console.log("End");