class Main {
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }

        static long factorial(int n)
        {
        //long retVal=1;
        //if (n==1)
       // {
       //     retVal=1; //factorial of 1 = 1 (1!=1)
       // }
       // else {
        //    System.out.println(n);
        //    retVal = n*factorial(n-1); //2! = 2*1!
       // }
       //retVal = (n==1)?1:n*factorial(n-1);
       // return retVal;
return (n==1)?1:n*factorial(n-1);
        }

    }
