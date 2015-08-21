/**
 * Created by mld-sd on 17.08.15.
 */
public class MoreData {
    Data objData;
    int color;

    MoreData(Data objD) {
        System.out.println("Invoke constructor MoreData");
        System.out.println("count = " + objD.count + " ," + " vFloat = " + objD.vFloat);
        objData = objD;
    }
}
