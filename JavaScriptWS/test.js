// program to find the factors of an integer
console.log("hello world!");
// take input
const num = prompt('Enter a positive number: ');

console.log(`The factors of ${num} is:`);

function main() {
    for(let i = 1; i <= num; i++) {

    // check if number is a factor
    if(num % i == 0) console.log(i);

    }

}

// looping through 1 to num
