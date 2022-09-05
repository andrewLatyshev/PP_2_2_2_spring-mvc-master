package web.models;

public class Car {

    private long yearOfIssue;
    private String brand;
    private String model;

    public Car(Long yearOfIssue, String brand, String model) {
        this.yearOfIssue = yearOfIssue;
        this.brand = brand;
        this.model = model;
    }

    public long getYearOfIssue() {
        return yearOfIssue;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfIssue(long yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
