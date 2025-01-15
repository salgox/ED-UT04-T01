public class pantalla2Public {
    public int brillo;
    public int saturacion;
    public int contraste;

    public pantalla2Public(int brillo, int saturacion, int contraste) {
        this.brillo = brillo;
        this.saturacion = saturacion;
        this.contraste = contraste;
    }

    public void nivelBrillo(int nivel) {
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
