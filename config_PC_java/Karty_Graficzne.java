class RTX2060 extends PC{
    private PC pc;
    private float koszt = 1800.99F;
    public RTX2060( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Karta graficzna: RTX 2060 (cena dodatkowa: +"+koszt+"zl)";
    }
}
class RTX2060_s extends PC{
    private PC pc;
    private float koszt = 2010.65F;
    public RTX2060_s( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Karta graficzna: RTX 2060 SUPER (cena dodatkowa: +"+koszt+"zl)";
    }
}
class RTX3060 extends PC{
    private PC pc;
    private float koszt = 2200.25F;
    public RTX3060( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Karta graficzna: RTX 3060 (cena dodatkowa: +"+koszt+"zl)";
    }
}
class RTX3060TI extends PC{
    private PC pc;
    private float koszt = 2888.67F;
    public RTX3060TI( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Karta graficzna: RTX 3060 TI (cena dodatkowa: +"+koszt+"zl)";
    }
}