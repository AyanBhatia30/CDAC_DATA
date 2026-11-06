const http=require("http")
const fs=require("fs")
const url=require("url")
const m1=require("./module1")
function processdatafunction(req,res){
    console.log("request is coming from the client")
    res.writeHead(200,{'content-type':'text/html'})
    const queryObject=url.parse(req.url,true) 
    //queryObject={pathname:url,query:{num1:34,num2:45,btn:"add"}}
    console.log(queryObject) //.  http://localhost:9191/add?n1=10&n2=20
    switch(queryObject.pathname){
        case '/':
            var rs=fs.createReadStream("./public/hello.html","utf-8")
            rs.pipe(res)
            break;
        case '/form':
            var rs1=fs.createReadStream("./public/formdemo.html","utf-8")
            rs1.pipe(res)
            break;
        case '/add':
            var n1=parseInt(queryObject.query.n1)
            var n2=parseInt(queryObject.query.n2)
            var sum=m1.addition(n1,n2)
           // var sum=n1+n2
            //res.write('<h1>Result</h1>')
            res.end(`<h2>The sum of ${n1} and ${n2} is ${sum}</h2>`)
            //res.end(`<h2>The sum of ${n1} and ${n2}`)
            break;
        default:
            res.write('<h1>404 Error</h1>')
            res.end('<h2>Page Not Found</h2>')
    }
}
const server=http.createServer(processdatafunction)
server.listen(9191,function(){
    console.log("server is running at port 9191")
})