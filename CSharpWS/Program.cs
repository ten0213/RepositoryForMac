namespace test
{
    class Program
    {
        readonly int a = 1000;
        int Aa() {
            return a;

        }
        // 프로그램 실행이 시작되는 곳
        static void Main()
        {
            Console.WriteLine("Hello world!");
            Program p = new();
            Console.WriteLine(p.Aa());

        }
    }
}
