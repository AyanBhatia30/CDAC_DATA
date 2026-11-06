var http=require("http")

var server=http.createServer(function(req,res){
    console.log(req.url)
    res.writeHead(200,{'Content-Type':'text/html'})
    switch(req.url){
        case '/':
            res.write('<h1>Home Page</h1>')
            res.end('<h2>Welcome to Home Page</h2>')
            break;
        case '/about':
            res.write('<h1>About Page</h1>')
            res.end('<h2>Welcome to About Page</h2>')
            break;
        case '/contact':
            res.write('<h1>Contact Page</h1>')
            res.end('<h2>Welcome to Contact Page</h2>')
            break;
        default:
            res.write('<h1>404 Error</h1>')
            res.end('<h2>Page Not Found</h2>')
    }
})

//start the server at port 3131
server.listen(3131, function(){
    console.log("server is running at port 3131")
})