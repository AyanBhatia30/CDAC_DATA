const express=require("express")
const myloginrouter=express.Router()
const lController=require("../controller/logincontroller")


//login url to display form
myloginrouter.get("/",lController.getLoginForm)
myloginrouter.post("/validateuser",lController.validateuserdetails)

module.exports=myloginrouter