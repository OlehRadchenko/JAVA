package zadanie4;

import java.util.List;

public interface Filter {
    public void setCarOffers(List<CarOffer> cars);
    public void setSearchSettings(SearchSettings searchSettings);
    public boolean canFilter();
    public List<CarOffer> filter();
}