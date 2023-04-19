#include "test.h"
using namespace std;

// The class
class MyClass
{
public: // Access specifier
  MyClass()
  { // Constructor
    cout << "Hello World~!\t 안녕~" << endl;
  }
};

int main()
{
  MyClass myObj; // Create an object of MyClass (this will call the constructor)
  return 0;
}
