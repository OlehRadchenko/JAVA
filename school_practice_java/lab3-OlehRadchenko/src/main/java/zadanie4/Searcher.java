package zadanie4;

import java.util.List;
import java.util.ArrayList;

public class Searcher implements Searcher_I{
    private Filter[] filtry = new Filter[5];
    private int licznik=0;


    @Override
    public void addFilter(SearchByWordFilter a) {
        filtry[licznik] = a;
        licznik++;
    }
    @Override
    public void addFilter(SearchByYearFilter a) {
        filtry[licznik] = a;
        licznik++;
    }

    @Override
    public void addFilter(SearchByPriceFilter a) {
        filtry[licznik] = a;
        licznik++;
    }

    @Override
    public void addFilter(SearchByDateFilter a) {
        filtry[licznik] = a;
        licznik++;
    }

    @Override
    public void addFilter(SearchByMillageFilter a) {
        filtry[licznik] = a;
        licznik++;
    }

    public List<CarOffer> filter(List<CarOffer> cars, SearchSettings searchSettings){ // IDK CO TU ;c
        for(int i=0; i<licznik; i++){
            if(filtry[i] instanceof SearchByDateFilter){
                SearchByDateFilter filter = (SearchByDateFilter) filtry[i];
                filter.setCarOffers(cars);
                if(filter.canFilter()){
                    cars = filter.filter();
                }
            }else if(filtry[i] instanceof SearchByMillageFilter){
                SearchByMillageFilter filter = (SearchByMillageFilter) filtry[i];
                filter.setCarOffers(cars);
                if(filter.canFilter()){
                    cars = filter.filter();
                }
            }else if(filtry[i] instanceof SearchByPriceFilter){
                SearchByPriceFilter filter = (SearchByPriceFilter) filtry[i];
                filter.setCarOffers(cars);
                if(filter.canFilter()){
                    cars = filter.filter();
                }
            }else if(filtry[i] instanceof SearchByWordFilter){
                SearchByWordFilter filter = (SearchByWordFilter) filtry[i];
                filter.setCarOffers(cars);
                if(filter.canFilter()){
                    cars = filter.filter();
                }
            }else if(filtry[i] instanceof SearchByYearFilter){
                SearchByYearFilter filter = (SearchByYearFilter) filtry[i];
                filter.setCarOffers(cars);
                if(filter.canFilter()){
                    cars = filter.filter();
                }
            }else{
                System.out.println("Cos tu nie gra -_-"+i);
            }
        }
        return cars;
    }
}
