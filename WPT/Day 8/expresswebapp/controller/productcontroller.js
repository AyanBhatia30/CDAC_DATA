const myconnection=require("../databaseconfig/dbconnection")
//find all products and display in table form  by sending data to showproduct.ejs
//in showproduct.ejs, data is accessed by using arry by name productdata
exports.getAllProducts=(req,resp)=>{
   myconnection.query("select * from product",(err,result,field)=>{
        if(err){
            resp.status(404).send("error occured"+JSON.stringify(err))
        }else{
            resp.render("showproduct",{productdata:result})
        }
   })
}

//display blank form to accept new products
exports.showaddproductform=(req,resp)=>{
    resp.render("addproduct")
}

//insert new product in product table
exports.insertproduct=(req,resp)=>{
   const {pid,pname,qty,price,mfgdate,cid}=req.body
   myconnection.query("insert into product values(?,?,?,?,?,?)",[pid,pname,qty,price,mfgdate,cid],(err,result,field)=>{
     if(err){
        resp.status(500).send("data not inserted" +JSON.stringify(err));
      }else{
        console.log("data added"+result)
        resp.redirect("/product/getproducts")
      }
   })
} 

//display selected product in the form for updation
exports.editproduct=(req,resp)=>{
    var pid=req.params.id;
    myconnection.query("select * from product where Pid=?",[pid],(err,result,fields)=>{
        resp.render("editProduct",{product:result[0]})
    })

}

exports.updateproduct=(req,resp)=>{
    const {pid,pname,qty,price,mfgdate,cid}=req.body
   myconnection.query("update product set pname=?,qty=?,price=?,mfgdate=?,cid=? where pid=?",[pname,qty,price,mfgdate,cid,pid],(err,result,field)=>{
     if(err){
        resp.status(500).send("data not updated" +JSON.stringify(err));
      }else{
        console.log("data added"+result)
        resp.redirect("/product/getproducts")
      }
   })

}

//delete product from table
exports.deleteproduct=(req,resp)=>{
    myconnection.query("delete from product where pid=?",[req.params.pid],(err,result)=>{
        if(err){
            resp.status(500).send(JSON.stringify(err))
        }else{
            resp.redirect("/product/getProducts")
        }
    })
}


