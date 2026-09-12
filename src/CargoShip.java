public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String shipName,String shipCreationDate,int cargoCapacity)
    {
        super(shipName,shipCreationDate);
        this.cargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void print()
    {
        System.out.println("Ship: " + getShipName());
        System.out.println("Ship cargo capacity:" + cargoCapacity);
    }

}
