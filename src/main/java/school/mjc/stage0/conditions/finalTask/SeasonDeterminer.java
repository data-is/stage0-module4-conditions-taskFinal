package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 5:
            case 3:
            case 4:
                System.out.println("Sprint");
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
            default:
                System.out.println("Wrong month number");

        }
    }
}
