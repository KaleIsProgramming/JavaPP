import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(0);

        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;

        while (runProgram) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj element na listę");
            System.out.println("2. Wyświetl aktualny stan listy");
            System.out.println("3. Posortuj listę");
            System.out.println("4. Wyświetl największy element na liście");
            System.out.println("5. Wyświetl najmniejszy element na liście");
            System.out.println("6. Wyczyść listę (i ustaw wartość początkową)");
            System.out.println("7. Zakończ program");
            System.out.print("Wybierz opcję (1-7): ");

            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Proszę wprowadzić liczbę całkowitą (1-7)!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Podaj liczbę (double), którą chcesz dodać: ");
                    if (scanner.hasNextDouble()) {
                        double val = scanner.nextDouble();
                        myList.add(val);
                        System.out.println("Dodano " + val + " do listy.");
                    } else {
                        System.out.println("Niepoprawny typ danych!");
                        scanner.nextLine();
                    }
                }
                case 2 -> {
                    System.out.println("Zawartość listy: " + myList);
                }
                case 3 -> {
                    myList.sort();
                    System.out.println("Lista została posortowana.");
                }
                case 4 -> {
                    double maxVal = myList.max();
                    System.out.println("Największy element na liście to: " + maxVal);
                }
                case 5 -> {
                    double minVal = myList.min();
                    System.out.println("Najmniejszy element na liście to: " + minVal);
                }
                case 6 -> {
                    System.out.print("Podaj nową wartość dla listy (double): ");
                    if (scanner.hasNextDouble()) {
                        double val = scanner.nextDouble();
                        myList.clear(val);
                        System.out.println("Lista wyczyszczona, pierwszy element = " + val);
                    } else {
                        System.out.println("Niepoprawny typ danych!");
                        scanner.nextLine();
                    }
                }
                case 7 -> {
                    runProgram = false;
                    System.out.println("Kończenie działania programu...");
                }
                default -> {
                    System.out.println("Nie ma takiej opcji w menu. Spróbuj ponownie.");
                }
            }
        }

        scanner.close();
    }
}