// This is a simple Go program that prints "Hello World!" to the console,
// prompts the user for input, and then prints the input back to the console.
// It also demonstrates the use of the os package to exit the program.
// It is a basic example of how to use the fmt and os packages in Go.
package main

import (
	"fmt"
	"os"
)

func main() {
	fmt.Println("Hello World!")

	var input string
	fmt.Print("Enter something: ")
	fmt.Scanln(&input)
	fmt.Println("You entered:", input)

	os.Exit(0)
}
