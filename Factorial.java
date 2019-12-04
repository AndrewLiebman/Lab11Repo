public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println(iterative(0));
    }
    /*
    public static long pureRecursive(int n)
    {

    }

    public static long tailRecursive(int n)
    {

    }

    private static long tail()
    {

    }
*/
    public static long iterative(int n)
    {
        long factorial = 1;

        for(int x = n; x > 0; x--)
        {
            factorial *= x;
        }
        return factorial;
    }
}
