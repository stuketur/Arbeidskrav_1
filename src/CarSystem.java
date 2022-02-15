import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSystem {

    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Car> carList = new ArrayList<>();

    static void printMenu() {
        String menu = "** CAR SYSTEM MENU **\n";
        menu += "1 - Register new person\n";
        menu += "2 - Register new truck\n";
        menu += "3 - Register new van\n";
        menu += "4 - Register new personal car\n";
        menu += "5 - Add test data\n";
        menu += "6 - Display all owners and their cars\n";
        menu += "7 - Shut down system\n";

        System.out.println(menu);
    }

    public void menu() {

        int choice = 0;
        while (choice != 7) {
            printMenu();
            choice = getChoice();
            switch (choice) {
                case 1:
                    personList.add(createPerson());
                    break;
                case 2:
                    carList.add(createTruck());
                    break;
                case 3:
                    carList.add(createVan());
                    break;
                case 4:
                    carList.add(createPersonal());
                    break;
                case 5:
                    createTestData();
                    break;
                case 6:
                    display();
                    break;
                case 7:
                    System.out.println("System is shutting down...");
                    break;
                default:
                    System.out.println("Error: choose option 1, 2, 3 or 4");
                    break;
            }
        }
    }

    final Scanner scanner = new Scanner(System.in);

    int getChoice() {
        int i = getInteger();

        return i < 8 ? i : 0;
    }

    private int getInteger() {
        String choice = scanner.nextLine();
        choice = choice.replaceAll("[^\\d]", "");
        if (choice.matches("")) {
            return 0;
        }
        final int i = Integer.parseInt(choice);
        return i;
    }

    public Person createPerson() {
        var newPerson = new Person();
        System.out.print("Name: ");
        newPerson.setName(scanner.nextLine());
        System.out.println("Year of birth: ");
        newPerson.setBirthYear(getInteger());
        return newPerson;
    }

    public Truck createTruck() {
        var newTruck = new Truck();
        System.out.println(personList);
        System.out.print("Choose one of the owners listed above: ");
        newTruck.setOwnedBy(getInteger());
        System.out.print("Producer: ");
        newTruck.setProducer(scanner.nextLine());
        System.out.print("Name: ");
        newTruck.setName(scanner.nextLine());
        System.out.print("Production year: ");
        newTruck.setProductionYear(getInteger());
        System.out.print("Mileage: ");
        newTruck.setMileage(getInteger());
        System.out.print("Mileage date: ");
        newTruck.setMileageDate(scanner.nextLine());
        return newTruck;
    }

    public Van createVan() {
        var newVan = new Van();
        System.out.println(personList);
        System.out.print("Choose one of the owners listed above: ");
        newVan.setOwnedBy(getInteger());
        System.out.print("Producer: ");
        newVan.setProducer(scanner.nextLine());
        System.out.print("Name: ");
        newVan.setName(scanner.nextLine());
        System.out.print("Production year: ");
        newVan.setProductionYear(getInteger());
        System.out.print("Mileage: ");
        newVan.setMileage(getInteger());
        System.out.print("Mileage date: ");
        newVan.setMileageDate(scanner.nextLine());
        return newVan;
    }

    public Personal createPersonal() {
        var newPersonal = new Personal();
        System.out.println(personList);
        System.out.print("Choose one of the owners listed above: ");
        newPersonal.setOwnedBy(getInteger());
        System.out.print("Producer: ");
        newPersonal.setProducer(scanner.nextLine());
        System.out.print("Name: ");
        newPersonal.setName(scanner.nextLine());
        System.out.print("Production year: ");
        newPersonal.setProductionYear(getInteger());
        System.out.print("Mileage: ");
        newPersonal.setMileage(getInteger());
        System.out.print("Mileage date: ");
        newPersonal.setMileageDate(scanner.nextLine());
        return newPersonal;
    }

    public void display() {
        for (Person person : personList) {
            person.display();
            for (Car car : carList) {
                if (car.getOwnedBy() == person.id) {
                    car.display();
                }
            }
        }
    }

    public void createTestData() {
        Person person1 = new Person ("Daniel Engelstad", 2000);
        Person person2 = new Person ("Navn Generisk", 1943);
        Person person3 = new Person ("Saniel Satanstad", 2003);
        Person person4 = new Person ("Navnar Navnesen", 1982);
        personList.addAll(List.of(new Person[]{person1, person2, person3, person4}));

        Car car1 = new Truck("Volvo", "FM LNG",  2016, 42000, "2018-06-06", person1);
        Car car2 = new Van("Ford", "Transit", 2021, 3020, "2022-02-15", person2);
        Car car3 = new Personal("Toyota", "Prius", 2009, 162903, "2021-10-11", person3);
        Car car4 = new Personal("Ferrari", "F150", 2019, 50006, "2020-03-01", person4);
        carList.addAll(List.of(new Car[]{car1, car2, car3, car4}));


    }
}
