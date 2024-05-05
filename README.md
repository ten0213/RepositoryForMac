# 터미널에서 바로 파일들을 실행하는 방법

## 1. C 실행

* cd CWS && gcc test.c -o test.out && ./test.out && cd ..

## 2. C++ 실행

* cd C++WS && g++ test.cpp -o test.out && ./test.out && cd ..
* cd C++WS && g++ -std=c++14 -Wall test.cpp -o test.out && ./test.out && cd ..

## 3. C# 실행

* cd C#WS && dotnet run Program.cs && cd ..

## 4. Python 실행

* cd PythonWS && python3 test.py && cd ..

## 5. Java 실행

* cd javaws && javac test.java && java test.java && cd ..

## 6. Javascript 실행

* cd JavaScriptWS && node test.js && cd ..

## 7. Typescript 실행

* cd TypeScriptWS && ts-node test.ts && cd ..

## 8. swift 실행

* cd SwiftWS/Sources/SwiftWS && swift main.swift && cd .. && cd .. && cd ..

## 9. Golang 실행

* cd GolangWS && go run test.go && cd ..

## 10. Rust 실행

* cd rustws/src && rustc main.rs && ./main && cd .. && cd ..

## 11. Ruby 실행

* cd RubyWS && ruby test.rb && cd ..

## 12. Spring Boot 실행(실행 취소 후 "cd .." 2번 실행하여 복귀해야 함)

* cd /Users/hwangjaehyeon/VScodeWS/SpringWS/test ; /usr/bin/env /Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/bin/java @/var/folders/5p/lx0fvq710kx5mk749dgtc2cr0000gn/T/cp_d1d4js03u1utlnc4iqnp3mqeg.argfile net.skhu.TestApplication

## 13. React 실행(실행 취소 후 "cd .." 2번 실행하여 복귀해야 함)

* cd ReactWS/test && npm start

## 14. Vue 실행(실행 취소 후 "cd .." 2번 실행하여 복귀해야 함)

* cd VueWS/test && npm run serve

## 15. kotlin 실행

* cd KotlinWS && kotlinc test.kt -include-runtime -d test.jar && java -jar test.jar && cd ..
