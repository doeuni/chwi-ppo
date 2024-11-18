const fs = require("fs")
let arr = fs.readFileSync(0).toString().trim().split("\n")

// console.log("arr" , arr);

//arr[0] => 과목의 수
//arr[1] => 학점들

// if (avg >= 4.0 ) {
//     console.log("Perfect")
// } else if (avg >= 3.0 ) {
//     console.log("Good")
// } else if (avg < 3.0 ) {
//     console.log("Poor")
// };

// 1. 평균학점 출력하는 거 까지
let sum = 0;
let avg = arr[1].split(" ").map(Number).forEach((val) => {
    sum += val / arr[0]
}); 

console.log(sum.toFixed(1))

if ((sum.toFixed(1))>4.0) {
    console.log("Perfect")
} else if ((sum.toFixed(1))>3.0){
    console.log("Good")
} else if ((sum.toFixed(1))< 3.0) {
    console.log("Poor")
}