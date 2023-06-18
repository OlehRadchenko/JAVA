package zadanie4;

public interface Searcher_I {
    void addFilter(SearchByYearFilter a);
    void addFilter(SearchByPriceFilter a);
    void addFilter(SearchByDateFilter a);
    void addFilter(SearchByMillageFilter a);
    void addFilter(SearchByWordFilter a);
}
