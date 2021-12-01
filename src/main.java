import DayOne.SonarThreeCheck;
import DayOne.SonarUpDown;

import java.io.File;

public class main {

    public static void main(String[] args) {
        SonarUpDown upOrDown = new SonarUpDown(new File("C:\\Users\\Beck\\Desktop\\Projects\\AdventOfCode2021\\src\\DayOne\\depths.txt"));
        SonarThreeCheck upDown2 = new SonarThreeCheck(new File("C:\\Users\\Beck\\Desktop\\Projects\\AdventOfCode2021\\src\\DayOne\\depths.txt"));
        System.out.println(upOrDown.numOfChanges(true));
        System.out.println(upDown2.numOfChanges(true));
    }
}
