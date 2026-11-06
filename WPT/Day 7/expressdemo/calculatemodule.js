userarr=[{uname:'user1',pass:'pass1'},
    {uname:'user2',pass:'pass2'},
    {uname:'admin1',pass:'pass3'}]
exports.addition=function(n1,n2){
    return n1+n2
}   
exports.factorial=function(n){
    var fact=1
    for(var i=1;i<=n;i++){
        fact=fact*i
    }
    return fact
}
exports.displaytable=function(n){
    var str=""
    for(var i=1;i<=10;i++){
        str+=`<h3>${n} * ${i} = ${n*i}</h3>`
    }
    return str
}