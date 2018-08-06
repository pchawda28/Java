public class InTheFuture
{

    static int minNum(int A,int K,int P){

    if(A>K)
        return -1;
     int daysRequired= P/(K-A)+1;

     return daysRequired;
    }

    public static void main(String[] args)
    {
        System.out.println(minNum(3,5,1));
    }

}
