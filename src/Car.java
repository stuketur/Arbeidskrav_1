public class Car {

    private String producer;
    private String name;
    private int productionYear;
    private int mileage;
    private String mileageDate;
    private int ownedBy;

    public Car(String producer, String name, int productionYear, int mileage, String mileageDate, Person owner) {
        this.producer = producer;
        this.name = name;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.mileageDate = mileageDate;
        this.ownedBy = owner.id;
    }

    public Car() {

    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getMileageDate() {
        return mileageDate;
    }

    public void setMileageDate(String mileageDate) {
        this.mileageDate = mileageDate;
    }

    public int getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(int ownedBy) {
        this.ownedBy = ownedBy;
    }

    public void display() {
        System.out.println("\t\tProducer: " + getProducer());
        System.out.println("\t\tName: " + getName());
        System.out.println("\t\tType: " + this.getClass().getName());
        System.out.println("\t\tProduction year: " + getProductionYear());
        System.out.println("\t\tMileage: " + getMileage());
        System.out.println("\t\tMileage date: " + getMileageDate());
        System.out.println();
    }
}

