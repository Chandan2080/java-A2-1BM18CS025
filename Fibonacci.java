import java.util.*;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();
        fibo(n);
    }
    static void fibo(int x){
        int n3=0 , y;
        int n1=0;
        int n2=1;
        if(x==1)
            System.out.println("Value is  " + n1);
        else if(x==2)
            System.out.println("VAlue is  " + n2);
        else{
            for(y=2;y<x;y++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.println("Value is:\t"+n3);
        }
    }
}
