package zadanie4;

import java.time.LocalDate;
import java.util.List;

public class MainProgram {

    static List<CarOffer> cars = List.of(
            new CarOffer(150000, 2000, LocalDate.now().minusDays(5), "Sprzedam Alfe", 5000.00),
            new CarOffer(250000, 1999, LocalDate.now().minusDays(0), "Sprzedam Opla", 25000.00),
            new CarOffer(110000, 2004, LocalDate.now().minusDays(5), "Sprzedam Opla", 12000.00),
            new CarOffer(350000, 2019, LocalDate.now().minusDays(9), "Sprzedam Opla", 15000.00),
            new CarOffer(140000, 2000, LocalDate.now().minusDays(11), "Opel", 14000.00)
    );

    public static void main(String[] args){
        SearchSettings searchSettings = new SearchSettings();

        searchSettings.setDateFrom(LocalDate.now().minusDays(10));
        searchSettings.setMilleageTo(200000);
        searchSettings.setPriceFrom(10000.0);
        searchSettings.setPriceTo(16000.0);
        searchSettings.setWord("Sprzedam");
        searchSettings.setYearFrom(2000);

        SearchByYearFilter yearFilter = new SearchByYearFilter();

        yearFilter.setCarOffers(cars);
        yearFilter.setSearchSettings(searchSettings);

        if(yearFilter.canFilter()){
            List<CarOffer> filteredByYearCarsOffers = yearFilter.filter();
            if(filteredByYearCarsOffers.size()>4)
            {
                System.out.println("filtrowanie po roczniku nie działa poprawnie");
                return;
            }else{
                System.out.println("Jest git - rocznik");
            }
        }

        Filter priceFilter = new SearchByPriceFilter();
        Filter wordFilter = new SearchByWordFilter();
        Filter milleageFilter = new SearchByMillageFilter();
        Filter dateFilter = new SearchByDateFilter();

        priceFilter.setCarOffers(cars);
        priceFilter.setSearchSettings(searchSettings);

        if(priceFilter.canFilter()){
            List<CarOffer> filteredCarsOffers = priceFilter.filter();
            if(filteredCarsOffers.size()>3)
            {
                System.out.println("filtrowanie po cenie nie działa poprawnie");
                return;
            }else{
                System.out.println("Jest git - po cenie");
            }
        }

        wordFilter.setCarOffers(cars);
        wordFilter.setSearchSettings(searchSettings);

        if(wordFilter.canFilter()){
            List<CarOffer> filteredCarsOffers = wordFilter.filter();
            if(filteredCarsOffers.size()>4)
            {
                System.out.println("filtrowanie po słowie nie działa poprawnie");
                return;
            }else{
                System.out.println("Jest git - po slowie");
            }
        }


        milleageFilter.setCarOffers(cars);
        milleageFilter.setSearchSettings(searchSettings);
        if(milleageFilter.canFilter()){
            List<CarOffer> filteredCarsOffers = milleageFilter.filter();
            if(filteredCarsOffers.size()>3)
            {
                System.out.println("filtrowanie po słowie nie działa poprawnie");
                return;
            }else{
                System.out.println("Jest git - po przebiegu");
            }
        }
        dateFilter.setCarOffers(cars);
        dateFilter.setSearchSettings(searchSettings);
        if(dateFilter.canFilter()){
            List<CarOffer> filteredCarsOffers = dateFilter.filter();
            if(filteredCarsOffers.size()>4)
            {
                System.out.println("filtrowanie po dacie nie działa poprawnie");
                return;
            }else{
                System.out.println("Jest git - po dacie");
            }
        }

        Searcher searcher = new Searcher();

        /**
         * tutaj należy tak zrobić aby metoda addFilter była zadeklarowana tylko raz w klasie
         * oraz aby moglą przyjmować rózne rodzaje filtrów w parametrze.
         * Wykorzystaj interfejsy
        */
        searcher.addFilter((SearchByWordFilter) wordFilter);
        searcher.addFilter((SearchByPriceFilter) priceFilter);
        searcher.addFilter((SearchByMillageFilter) milleageFilter);
        searcher.addFilter((SearchByDateFilter) dateFilter);

        List<CarOffer> filteredCarsOffers = searcher.filter(cars, searchSettings);

        if(filteredCarsOffers.size()!=1){
            System.out.println("filtrowanie nie działa");
        }
        System.out.println("\n\nTo ogloszenie: \nPrice: "+filteredCarsOffers.get(0).getPrice()+"\nTitle: "+filteredCarsOffers.get(0).getTitle()+"\nMilleage: "+filteredCarsOffers.get(0).getMilleage()+"\nDate: "+filteredCarsOffers.get(0).getDate()+"\nYear: "+filteredCarsOffers.get(0).getYear());

        System.out.println("\n\nKoniec");
    }
}