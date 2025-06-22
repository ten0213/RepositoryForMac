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

## 12. Spring Boot 실행

* cd SpringWS/test && code -r .
* 네비게이션 바에서 Springboot Dashboard 클릭 후 run 버튼 클릭
* 접속 중지 후 cd .. && cd .. && code -r . 실행
* 접속 주소 : <http://localhost:8088/home/index>
* 접속 중지 :  control + c

## 13. React 실행(실행 취소 후 "cd .." 2번 실행하여 복귀해야 함)

* cd ReactWS/test && npm start
* 접속 주소 : <http://localhost:3000>
* 접속 중지 : control + c

## 14. Vue 실행(실행 취소 후 "cd .." 2번 실행하여 복귀해야 함)

* cd VueWS/test && npm run serve
* 접속 주소 : <http://localhost:8082>
* 접속 중지 : control + c

## 15. kotlin 실행

* cd KotlinWS && kotlinc test.kt -include-runtime -d test.jar && java -jar test.jar && cd ..

## 16. SQL 실행

* SqlWS 폴더에서 SQL 파일 열기
* SQL 문을 작성 후 실행
* control + command + enter로 SQL 문 실행
* 접속 해제는 왼쪽 사이드바에서 "SQL Tools" 선택 후 disconnect 버튼 클릭
* 왼쪽 사이드바에서 "SQL Tools" 선택 후 연결하면 파일이 새로 생성되어 버리므로, disconnect만 사용해야 함

## 17. WEB 페이지 실행

* 모두 작성 후 오른쪽 아래에 있는 "Go Live" 버튼 클릭으로 실행 가능함

## 18. Git 파일 색상 비활성화

* Git 색상 비활성화는 settings.json 파일에서 ""git.decorations.enabled": false"로 설정 가능함
