package zadanie4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchByYearFilter implements Filter{
    private List<CarOffer> cars;
    private SearchSettings searchSettings;
    public void setCarOffers(List<CarOffer> cars){
        this.cars = cars;
    }
    public void setSearchSettings(SearchSettings searchSettings){
        this.searchSettings = searchSettings;
    }
    public boolean canFilter(){
        if(searchSettings.getYearFrom()>1800 && searchSettings.getYearFrom()<=LocalDate.now().getYear()){
            return true;
        }else{
            return false;
        }
    }

    public List<CarOffer> filter(){
        List<CarOffer> wynik = new ArrayList<CarOffer>();
        int licznik=0;
        for(int i=0; i<cars.size(); i++){
            if(cars.get(i).getYear()<searchSettings.getYearFrom() || cars.get(i).getYear()>searchSettings.getYearTo()){

            }else{
                wynik.add(licznik, cars.get(i));
                licznik++;
            }
        }
        return wynik;
    }
}
