// program to find the factors of an integer

// take input

console.log('The factors of 12 is:');

// looping through 1 to num
for(let i = 1; i <= 100; i++) {

    // check if number is a factor
    if(100 % i == 0) {
        console.log(i);
    }
}