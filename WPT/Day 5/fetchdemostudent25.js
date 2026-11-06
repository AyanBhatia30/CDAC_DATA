function displaydata(data){
        var str="<table border='2'><tr><th>Id</th><th>Name</th><th>course</th><th>fees</th></tr>"
        for(var ob of data){
            str+=`<tr><td>${ob.sid}</td><td>${ob.sname}</td><td>${ob.course}</td><td>${ob.fees}</td></tr>`
        }
        str+="</table>"
        document.getElementById("mydiv").innerHTML=str;
    }
function getdata(){
        console.log("before fetching data from file")
        response=fetch("student.json")
        response.then((result)=>{
            if(result.ok && result.status==200){
            return  result.json()    
            }
            throw new Error("data not found")       
        }   ).then((data)=>{
            console.log("fetched data:", data)
            displaydata(data)
        }  ).catch((err)=>{
            console.error("error occurred:", err)
        });      
        console.log("after fetching data from file")
    }