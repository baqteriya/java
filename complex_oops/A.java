class A
    {
         static int b=10;
        int c=10;
        public static void main(String args[])
        {
            int a=10;
            A ref=new A();
            System.out.println (a);
            System.out.println (A.b);
            System.out.println(ref.c);
        }
        }
    