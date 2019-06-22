
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khalil
 */
public class Main {

 int a;
static int [] arr;

Scanner input=new Scanner(System.in);
   static public int fib(int n){
       arr=new int [n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<=n;i++){ 
            arr[i]=arr[i-1]+arr[i-2];
        }
    
    return arr[n];
    }
    public static void main(String[] args) {
        Main g=new Main();
        int a2=150;
       // Main.a2=input.nextInt();
        System.out.print(fib(a2));
    }
    
}
