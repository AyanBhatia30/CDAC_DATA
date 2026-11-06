enum Direction {
    North,
    South,
    East,
    West
}

console.log(Direction.North); // 0
console.log(Direction.South); // 1
console.log(Direction.East); // 2
console.log(Direction.West); // 3

enum OrderStatus {
    Pending = 1,
    Approved = 2,
    Rejected = 3
}

let mystatus: OrderStatus = OrderStatus.Approved;

console.log(mystatus); // 2

enum PaymentMode {
    CASH = "CASH",
    CARD = "CARD",
    UPI = "UPI"
}

let payment: PaymentMode = PaymentMode.UPI;

console.log(payment);