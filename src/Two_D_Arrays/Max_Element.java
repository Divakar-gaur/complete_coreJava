package Two_D_Arrays;

public class Max_Element {
    public static void main(String[] args) {
        int a [][]={{2,4,3},{8,7,4},{1,5,0}};
        int max=a[0][0];
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>max) max=a[i][j];
            }
        }
        System.out.println("max element is " + max);
    }
}
