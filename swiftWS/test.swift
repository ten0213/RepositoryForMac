func getHello(person: String) -> String {
    return "Hello \(person)!\n";
}

// write _ to use no argument label
func sayHello(_ helloMsg: String) {
   print(helloMsg);
}

let hello: String = getHello(person: "JaeHyeon");

sayHello(hello);