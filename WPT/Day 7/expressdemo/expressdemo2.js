const express=require("express")
const app=express()
//common middlewares to all requests
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

//route specific middlewares
app.get("/",function(req,resp){
    console.log("in get method")
    resp.send("<h1>Welcome to Home Page</h1>")
})
app.get("/hello",function(req,resp){
    console.log("in get method")
    resp.sendFile("/public/hello.html",{root:__dirname})
})

app.get("/welcome",function(req,resp){
    console.log("in get method")
    resp.sendFile("/public/welcome.html",{root:__dirname})
})

app.listen(3131,function(){
    console.log("server is running at port 3131")
})