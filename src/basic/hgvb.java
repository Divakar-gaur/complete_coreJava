package basic;

public class hgvb {
    public static void main(String[] args) {
        int n = 875676342;

        pw(n / 10000000, " crores ");
        pw((n / 100000) % 100, " lakhs ");
        pw((n / 1000) % 100, " thousand ");
        pw((n / 100) % 10, " hundred ");
        pw((n % 100), " ");
    }

    public static void pw(int num, String s) {
        String[] one = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};

        String[] two = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};

        if (num <= 19) {
            System.out.print(one[num]);
        } else System.out.print(two[num / 10] + " " + one[num % 10]);

        if (num != 0) System.out.print(s);
    }
}
