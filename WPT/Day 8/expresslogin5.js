//import data
const express=require("express")
const app=express();
const bodyParser=require("body-parser");
const m1=require("./validate")
//middleware
app.use(bodyParser.urlencoded({extended:false}))

//configure the application

//handle url specific middleware
app.get("/",(req,resp)=>{
       resp.sendFile("/public/loginform.html",{root:__dirname})
})

app.post("/validate",(req,resp)=>{
    var uname=req.body.uname;
    var pass=req.body.pass;
    var flag=m1.validateUser(uname,pass)
    if(flag){
        resp.send("<h1> valid user</h1>")
    }else{
        resp.send("<h1>Invalid user</h1>")
    }


})
//start the server
app.listen(3131,()=>{
    console.log("server running at port 3131")
})