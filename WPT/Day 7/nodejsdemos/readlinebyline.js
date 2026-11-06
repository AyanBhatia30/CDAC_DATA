const readline=require('readline')
const fs=require('fs')

var rl=readline.createInterface({
    input:fs.createReadStream("file1.txt")
})
var linecount=0;
var wordcount=0;
rl.on('line',function(line){
arr=line.split(" ");
wordcount=wordcount+arr.length;
linecount++;
console.log("line "+linecount+" is "+line)    
})

rl.on('close',function(){
    console.log("total number of lines are "+linecount)
    console.log("total number of words are "+wordcount)
})