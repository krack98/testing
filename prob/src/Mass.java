/**
 * Created by mld-sd on 17.08.15.
 */
public class Mass {
    public static void main(String args[]) {
        Data objD = new Data();

        objD.count = 3;
        objD.vFloat = (float) 1.3;
        System.out.println("count= " + objD.count);
        System.out.println("vFloat=" + objD.vFloat);
        System.out.println();

        // objD.run1();
        //System.out.println("______");
        //objD.run2();
        // objD.run3();
        // objD.run4();  //8
        //objD.posled();  //9
        // objD.maxIndex();  //29
        //objD.run5();  //26
        //objD.kvdrat(); //40
       // objD.maxStok(); //32
        //objD.glDiog();//34


        System.out.println();
        MoreData objMD = new MoreData(objD);


    }
}
