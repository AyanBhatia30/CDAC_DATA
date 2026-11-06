const fs=require('fs');
console.log("before reading the file");
fs.exists('file1.txt',function(exists){
    if(exists){
        fs.stat('file1.txt', function(err,stats){
            if(err){
                console.log(err);
            } else{
                console.log("stats of file1.txt is ")
                console.log(stats);
            }
        })
}})

fs.exists('file1.txt',function(exists){
    if(exists){
        fs.stat('file1.txt', function(err,stats){
            if(err){
                console.log(err);
            } else{
                var buffer=new Buffer(stats.size);
                fs.open('file1.txt','r',function(err,fd){
                    if(err){
                        console.log(err);
                    } else{
                        fs.read(fd,buffer,0,10,0,function(err,bytesRead,buffer  ){
                            if(err){
                                console.log(err);
                            } else{
                                console.log("data from file1.txt is "+buffer.toString('utf8',0,bytesRead));
                            }
                        });
                    }
                });
            }
        })
}})