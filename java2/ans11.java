public class ans11 {
    public static void main(String[] args) {

        int i = 0, j, s = 0, t = 1;

        while (i < 10) {
            s = s + i;
            j=i;
            while (j > 0) {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }

}
