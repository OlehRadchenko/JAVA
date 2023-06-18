class BRAK_HDD extends PC{
    private PC pc;
    private float koszt = 0F;
    public BRAK_HDD( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk HDD: Brak (cena dodatkowa: +"+koszt+"zl)";
    }
}
class TB1_HDD extends PC{
    private PC pc;
    private float koszt = 190.80F;
    public TB1_HDD( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk HDD: 1TB (cena dodatkowa: +"+koszt+"zl)";
    }
}
class TB2_HDD extends PC{
    private PC pc;
    private float koszt = 256.56F;
    public TB2_HDD( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk HDD: 2TB (cena dodatkowa: +"+koszt+"zl)";
    }
}