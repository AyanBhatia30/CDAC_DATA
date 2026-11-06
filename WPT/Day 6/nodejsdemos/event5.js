//process.nextTick() is a Node.js-specific mechanism, not a standard browser JavaScript API. Excessive recursive use can starve the event loop.
//synchrounous code is executed first, then process.nextTick() callbacks, then Promise callbacks, and finally setTimeout() callbacks.
console.log("Start");

process.nextTick(() => {
    console.log("Next Tick");
});

Promise.resolve().then(() => {
    console.log("Promise");
});

setTimeout(() => {
    console.log("Timer");
}, 0);

console.log("End");