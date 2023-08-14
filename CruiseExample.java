package Daywise_Notes.Questions;

class StandardCabin{
    // Instance variable - Amenities
    private String bedTypes;
    private int noOfBeds;
    private boolean hasTv;

    // Methods - Services
    public String cleanTheRoom(){
        return "Cleaning the Room";
    }

    public void turnOnTv(boolean subscription){
        System.out.println("TV turned On");
    }

    //Constructor
    public StandardCabin(String bedTypes, int noOfBeds, boolean hasTv){
        this.bedTypes=bedTypes;
        this.noOfBeds=noOfBeds;
        this.hasTv=hasTv;
    }

//    @Override
//    public String toString() {
//        return "StandardCabin{" + "bedTypes='" + bedTypes + ", noOfBeds=" + noOfBeds + ", hasTv=" + hasTv + '}';
//    }


    public String getBedTypes() {
        return bedTypes;
    }

    public void setBedTypes(String bedTypes) {
        this.bedTypes = bedTypes;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }
}

class PremiumCabin extends StandardCabin{
    // Additional Instance variable - Amenity
    private boolean hasWifi;
    // Additional Method - Service
    public void coffeeMachine(){
        System.out.println("Have Coffee Machine");
    }
    // Upgrade methods of standard cabin
//    option 1
    @Override
    public String cleanTheRoom(){
        return "Cleaning the Premium room";
    }
    @Override
    public void turnOnTv(boolean subscription){
        System.out.println("TV turned On in the Premium room");
    }

    public PremiumCabin(String bedTypes, int noOfBeds, boolean hasTv, boolean hasWifi){
        super(bedTypes, noOfBeds, hasTv);
        this.hasWifi = hasWifi;
    }

    @Override
    public String toString() {
        return "PremiumCabin{" + "hasWifi=" + hasWifi + '}';
    }
}

class CabinManager{
    public static void main(String[] args) {
        StandardCabin standardCabin = new StandardCabin("King", 2,true);
        PremiumCabin premiumCabin = new PremiumCabin("Queen", 4, true, true);
        System.out.println(standardCabin);
        System.out.println(premiumCabin.cleanTheRoom());
    }
}