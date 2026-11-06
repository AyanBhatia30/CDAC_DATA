const fs=require('fs')
//default buffersize 65536
//highWaterMark ---will help you to modify the default buffer size
//var rs=fs.createReadStream("mydata.txt","utf-8",{highWaterMark:20})
var rs=fs.createReadStream("file1.txt","utf-8")
var ws=fs.createWriteStream("myfile.txt");
rs.pipe(ws);