class SmallestOfThree
{
 
    static int smallest(int x, int y, int z)
    {
        int c = 0;
 
        while (x != 0 && y != 0 && z != 0) {
            x--;
            y--;
            z--;
            c++;
        }
 
        return c;
    }
 
    public static void main(String[] args)
    {
        int x = 1, y = 2, z = 3;
 
        System.out.printf("Minimum of 3"
                              + " numbers is %d",
                          smallest(x, y, z));
    }
}