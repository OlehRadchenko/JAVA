class win_brak extends PC{
    private PC pc;
    private float koszt = 0;
    public win_brak( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-System operacyjny: brak (cena dodatkowa: +"+koszt+"zl)";
    }
}
class win11_home extends PC{
    private PC pc;
    private float koszt = 555.55F;
    public win11_home( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-System operacyjny: Windows 11 Home (cena dodatkowa: +"+koszt+"zl)";
    }
}
class win11_pro extends PC{
    private PC pc;
    private float koszt = 677.32F;
    public win11_pro( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-System operacyjny: Windows 11 Pro (cena dodatkowa: +"+koszt+"zl)";
    }
}
class windowsME extends PC{
    private PC pc;
    private float koszt = -100.00F;
    public windowsME( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-System operacyjny: Windows ME (cena dodatkowa: "+koszt+"zl)";
    }
}