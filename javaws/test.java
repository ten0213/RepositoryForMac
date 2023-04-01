package javaws;
import java.util.Calendar;

public class test {
    /*
     * 달력 출력
     *
     * firstDayOfWeek: 1일의 요일
     *    월:1, 화:2, ... 토:6, 일:7
     *
     * lastDay: 마지막 날짜
     */
    static void printCalendar(int firstDayOfWeek, int lastDay) {
        for(int i=1; i<lastDay; i++) {
            if(firstDayOfWeek == 1) {
                if(i == 7 || i == 14 || i == 21 || i == 28) {
                    System.out.println();
                }
                System.out.print(i + " ");
                continue;
            }
            else if(firstDayOfWeek == 2) {
                if(i == 6 || i == 13 || i == 20 || i == 27) {
                    System.out.println();
                }
                System.out.print(i + " ");
                continue;
            }
            else if(firstDayOfWeek == 3) {
                if(i == 5 || i == 12 || i == 19 || i == 26) {
                    System.out.println();
                }
                System.out.print(i + " ");
                continue;
            }
            else if(firstDayOfWeek == 4) {

                if(i == 4 || i == 11 || i == 18 || i == 25) {
                    System.out.println();
                }
                System.out.print(i + " ");
                continue;
            }
            else if(firstDayOfWeek == 5) {
                if(i == 3 || i == 10 || i == 17 || i == 24) {
                    System.out.println();
                }
                System.out.print(i + " ");
                continue;
            }
            if(firstDayOfWeek == 6) {
                if(i == 2 || i == 9 || i == 16 || i == 23) {
                    System.out.println();
                }
                System.out.print(i + " ");
                continue;
            }
            if(firstDayOfWeek == 7) {
                if(i == 1 || i == 8 || i == 15 || i == 22) {
                    System.out.println();
                }
                System.out.print(i + " ");
                continue;
            }
        }
    }

    public static void main(String[] args) {
        // 2015년 7월
        int year = 2015, month = 7;

        // 2015년 7월 1일의 요일 구하기
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1, 0, 0);
        int 요일 = calendar.get(Calendar.DAY_OF_WEEK);

        // 2015년 7월의 마지막 날짜 구하기
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        int 마지막날 = calendar.get(Calendar.DATE);

        // 달력 출력
        printCalendar(요일, 마지막날);
    }
}
