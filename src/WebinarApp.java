import java.util.Scanner;

public class WebinarApp {
    private final static int FIRST_INDEX = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Size of array: ");
        int size = scanner.nextInt();

        WebinarRepository webinarRepository = new WebinarRepository(size);

        int option;
        do {
            System.out.println("--------- Webinar App ---------");
            System.out.println("1 - add");
            System.out.println("2 - display");
            System.out.println("3 - find");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine(); // \n

            String title;
            Webinar webinar;
            switch (option) {
                case 1:
                    System.out.print("Title: ");
                    title = scanner.nextLine();

                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    System.out.print("Link: ");
                    String link = scanner.nextLine();

                    webinar = new Webinar(title, description, link);
                    webinarRepository.add(webinar);
                    break;
                case 2:
                    webinarRepository.displayAll();
                    break;
                case 3:
                    System.out.print("Title: ");
                    title = scanner.nextLine();
                    webinar = webinarRepository.find(title, FIRST_INDEX);
                    if (webinar != null) {
                        System.out.println(webinar);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
            }
        } while (option != 0);
    }
}
