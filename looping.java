package tugas_perulangan;
public class soal1 {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 32) {
            System.out.print(i+ " ");
            i += 2;
        }System.out.println(" ");
        int x = 25;
        while (x >= -45) {
            System.out.print(x+ " ");
            x -= 5;
        }System.out.println(" ");
        int o =1 , p=0;
        while (o<=211) {
            System.out.print(o + " ");
            o = o + p;
            p = p+2;
        }System.out.println(" ");
        int a =1 , b=0;
        while (a<=121) {
            System.out.print(a + " ");
            a = a + b;
            b = b+1;
        }System.out.println(" ");
        int q = 0, w=1, e, r = 16, t = 2;
        System.out.print(q+ " " + w);
        while (t < r) {
            e = q+w;
            System.out.print( " "+e);
            q = w;
            w = e;
            t++;
        }
    }
}
