const express=require("express")
const app=express()
const bodyparser=require("body-parser")
const m1=require("./calculatemodule")
app.use(bodyparser.urlencoded({extended:false}))

app.get("/",function(req,resp){
    resp.sendFile("/public/formdemo.html",{root:__dirname})
})      
app.get("/calculate",function(req,resp){
    var n1=parseInt(req.query.n1)
    var btn=req.query.btn
    var result=0
    switch(btn){
        case "addition":
            var n2=parseInt(req.query.n2) 
            result=m1.addition(n1,n2)
            resp.send("<h1>addition is "+result+"</h1>")
            break;  
        case "factorial":
            result=m1.factorial(n1)
            resp.send("<h1>factorial is "+result+"</h1>")
            break;
        case "displaytable":
            result=m1.displaytable(n1)
            resp.send("<h1>table  is "+result+"</h1>")
            break
    }
})      
app.listen(3131,function(){
    console.log("server running on port 3131")
})
