package Two_D_Arrays;

public class PrimeNumbersInMatrics {
    public static void main(String[] args) {
        int [][] a= {{1,19,2},{11,3,7},{4,6,17}};

        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                boolean flag=true;
                int num=a[i][j];
                if (num==1) continue;
                for(int k=2;k<=num/2;k++){
                    if(num%k==0){
                        flag=false;
                        break;
                    }
                }
                if(flag) {
                    System.out.print(num + " ");
                }
            }
        }

    }
}
