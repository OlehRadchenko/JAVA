package zadanie8;

public class Main {
    public static void main(String[] args) {
        Flat[] homes = new Flat[10];
        for(int i=0; i<10; i++){
            switch((int) Math.floor(Math.random()*3)){
                case 0:
                    homes[i] = new Flat("Gdansk", "Reja");
                    //System.out.println("Flat"); DLA TESTOWANIA
                    break;
                case 1:
                    homes[i] = new House("Gdansk", "Reja", 2);
                    //System.out.println("House"); DLA TESTOWANIA
                    break;
                case 2:
                    homes[i] = new Residence("Gdansk", "Reja 25", 20, 10);
                    //System.out.println("Residence"); DLA TESTOWANIA
                    break;
                default:
                    System.out.println("Cos poszlo nie tak ;c");
            }
        }
        for(int i=0; i<10; i++){
            if(homes[i] instanceof Residence){
                Residence residence = (Residence) homes[i];
                System.out.println("GarageSize: "+residence.getGarageSize()+"\n"+residence.toString());
            }else if(homes[i] instanceof House){
                House house = (House) homes[i];
                System.out.println("ParcelSize: "+house.getParcelSize()+"\n"+house.toString());
            }else if(homes[i] instanceof Flat){
                Flat flat = homes[i];
                System.out.println(flat.toString());
            }
        }
    }
}
