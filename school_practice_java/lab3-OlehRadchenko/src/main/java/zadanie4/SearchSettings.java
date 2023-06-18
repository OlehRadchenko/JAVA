package zadanie4;

import java.time.LocalDate;

public class SearchSettings {
    private int yearFrom, yearTo, milleageFrom, milleageTo;
    private LocalDate dateFrom, dateTo;
    private String word;
    private double priceFrom, priceTo;

    public int getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(int yearFrom) {
        this.yearFrom = yearFrom;
    }

    public int getYearTo() {
        return yearTo;
    }

    public void setYearTo(int yearTo) {
        this.yearTo = yearTo;
    }

    public int getMilleageFrom() {
        return milleageFrom;
    }

    public void setMilleageFrom(int milleageFrom) {
        this.milleageFrom = milleageFrom;
    }

    public int getMilleageTo() {
        return milleageTo;
    }

    public void setMilleageTo(int milleageTo) {
        this.milleageTo = milleageTo;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(double priceFrom) {
        this.priceFrom = priceFrom;
    }

    public double getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(double priceTo) {
        this.priceTo = priceTo;
    }
}
