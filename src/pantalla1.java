public class pantalla1 {
    private String marca;
    private double pulgadas;
    private String resolucion;

    public pantalla1(String marca, double pulgadas, String resolucion) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }

    public void encender() {
        System.out.println("Encendiendo la pantalla!");
    }

    public void apagar() {
        System.out.println("Apagando la pantalla!");
    }

    public void referenciaCompleta() {
        System.out.println("Pantalla: Marca = " + marca + ", Pulgadas = " + pulgadas + ", Resolución = " + resolucion);
    }
}
