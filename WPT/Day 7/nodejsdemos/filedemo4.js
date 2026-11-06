const fs=require('fs')
//default buffersize 65536
//highWaterMark ---will help you to modify the default buffer size
//var rs=fs.createReadStream("mydata.txt","utf-8",{highWaterMark:20})
var rs=fs.createReadStream("file1.txt","utf-8")
var ws=fs.createWriteStream("myfile.txt");
rs.on('data',function(chunk){
    console.log("chunk received is "+chunk)
    //generate write event to write the data to myfile.txt
    ws.write(chunk);
    /*fs.appendFile("mydatacopy.txt",partialdata,()=>{
        console.log("data appended")
    })*/
})
rs.on('end',function(){
    //generate end event to close the write stream
    ws.end();
    console.log("no more data to read")
})