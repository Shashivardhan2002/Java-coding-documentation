import java.util.Scanner;

class patterns {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
         System.out.println("Enter size");
         int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=n;j>i-1;j--){
                System.out.print(n-j+1);
            }
             System.out.println("");
        }
    }
}
