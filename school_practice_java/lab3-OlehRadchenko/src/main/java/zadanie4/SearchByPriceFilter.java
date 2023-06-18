package zadanie4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchByPriceFilter implements Filter{
    private List<CarOffer> cars;
    private SearchSettings searchSettings;
    public void setCarOffers(List<CarOffer> cars){
        this.cars = cars;
    }
    public void setSearchSettings(SearchSettings searchSettings){
        this.searchSettings = searchSettings;
    }
    public boolean canFilter(){
        if(searchSettings.getPriceFrom()>0){
            return true;
        }else{
            return false;
        }
    }

    public List<CarOffer> filter(){
        List<CarOffer> wynik = new ArrayList<CarOffer>();
        int licznik=0;
        for(int i=0; i<cars.size(); i++){
            if(cars.get(i).getPrice()<searchSettings.getPriceFrom() || cars.get(i).getPrice()>searchSettings.getPriceTo()){

            }else{
                wynik.add(licznik, cars.get(i));
                licznik++;
            }
        }
        return wynik;
    }
}
