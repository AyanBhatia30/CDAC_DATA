const http=require("http")

var server=http.createServer(function(req,res){
    console.log(req.url)
    res.writeHead(200,{'Content-Type':'text/html'})
    res.write('<h1>Hello World</h1>')
    res.end('<h2>Welcome to Nodejs</h2>')
})  
server.listen(3131,function(){
    console.log("server is running at port 3131")
})

