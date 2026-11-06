//import all libraries
const express=require('express')
const app=express()
const path=require("path");
const session=require("express-session")
const bodyParser=require("body-parser")
const loginrouter=require("./router/loginroutes")
const productrouter=require("./router/productroutes")
//configure express application
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"views"))
app.use(express.static("public"))
app.use(bodyParser.urlencoded({extended:false}));

//initialize session object
app.use(
  session({
    secret: "mysecretkey",
    resave: false,
    saveUninitialized: false
  })
);

//url handler moddleware
app.use("/login",loginrouter)
app.use("/product",productrouter)

//start the server

app.listen(3131,()=>{
    console.log("server runing on port 3131")
})


