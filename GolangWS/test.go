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
