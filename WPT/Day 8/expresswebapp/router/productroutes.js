const express=require("express")
const myproductrouter=express.Router()
const pController=require("../controller/productcontroller")
const {isValidUser}=require("../middleware/checkvalidity")

myproductrouter.get("/getproducts",isValidUser,pController.getAllProducts)
myproductrouter.get("/addproduct",isValidUser,pController.showaddproductform)
myproductrouter.post("/insertproduct",isValidUser,pController.insertproduct)
myproductrouter.get("/editproduct/:id",isValidUser,pController.editproduct)
myproductrouter.post("/updateproduct",isValidUser,pController.updateproduct)
myproductrouter.get("/deleteproduct/:pid",isValidUser,pController.deleteproduct)

module.exports=myproductrouter