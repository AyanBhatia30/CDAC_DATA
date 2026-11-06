const express=require("express");       
const app=express();
app.use(function(req,resp,next){
     console.log("in first middleware function")
   console.log(req.url+"-----"+req.method)
   next() 
})

app.use(function(req,resp,next){
   console.log("in second middleware function")
   console.log("these middlewares gets executed for all rquests")
     next()
})

app.get("/",function(req,resp){
    console.log("in get method")
    resp.send("<h1>Welcome to Home Page</h1>")
})

app.get("/about",function(req,resp){
    console.log("in get method")
    resp.send("<h1>Welcome to About Page</h1>")
})

app.get("/contact",function(req,resp){
    console.log("in get method")
    resp.send("<h1>Welcome to Contact Page</h1>")
})

app.listen(3131,function(){
    console.log("server is running at port 3131")
})