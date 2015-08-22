import java.math.*;

public class Data {
    int count;
    float vFloat;

    Data() {
        System.out.println("Invoke constructor Data");
    }

    public void run1() {
        int i = 0;
        while (true) {
            System.out.println("i = " + i);
            i++;
            if (i == 10) {
                break;
            }
        }
    }

    public void run2() {
        int i = 0;
        boolean d = true;
        while (d) {
            System.out.println("i = " + i);
            i++;
            if (i == 10) {
                d = false;
            }
        }
    }

    public void run3() {
        for (int dayOfWeek = 1; dayOfWeek <= 8; dayOfWeek++) {
            switch (dayOfWeek) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Week-day");
                    break;
                case 6:
                case 7:
                    System.out.println("Week-end");
                    break;
                default:
                    System.out.println();
            }
        }
    }

    public void run4() {
        int i, aa[] = new int[100000];
        aa[0] = 1000;
        for (i = 0; i < 99999; i++) {
            aa[i + 1] = aa[i] + 3;
            System.out.println("aa [" + i + "] = " + aa[i] + " n = " + ((int) Math.log10(aa[i]) + 1));
            if (((int) Math.log10(aa[i]) + 1) <= 5) {
                break;

            }

        }
    }

    public void posled() {
        int i;
        int a[] = new int[100];
        a[0] = 1;

        for (i = 0; i < 100; i++) {
            a[i + 1] = a[i] + 2;
            System.out.println("a[" + i + "]= " + a[i]);
            if (i == 54) {
                break;
            }
        }

    }

    public void maxIndex() {
        int a[] = new int[12];

        int max = a[0], i, ind = 0;
        //int ind=i;
        //a[0]=5;
        //System.out.println(rnd);
        for (i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 31 - 15);
            // a[i]=3;
            System.out.println("a[" + i + "]= " + a[i]);

        }
        for (i = 0; i < a.length; i++) {
            if (a[i] > a[ind]) {
                //max=a[i];
                ind = i;

            }
        }
        System.out.println("max= " + a[ind] + " index= " + ind);

    }

    public void run5() {
        int m[] = new int[8];
        int i, ind;
        for (i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 10 + 1);
            System.out.print("m[" + i + "]=" + m[i] + " ");
            //System.out.println();

        }
        System.out.println();
        for (i = 0; i < m.length; i++) {
            if (i % 2 != 0) {
                m[i] = 0;
            }
            System.out.print("m[" + i + "]=" + m[i] + " ");
        }
        System.out.println();


    }

    public void kvdrat() {
        int i, j, k[][] = new int[5][5];
        for (i = 0; i < k.length; i++) {
            for (j = 0; j < k.length; j++) {
                k[i][j] = (int) (Math.random() * 31 - 15);
                System.out.print("k[" + i + "][" + j + "]=" + k[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < k.length; i++) {
            for (j = 0; j < k.length; j++) {
                if (k[i][j] < 0) k[i][j] = 0;
                else k[i][j] = 1;
                System.out.print("k[" + i + "][" + j + "]=" + k[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void maxStok() {
        int i, j, maxS, t[][] = new int[6][7];
        maxS = 0;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 7; j++) {
                t[i][j] = (int) (Math.random() * 9);
                System.out.print("t[" + i + "][" + j + "]=" + t[i][j] + " | ");
            }
            System.out.println();
        }
        for (i = 0; i < 6; i++) {
            maxS = t[i][0];
            for (j = 0; j < 7; j++) {
                if (t[i][j] > maxS) maxS = t[i][j];
            }
            System.out.println();
            System.out.print("max=" + maxS + " ");
            System.out.println();
            t[i][0] = maxS;
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print("t[" + i + "][" + j + "]=" + t[i][j] + " | ");
            }
            System.out.println();
        }


    }

    public void glDiog() {
        int i, j, kol, sum, a[][] = new int[5][5];
        sum = 0;
        kol = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 21 - 10);
            }
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (i < j && a[i][j] > 0) {

                    System.out.println("==="+a[i][j]);
                    sum+=a[i][j];
                    kol++;
                }

            }
        }
       System.out.println("summa="+sum);
        System.out.println("kolichestvo="+kol);
    }

}
