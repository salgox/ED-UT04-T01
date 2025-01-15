public class pantalla2 {
    private int brillo;
    private int saturacion;
    private int contraste;

    public pantalla2 (int brillo, int saturacion, int contraste) {
        this.brillo = brillo;
        this.saturacion = saturacion;
        this.contraste = contraste;
    }

    public void nivelBrillo() {
        this.brillo = nivel;
        System.out.println("El brillo ha sido ajustado al " + nivel + "%");
    }

    public void nivelSaturacion(int nivel) {
        this.saturacion = nivel;
        System.out.println("La saturación ha sido ajustada al " + nivel + "%");
    }

    public void nivelContraste(int nivel) {
        this.contraste = nivel;
        System.out.println("El contraste ha sido ajustado al " + nivel + "%");
    }
}
