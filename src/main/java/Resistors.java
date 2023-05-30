public class Resistors
{
    private String partNumber;
    private String description;
    private double value;
    private char unit;
    private double power;
    private byte tolerance;
    private String mountingType;
    private String componentPackage;
    private int quantity;
    private String repoPlace;

    public Resistors( )
    {

    }

    //constructor with parameters
    public Resistors(String partNumber, String description, double value, char unit, double power, byte tolerance, String mountingType, String componentPackage, int quantity, String repoPlace)
    {
        this.partNumber = partNumber;
        this.description = description;
        this.value = value;
        this.unit = unit;
        this.power = power;
        this.tolerance = tolerance;
        this.mountingType = mountingType;
        this.componentPackage = componentPackage;
        this.quantity = quantity;
        this.repoPlace = repoPlace;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public byte getTolerance() {
        return tolerance;
    }

    public void setTolerance(byte tolerance) {
        this.tolerance = tolerance;
    }

    public String getMountingType() {
        return mountingType;
    }

    public void setMountingType(String mountingType) {
        this.mountingType = mountingType;
    }

    public String getComponentPackage() {
        return componentPackage;
    }

    public void setComponentPackage(String componentPackage) {
        this.componentPackage = componentPackage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRepoPlace() {
        return repoPlace;
    }

    public void setRepoPlace(String repoPlace) {
        this.repoPlace = repoPlace;
    }
}
