package collections.carsPark.src.com.company;

import java.util.Objects;

public class AllCars implements Comparable<AllCars> {
    private String classAuto;
    private String nameOfModel;
    private double fuelCons;
    private int maxSpeed;
    private int costOfCar;


    public AllCars(String classAuto, String nameOfModel, double fuelCons, int maxSpeed, int costOfCar) {
        this.classAuto = classAuto;
        this.nameOfModel = nameOfModel;
        this.fuelCons = fuelCons;
        this.maxSpeed = maxSpeed;
        this.costOfCar = costOfCar;
    }

    public int getCostOfCar() {
        return costOfCar;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public double getFuelCons() {
        return fuelCons;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    @Override
    public String toString() {
        return "AllCars{" +
                "nameOfModel='" + nameOfModel + '\'' +
                ", fuelСonsumption=" + fuelCons +
                ", maxSpeed=" + maxSpeed +
                '}';
    }


    @Override
    public int compareTo(AllCars o) {
        if (this.fuelCons < o.fuelCons) {
            return -1;
        }
        if (this.fuelCons == o.fuelCons) {
            return 0;
        }
        if (this.fuelCons > o.fuelCons) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllCars allCars = (AllCars) o;
        return Double.compare(allCars.fuelCons, fuelCons) == 0 &&
                maxSpeed == allCars.maxSpeed &&
                costOfCar == allCars.costOfCar &&
                Objects.equals(classAuto, allCars.classAuto) &&
                Objects.equals(nameOfModel, allCars.nameOfModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classAuto, nameOfModel, fuelCons, maxSpeed, costOfCar);
    }
}

