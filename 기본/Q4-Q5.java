public void Main
{
    private static int med3(int a, int b, int c){
        if(a>=b)
            if(b>=c)
                return b;
            else if(a>c)
                return c;
            else
                return a;
        else if(a>=c)
            return a;
        else if(c>=b)
            return b;
        else
            return c;
    }
    public static void main(String[] args){
      System.out.println(med3(3,3,2));
    }
}
