const fs = require("fs");
let tmp = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let sum = 0 
// let avg = sum =+ tmp
tmp.forEach(num => sum += num )
// console.log(sum)
let avg2 = sum / 8
console.log(avg2.toFixed(1))