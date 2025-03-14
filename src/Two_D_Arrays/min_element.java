package Two_D_Arrays;

public class min_element {
    public static void main(String[] args) {
        int a [][]={{2,4,3},{8,7,4},{4,1,5}};
        int min=a[0][0];
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]<min) min=a[i][j];
            }
        }
        System.out.println("min element is " + min);
    }
}
