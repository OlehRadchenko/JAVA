class obudowa_pudelko extends PC{
    private PC pc;
    private float koszt = 100.00F;
    public obudowa_pudelko( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Obudowa: pudelko po butach (cena dodatkowa: +"+koszt+"zl)";
    }
}
class obudowa_rgb extends PC{
    private PC pc;
    private float koszt = 1222.22F;
    public obudowa_rgb( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Obudowa: Predator z duza iloscia RGB i kolorowych wiatraczkow :DD (cena dodatkowa: +"+koszt+"zl)";
    }
}
class chlodzenie extends PC{
    private PC pc;
    private float koszt = 100.10F;
    public chlodzenie( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dodatkowe chlodzenie (cena dodatkowa: +"+koszt+"zl)";
    }
}
class zostaw_chlodzenie extends PC{
    private PC pc;
    public zostaw_chlodzenie( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price();
    }
    public String description(){
        return pc.description();
    }
}