function display<T>(value: T): void {
    console.log(value);
}

display<number>(100);
display<string>("Hello TypeScript");
display<boolean>(true);

display(100);
display("Hello");

interface ApiResponse<T> {
    status: number;
    message: string;
    data: T;
}

interface Student {
    sid: number;
    sname: string;
}

let response: ApiResponse<Student> = {
    status: 200,
    message: "Success",
    data: {
        sid: 101,
        sname: "Amit"
    }
};

console.log(response.data.sname);