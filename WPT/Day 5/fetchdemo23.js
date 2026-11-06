var controller=new AbortController();
var url = "https://jsonplaceholder.typicode.com/posts";
console.log("before fetching data from url")
response=fetch(url, {signal: controller.signal})

response.then((result)=>{
    if(result.ok && result.status==200){
       return result.json()  
    }
    throw new Error("data not found")       
}).then((data)=>{
    console.log("fetched data:", data)
}).catch((err)=>{
    console.error("error occurred:", err)
})
console.log("after fetching data from url")

async function myhello(){
    console.log("in myhello")
    return "hello";
}
ans=myhello()
console.log(ans);
ans.then((result)=>{
    console.log("result from myhello:", result)

}).catch((err)=>{
    console.error("error occurred:", err)
})
//it delays the execution of the code inside setTimeout 
// for 2 second and then executes it
var s=setTimeout(()=>{
    console.log("in setTimeout")
    controller.abort()  //abort the fetch request
}, 2000)
//clearTimeout(s)  //cancel the setTimeout function
//controller.abort()  //abort the fetch request