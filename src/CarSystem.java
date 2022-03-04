import java.util.*;

public class CarSystem {

    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Car> carList = new ArrayList<>();

    ArrayList<Integer> personAgeList = new ArrayList<>();
    ArrayList<Integer> carAgeList = new ArrayList<>();
    ArrayList<Integer> carMileageList = new ArrayList<>();

    Calendar calendar = Calendar.getInstance();

    static void printMenu() {
        String menu = "** CAR SYSTEM MENU **\n";
        menu += "1 - Register new person\n";
        menu += "2 - Register new truck\n";
        menu += "3 - Register new van\n";
        menu += "4 - Register new personal car\n";
        menu += "5 - Add test data\n";
        menu += "6 - Display all owners and their cars\n";
        menu += "7 - Display average: person age, car age, car mileage\n";
        menu += "8 - Shut down system\n";

        System.out.println(menu);
    }

    public void menu() {

        int choice = 0;
        while (choice != 8) {
            printMenu();
            choice = getChoice();
            switch (choice) {
                case 1:
                    personList.add(createPerson());
                    break;

                case 2:
                    if (personList.isEmpty()) {
                        System.out.println("No owners registered.");
                        System.out.println("Register a new owner before registering a car.");
                        System.out.println();
                        break;
                    }
                    else {
                        carList.add(createTruck());
                        break;
                    }

                case 3:
                    if (personList.isEmpty()) {
                        System.out.println("No owners registered.");
                        System.out.println("Register a new owner before registering a car.");
                        System.out.println();
                        break;
                    }
                    else {
                        carList.add(createVan());
                        break;
                    }

                case 4:
                    if (personList.isEmpty()) {
                        System.out.println("No owners registered.");
                        System.out.println("Register a new owner before registering a car.");
                        System.out.println();
                        break;
                    }
                    else {
                        carList.add(createPersonal());
                        break;
                    }

                case 5:
                    createTestData();
                    System.out.println("Added test data.");
                    System.out.println();
                    break;

                case 6:
                    if (personList.isEmpty()) {
                        System.out.println("Nothing to see here... Move along...");
                        System.out.println();
                        break;
                    }
                    else {
                        display();
                        break;
                    }

                case 7:
                    displayAverage();
                    break;

                case 8:
                    System.out.println("System is shutting down...");
                    break;

                default:
                    System.out.println("Error; Choose options 1 - 8");
                    break;
            }
        }
    }

    final Scanner scanner = new Scanner(System.in);

    int getChoice() {
        int i = getInteger();
        return i < 9 ? i : 0;
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
        System.out.print("Year of birth: ");
        newPerson.setBirthYear(getInteger());
        personAgeList.add((calendar.get(Calendar.YEAR) - newPerson.getBirthYear()));
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
        carAgeList.add((calendar.get(Calendar.YEAR) - newTruck.getProductionYear()));
        carMileageList.add(newTruck.getMileage());
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
        carAgeList.add((calendar.get(Calendar.YEAR) - newVan.getProductionYear()));
        carMileageList.add(newVan.getMileage());
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
        carAgeList.add((calendar.get(Calendar.YEAR) - newPersonal.getProductionYear()));
        carMileageList.add(newPersonal.getMileage());
        return newPersonal;
    }

    public void createTestData() {
        Person person1 = new Person ("Daniel Engelstad", 2000);
        Person person2 = new Person ("Navn Generisk", 1943);
        Person person3 = new Person ("Saniel Satanstad", 2003);
        Person person4 = new Person ("Navnar Navnesen", 1982);
        personList.addAll(List.of(new Person[]{person1, person2, person3, person4}));

        personAgeList.addAll(List.of(
                (calendar.get(Calendar.YEAR) - person1.birthYear),
                (calendar.get(Calendar.YEAR) - person2.birthYear),
                (calendar.get(Calendar.YEAR) - person1.birthYear),
                (calendar.get(Calendar.YEAR) - person4.birthYear)));

        Car car1 = new Truck("Volvo", "FM LNG",  2016, 42000, "2018-06-06", person1);
        Car car2 = new Van("Ford", "Transit", 2021, 3020, "2022-02-15", person2);
        Car car3 = new Personal("Toyota", "Prius", 2009, 162903, "2021-10-11", person3);
        Car car4 = new Personal("Ferrari", "F150", 2019, 50006, "2020-03-01", person4);
        Car car5 = new Van("Opel", "Vivaro", 2003, 200056, "2021-07-01", person2);
        carList.addAll(List.of(new Car[]{car1, car2, car3, car4, car5}));

        carAgeList.addAll(List.of(
                (calendar.get(Calendar.YEAR) - car1.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car2.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car3.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car4.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car5.getProductionYear())));

        carMileageList.addAll(List.of(
                car1.getMileage(),
                car2.getMileage(),
                car3.getMileage(),
                car4.getMileage(),
                car5.getMileage()));
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
    public void displayAverage() {

        OptionalDouble averagePersonAge = personAgeList
                .stream()
                .mapToDouble(a -> a)
                .average();
        try {
            System.out.println("Average person age: " + averagePersonAge.getAsDouble());
            System.out.println();
        } catch (NoSuchElementException ex) {
            System.out.println("No owners registered.");
            System.out.println();
        }

        OptionalDouble averageCarAge = carAgeList
                .stream()
                .mapToDouble(a -> a)
                .average();
        try {
            System.out.println("Average car age: " + averageCarAge.getAsDouble());
            System.out.println();
        } catch (NoSuchElementException ex) {
            System.out.println("No cars registered.");
            System.out.println();
        }

        OptionalDouble averageCarMileage = carMileageList
                .stream()
                .mapToDouble(a -> a)
                .average();
        try {
            System.out.println("Average car mileage: " + averageCarMileage.getAsDouble());
            System.out.println();
        } catch (NoSuchElementException ex) {
        }
    }
}
