public class CheckReverse {
    public static void Reverse(int[] a) {
          boolean t= false;
          for (int i = 0; i < a.length; i++) {
            if (a[i] < a[i+1]) {
                t=true;
                break;
            }
          }
        if (t) {
            System.out.println("Yes it is sorted After reverse");
        }else{
            System.out.println("No it is not sorted After reverse");
        }
    }
        public static void main(String[] args) {
        int a[]={0,1,3,2,4,5};
        Reverse(a);
    }
}
