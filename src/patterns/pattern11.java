package patterns;

public class pattern11 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==5||j==3){
                    System.out.print("I ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==5||j==1){
                    System.out.print("L ");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();



        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==5||j==5){
                    System.out.print("O ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();



        int n=9;
        for (int i=1;i<=n/2+1;i++){
            for(int j=1;j<=n;j++){
                if(j==i || i+j==n+1 ){
                    System.out.print("V");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();





        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==3||i==5||j==1){
                    System.out.print("E ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==5||j==1||i==5){
                    System.out.print("U ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();




        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                if((i==0 && j%3!=0)|| (i==1&&j%3==0)||(i-j==2)||(i+j==8)){
                    System.out.print(" S ");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
