package app;
import utils.*;
import java.util.ArrayList;
import vehicle.*;

//Main application that brings the user menu and results of the calculations.
/**
 * @author Gamze Nur Madan 260201084
 * @author Halil Ä°brahim BuÄŸday 280201094
 * @author Meryem Å�ahintÃ¼rk 230201025
 * @author KÃ¼rÅŸat Ã‡aÄŸrÄ± YakÄ±cÄ± 290201098
 */

import utils.Menu;

public class VehiclePriceCalculatorApp {
    public static void main(String[] args) throws Exception {
        ArrayList<Vehicle> vehicleList = FileIO.getVehicleArrayFromCSVFile("src/data/HW2_SoldVehicles.csv");
        Menu.printMenuStartMessage();
        Menu.getUserQuery(vehicleList);
    }
}
