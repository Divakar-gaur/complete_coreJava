package array;

import java.util.Arrays;

public class removeDuplicateElements {
    public static void main(String[] args) {
        int [] n={3,5,4,7,6,5,4,3};
        int [] ans=RemDup(n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] RemDup(int [] original){
        int med[]=new int[original.length];
        int index=0;
        for(int i=0;i< original.length;i++){
            boolean flag=false;
            for(int j=0;j<index;j++){
                if(original[i]==med[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                med[index]=original[i];
                index++;
            }
        }
        int [] ans=new int[index];
        for (int i=0;i<index;i++){
            ans[i]=med[i];
        }
        return ans;
    }
}
