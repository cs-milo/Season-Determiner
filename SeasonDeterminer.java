import java.util.Scanner;

public class SeasonDeterminer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for month and day
        System.out.print("Enter a month (1 - 12): ");
        int month = input.nextInt();
        System.out.print("Enter a day (1 - 31): ");
        int day = input.nextInt();

        // Figure out the season with conditions
        String season;
        if ((month == 12 && day >= 21) || (month == 1) || (month == 2) || (month == 3 && day < 20)) {
            season = "Winter";
        } else if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day < 21)) {
            season = "Spring";
        } else if ((month == 6 && day >= 21) || (month == 7) || (month == 8) || (month == 9 && day < 22)) {
            season = "Summer";
        } else {
            season = "Fall";
        }

        // Show the result to the user
        System.out.println("The season is: " + season);

        input.close();
    }
}
