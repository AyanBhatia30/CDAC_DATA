

async function fetchdata(){
    response=await fetch("https://jsonplaceholder.typicode.com/posts")
    if(response.ok && response.status==200){
        data=await response.json();
        console.log("fetched data:", data)

    }   else{
        throw new Error("data not found")
    }     
}

console.log("before fetching data from url")
fetchdata()
console.log("after fetching data from url")
