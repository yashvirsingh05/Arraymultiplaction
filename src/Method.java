import java.util.Scanner;

class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int p=1;
                for(int j=0;j<n;j++){
                    if(i!=j){
                        p=p*arr[j];}
                    else
                    {
                        continue;
                    }
                }
                System.out.print(p+" ");
            }
        }
    }

