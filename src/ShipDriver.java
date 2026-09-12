import java.util.ArrayList;

public class ShipDriver {
    private static Ship[] ships = new Ship[3];

    public static void main(String[] args) {
        ships[0] = new Ship("ship1", "1987");
        ships[1] = new CruiseShip("Cruiseship2", "2001", 6000);
        ships[2] = new CargoShip("Cargoship3", "2009", 200000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }

}
