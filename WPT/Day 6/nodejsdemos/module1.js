exports.addition =  (a, b)=> {
    return a + b;
};

exports.factorial = (n) => {
    var f=1
    if (n === 0 || n === 1) {
        return 1;
    }else{
        for(let i=1;i<=n;i++){
            f=f*i
        }
        return f
    }}