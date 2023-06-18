package zadanie4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchByDateFilter implements Filter{
    private List<CarOffer> cars;
    private SearchSettings searchSettings;
    public void setCarOffers(List<CarOffer> cars){
        this.cars = cars;
    }
    public void setSearchSettings(SearchSettings searchSettings){
        this.searchSettings = searchSettings;
    }
    public boolean canFilter(){
        if(searchSettings.getDateTo()==null){
            searchSettings.setDateTo(LocalDate.now());
        }
        if(searchSettings.getDateFrom().isAfter(LocalDate.of(2000,12,12)) && searchSettings.getDateFrom().isBefore(LocalDate.now()) && searchSettings.getDateFrom().isBefore(searchSettings.getDateTo())){
            return true;
        }else{
            return false;
        }
    }

    public List<CarOffer> filter(){
        List<CarOffer> wynik = new ArrayList<CarOffer>();
        int licznik=0;
        for(int i=0; i<cars.size(); i++){
            if(cars.get(i).getDate().isBefore(searchSettings.getDateTo()) && cars.get(i).getDate().isAfter(searchSettings.getDateFrom())){
                wynik.add(licznik, cars.get(i));
                licznik++;
            }else{
            }
        }
        return wynik;
    }
}
