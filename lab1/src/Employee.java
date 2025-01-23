public class Employee extends Person {
    private int salary;
    private Position occupation;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
        this.occupation = Position.ASYSTENT;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return occupation;
    }

    public void promote() {
        switch (this.occupation) {
            case ASYSTENT:
                this.occupation = Position.ADIUNKT;
                break;
            case ADIUNKT:
                this.occupation = Position.PROFESOR;
                break;
            case PROFESOR:
                break;
        }
    }

    @Override
    public String toString() {
        return "Pracownik: " + getName() +
                "\nPensja: " + salary +
                "\nEtat: " + occupation + "\n";
    }
}