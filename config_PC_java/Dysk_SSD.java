class GB512_M2 extends PC{
    private PC pc;
    private float koszt = 260.66F;
    public GB512_M2( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk SSD M2: 512GB (cena dodatkowa: +"+koszt+"zl)";
    }
}
class TB1_M2 extends PC{
    private PC pc;
    private float koszt = 550.55F;
    public TB1_M2( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk SSD M2: 1TB (cena dodatkowa: +"+koszt+"zl)";
    }
}
class TB2_M2 extends PC{
    private PC pc;
    private float koszt = 1200.11F;
    public TB2_M2( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk SSD M2: 2TB (cena dodatkowa: +"+koszt+"zl)";
    }
}

class GB512_SSD extends PC{
    private PC pc;
    private float koszt = 400.50F;
    public GB512_SSD( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk SSD: 512GB (cena dodatkowa: +"+koszt+"zl)";
    }
}
class TB1_SSD extends PC{
    private PC pc;
    private float koszt = 900.20F;
    public TB1_SSD( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk SSD: 1TB (cena dodatkowa: +"+koszt+"zl)";
    }
}
class TB2_SSD extends PC{
    private PC pc;
    private float koszt = 2020.22F;
    public TB2_SSD( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Dysk SSD: 2TB (cena dodatkowa: +"+koszt+"zl)";
    }
}