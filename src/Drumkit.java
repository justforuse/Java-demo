/**
 * Created by Administrator on 2017/4/8.
 */
public class Drumkit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}

class DrumkitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();

        Drumkit[] ds = new Drumkit[3];
        System.out.print(ds[1]);
        d.playSnare();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }

        d.playTopHat();
    }
}
