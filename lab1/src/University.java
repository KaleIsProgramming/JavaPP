public class University {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Student("Nowak", Major.INFORMATYKA);
        people[1] = new Student("Kowalska", Major.TELEKOMUNIKACJA);
        people[2] = new Student("Biernacki", Major.MATEMATYKA);

        people[3] = new Employee("Malinowski", 3000);
        people[4] = new Employee("Zielinska", 4000);

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student) people[i];
                short grade = (short) (6 - i);
                student.addGrade(grade);
            }
        }

        System.out.println("=== Informacje o wszystkich studentach (pętla foreach) ===");
        for (Person person : people) {
            if (person instanceof Student) {
                System.out.println(person);
            }
        }

        System.out.println("=== Informacje o wszystkich studentach (pętla while) ===");
        int index = 0;
        while (index < people.length) {
            if (people[index] instanceof Student) {
                System.out.println(people[index]);
            }
            index++;
        }

    }
}