package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean check = (year % 4 ==0 && year % 100 !=0 && year > 0 );
        switch (month){
            case 4: case 6: case 9: case 11: System.out.println("30"); break;
            case 2: System.out.println(check ? "29" : "28"); break;
            default: System.out.println("31"); break;
        }
    }
}
