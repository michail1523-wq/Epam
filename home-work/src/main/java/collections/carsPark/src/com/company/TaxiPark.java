package collections.carsPark.src.com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaxiPark {

    private List<AllCars> allCars;

    public TaxiPark() {
        this.allCars = getAllCars();
    }

    public List<AllCars> getAllCars() {
        List<AllCars> allCars = Arrays.asList(new AllCars("eco", "Fiat", 9.6, 140, 8600),
                new AllCars("eco", "Skoda", 7.3, 160, 9500),
                new AllCars("standart", "Audi", 8.1, 200, 44000),
                new AllCars("standart", "Opel", 7.1, 210, 39300),
                new AllCars("premium", "Porshe", 12.4, 250, 73300),
                new AllCars("premium", "Acura", 15.4, 250, 69900));
        return allCars;
    }

    public int getCostOfAllCArs() {
        int costOfAllCars = 0;
        for (AllCars allCars : allCars) {
            costOfAllCars += allCars.getCostOfCar();
        }
        return costOfAllCars;
    }

    public void getSortedCarsByFuelСonsumption() {
        Collections.sort(allCars);
        for (AllCars allCars : allCars) {
            System.out.println(allCars.toString());
        }
    }

    public String getFitCarOfRange(int min, int max) {
        String message = "There is no car which fit this range of speed";
        for (AllCars allCars : allCars) {
            if (allCars.getMaxSpeed() >= min && allCars.getMaxSpeed() <= max) {
                return allCars.toString();
            }
        }
        return message;
    }
}
