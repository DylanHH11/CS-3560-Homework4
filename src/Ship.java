public class Ship {
    private String shipName;
    private String shipCreationDate;

    public Ship(String shipName,String shipCreationDate){
        this.shipName = shipName;
        this.shipCreationDate = shipCreationDate;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipCreationDate(String shipCreationDate) {
        this.shipCreationDate = shipCreationDate;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipCreationDate() {
        return shipCreationDate;
    }

    public void print()
    {
        System.out.println("Ship: " + shipName);
        System.out.println("Ship creation date:" + shipCreationDate);
    }

}
