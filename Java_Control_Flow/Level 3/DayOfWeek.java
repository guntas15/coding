public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        int dayOfWeek = (h + 6) % 7; // 0 = Sunday

        System.out.println("Day of week (0=Sunday to 6=Saturday): " + dayOfWeek);
    }
}
