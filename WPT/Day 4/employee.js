class Person{
    
    constructor(id,name,mob){
        this.id=id;
        this.name=name;
        this.mobile=mob
    }
    display(){
        return `Id: ${this.id} Name: ${this.name} Mobile: ${this.mobile}`
    }
}
class Employee extends Person{
    constructor(id,name,mob,dept,desg){
        super(id,name,mob);
        this.dept=dept==="undefine"?"Hr":dept
        this.desg=desg==="undefine"?"Mgr":desg
    }
    display(){
        return super.display()+` Dept : ${this.dept} Desg:${this.desg}`;
    }
}

e1=new Employee(12,"Saket",12345,"Admin","Assistant");
