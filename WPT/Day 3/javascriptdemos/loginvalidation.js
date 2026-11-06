function validateTextBox(id,errid){
    var nm=document.getElementById(id).value;
    //alert(`${nm===""} , ${!isNaN(nm)} , ${nm.trim().length===0} `)
     if(nm==="" || !isNaN(nm) || nm.trim().length===0 ){
        document.getElementById(errid).innerHTML=id+" data is not valid"
        return false
    }else{
        document.getElementById(errid).innerHTML="*"
        return true
    }
}
function validateform(){
    //alert("validate called")
     flag=validateTextBox("username","unamespan");
     flag1=validateTextBox("password","passspan");
     return flag && flag1
     
}