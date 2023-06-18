class GB8_DDR3 extends PC{
    private PC pc;
    private float koszt = 150.52F;
    public GB8_DDR3( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-RAM: 8GB DDR3 (cena dodatkowa: +"+koszt+"zl)";
    }
}
class GB16_DDR3 extends PC{
    private PC pc;
    private float koszt = 280.68F;
    public GB16_DDR3( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-RAM: 16GB DDR3 (cena dodatkowa: +"+koszt+"zl)";
    }
}
class GB32_DDR3 extends PC{
    private PC pc;
    private float koszt = 540.40F;
    public GB32_DDR3( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-RAM: 32GB DDR3 (cena dodatkowa: +"+koszt+"zl)";
    }
}

class GB8_DDR4 extends PC{
    private PC pc;
    private float koszt = 199.45F;
    public GB8_DDR4( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-RAM: 8GB DDR4 (cena dodatkowa: +"+koszt+"zl)";
    }
}
class GB16_DDR4 extends PC{
    private PC pc;
    private float koszt = 290.10F;
    public GB16_DDR4( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-RAM: 16GB DDR4 (cena dodatkowa: +"+koszt+"zl)";
    }
}
class GB32_DDR4 extends PC{
    private PC pc;
    private float koszt = 599.54F;
    public GB32_DDR4( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-RAM: 32GB DDR4 (cena dodatkowa: +"+koszt+"zl)";
    }
}