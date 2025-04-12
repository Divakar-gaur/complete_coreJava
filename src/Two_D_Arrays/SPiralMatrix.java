package Two_D_Arrays;

public class SPiralMatrix {
    public static void main(String[] args) {
        int n=5;
        int [][] a=new int [n][n];
        int row=0;
        int col=-1;
        char ch='r';
        for (int i=1;i<=n*n;i++){
            switch (ch){
                case 'r' : {
                    col++;
                    a[row][col]=i;
                    if(col==a.length-1 || a[row][col+1]!=0)
                        ch='d';
                }
                break;
                case 'd' : {
                    row++;
                    a[row][col]=i;
                    if(row==a.length-1 || a[row+1][col]!=0)
                        ch='l';
                }
                break;
                case 'l' : {
                    col--;
                    a[row][col]=i;
                    if(col==0 || a[row][col-1]!=0)
                        ch='u';
                }
                break;
                case 'u' : {
                    row--;
                    a[row][col]=i;
                    if(row==0 || a[row-1][col]!=0)
                        ch='r';
                }
                break;
            }
        }
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
