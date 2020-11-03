package fr.hamza;

/**
 * Hello world!
 */
public final class LeapYear {
    private LeapYear() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

    public static boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    public static boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

    public static boolean isDivisibleBy100NotBy400(int year) {
        return isDivisibleBy100(year) && !isDivisibleBy400(year);
    }

    public static boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    public static boolean isDivisibleBy4NotBy100(int year) {
        return isDivisibleBy4(year) && !isDivisibleBy100(year);
    }

    public static boolean isLeapYear(int year) {
        return isDivisibleBy4NotBy100(year) || isDivisibleBy400(year);
    }
}
