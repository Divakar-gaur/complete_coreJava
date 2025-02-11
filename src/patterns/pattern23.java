public class pattern23 {
    public static void main(String[] args) {
        int n=5;
        int st=2*n-1;
        int sp=0;
        char ch='A';
        int num=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sp;j++) System.out.print("  ");
            for (int j=1;j<=st;j++) {
                if(i==1||j==1||j==st){
                    System.out.print(ch+" ");
                    ch++;
                }
                else {
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
            sp++;
            st-=2;
        }
    }
}
