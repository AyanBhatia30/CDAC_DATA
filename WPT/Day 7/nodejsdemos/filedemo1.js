const fs=require("fs")
console.log("before reading the file")
fs.readFile('file1.txt',function(err,data){
   if(err){
    console.log(err)    
   } else{
    console.log("data from file1.txt is "+data)
   }
})
console.log("after reading the file")