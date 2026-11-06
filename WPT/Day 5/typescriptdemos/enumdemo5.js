"use strict";
var Direction;
(function (Direction) {
    Direction[Direction["North"] = 0] = "North";
    Direction[Direction["South"] = 1] = "South";
    Direction[Direction["East"] = 2] = "East";
    Direction[Direction["West"] = 3] = "West";
})(Direction || (Direction = {}));
console.log(Direction.North); // 0
console.log(Direction.South); // 1
console.log(Direction.East); // 2
console.log(Direction.West); // 3
var OrderStatus;
(function (OrderStatus) {
    OrderStatus[OrderStatus["Pending"] = 1] = "Pending";
    OrderStatus[OrderStatus["Approved"] = 2] = "Approved";
    OrderStatus[OrderStatus["Rejected"] = 3] = "Rejected";
})(OrderStatus || (OrderStatus = {}));
let mystatus = OrderStatus.Approved;
console.log(mystatus); // 2
var PaymentMode;
(function (PaymentMode) {
    PaymentMode["CASH"] = "CASH";
    PaymentMode["CARD"] = "CARD";
    PaymentMode["UPI"] = "UPI";
})(PaymentMode || (PaymentMode = {}));
let payment = PaymentMode.UPI;
console.log(payment);
