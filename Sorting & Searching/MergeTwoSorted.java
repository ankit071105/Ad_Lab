import java.util.*;
public class MergeTwoSorted {
 
    public static void Mergetwosorted(int[] a,int[] b) {
      Arrays.sort(a);
      Arrays.sort(b);
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
             if(a[i] > b[0])
             {
               int t = a[i];
               a[i]=b[j];
               b[j]=t;
               Arrays.sort(b);
             }
        }
      }
      System.out.println("After Merge Sorting First Array"+Arrays.toString(a));
      System.out.println("After Merge Sorting Second Array"+Arrays.toString(b));
    }
    public static void main(String[] args) {
        int a[]={11,3,4,5,8};
        int b[]={1,6,2,9,7};
        Mergetwosorted(a, b);

    }
}