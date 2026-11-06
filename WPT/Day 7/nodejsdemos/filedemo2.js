const fs=require("fs")
console.log("before reading the file")
try{
    var data=fs.readFileSync('file1.txt','utf8');
    console.log("data from file1.txt is "+data)
    console.log("after reading the file")
}catch(err){
    console.log(err)
}
