public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String shipName,String shipCreationDate,int maxPassengers)
    {
        super(shipName,shipCreationDate);
        this.maxPassengers = maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void print()
    {
        System.out.println("Ship: " + getShipName());
        System.out.println("Ship maximum number of passengers:" + maxPassengers);
    }

}
