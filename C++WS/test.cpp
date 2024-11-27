#include "test.h"
using namespace std;

class Point
{
public:
    void SetXY(int a, int b)
    {
        x = a;
        y = b;
    }
    void Print() { cout << "(" << x << ", " << y << ")" << endl; }

private:
    int x;
    int y;
};
int main()
{
    Point pt1;
    pt1.SetXY(3, 4);
    pt1.Print();
    cout << "hello" << endl;
    return 0;
}
