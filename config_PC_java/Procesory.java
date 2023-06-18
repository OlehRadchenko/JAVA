class Ryzen5_5600X extends PC{
    private PC pc;
    private float koszt = 1111.99F;
    public Ryzen5_5600X( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Procesor: Ryzen 5 5600X (cena dodatkowa: +"+koszt+"zl)";
    }
}

class Intel7_9700k extends PC{
    private PC pc;
    private float koszt = 1777.55F;
    public Intel7_9700k( PC pc){
        this.pc = pc;
    }
    public float price(){
        return pc.price()+koszt;
    }
    public String description(){
        return pc.description()+"\n-Procesor: Intel 7 9700k (cena dodatkowa: +"+koszt+"zl)";
    }
}