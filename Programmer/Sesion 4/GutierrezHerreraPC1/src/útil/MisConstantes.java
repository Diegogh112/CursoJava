package útil;

public enum MisConstantes {

    PLATINUM("P", "Platinum", 250.50),
    GOLD("G", "Gold", 150.50),
    VIP("V", "VIP", 95.00);


    private String codigo;
    private  String ubicacion;
    private double costo;

    MisConstantes(String codigo, String ubicacion, double costo) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.costo = costo;

    }

    public double getCosto(){

    }
}
