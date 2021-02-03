package modulo1.aula5;

public class Aula05 {

    public static void main(String[] args) {

        // EX1

        boolean b = false;
        int[] v = new int[6];
        v[0] = 12;
        v[1] = 23;
        v[2] = 34;
        v[3] = 43;
        v[4] = 52;
        v[5] = 332;


        vector(v, b);

        System.out.println("------------------------------");

        // EX2

        int[] v2 = new int[3];
        v2[0] = 12;
        v2[1] = 23;
        v2[2] = 34;

        int[] v3 = new int[3];
        v3[0] = 12;
        v3[1] = 33;
        v3[2] = 34;

        juntarV(v2, v3);

        System.out.println("------------------------------");

        //EX3

        int[] v4 = new int[3];
        v4[0] = 12;
        v4[1] = 33;
        v4[2] = 34;

        inverter(v4);

        System.out.println("------------------------------");

        //EX4

        duplicar(v4);

        System.out.println("------------------------------");

        //EX5

        int[] v5 = new int[3];
        v5[0] = 122;
        v5[1] = 332;
        v5[2] = 342;

        duplInv(v5);

        System.out.println("------------------------------");

        //EX6

        int[] v6 = new int[5];
        v6[0] = 1222;
        v6[1] = 3322;
        v6[2] = 3422;
        v6[3] = 34222;
        v6[4] = 34122;

        woMiddle(v6);

    }

    //EX1

    public static void vector(int[] v, boolean b) {
        int count;

        if (v.length % 2 == 1) {
            b = true;
            count = (v.length / 2) + 1;
        } else {
            count = v.length / 2;
        }
        for (int i = 0; i<count; i++) {
            System.out.println(v[i]);
        }

        System.out.println(b);
    }

    //EX2

    public static void juntarV(int[] v1, int[] v2) {

        int[][] vJunto = new int[2][3];
        vJunto[0] = v1;
        vJunto[1] = v2;

        System.out.println(vJunto[1][1]);

    }


    //EX3

    public static void inverter(int[] v1) {

        int ver = 0;
        int[] vNew = new int[v1.length];

        for (int i = v1.length - 1; i >= 0; i--) {


            vNew[ver] = v1[i];
            ver++;

        }

        for (int i = 0; i < vNew.length; i++) {
            System.out.println(vNew[i]);
        }

    }

    // EX4

    public static void duplicar(int[] vx) {

        int[] vDup = new int[vx.length * 2];
        int count = 0;



        for (int i = 0; i < vx.length; i++) {

            vDup[count] = vx[i];
            count = count + 1;
            vDup[count] = vx[i];
            count = count + 1;

        }

        for (int i = 0; i < vDup.length; i++) {
            System.out.println(vDup[i]);
        }

    }

    //EX5

    public static void duplInv(int[] vxt) {
        int[] vDupInv = new int[vxt.length * 2];
        int ver = 0;

        for (int i = 0; i<vxt.length; i++) {
            vDupInv[i] = vxt[i];
        }

        for (int i = vDupInv.length - 1; i>=vxt.length; i--) {
            vDupInv[i] = vxt[ver];

            ver++;
        }

        for (int i = 0; i<vDupInv.length; i++) {
            System.out.println(vDupInv[i]);
        }


    }

    // EX6

    public static void woMiddle(int[] vxte) {

        int ver = 0;

        if (vxte.length % 2 == 0) {
            int[] vDupInvWo = new int[vxte.length];

            for (int i = 0; i < vDupInvWo.length; i++) {
                vDupInvWo[i] = vxte[i];
            }

            for (int i = 0; i < vDupInvWo.length; i++) {
                System.out.println(vDupInvWo[i]);
            }
        } else {
            int[] vDupInvWo = new int[vxte.length - 1]; // É menos um, o elemento do meio

            for (int i = 0; i <= (vDupInvWo.length / 2) - 1; i++) { // Fica com a primeira metade
                vDupInvWo[i] = vxte[i];
            }

            int seg = (vxte.length / 2) + 1;

            for (int i = vDupInvWo.length / 2 ; i <= vDupInvWo.length - 1; i++) {
                vDupInvWo[i] = vxte[seg];

                seg++;
            }

            for (int i = 0; i < vDupInvWo.length; i++) {
                System.out.println(vDupInvWo[i]);
            }
        }



    }

}
