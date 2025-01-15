class pantalla3Default {
    int hercios;
    int volumen;
    boolean freeSync;

    public pantalla3Default(int hercios, int volumen, boolean freeSync){
        this.hercios = hercios;
        this.volumen = volumen;
        this.freeSync = freeSync;
    }

    public void herciosPantalla (int tasaRefresco) {
        this.hercios = tasaRefresco;
        System.out.println("La pantalla soporta " + tasaRefresco + "hz");
    }

    public void volumenPantalla (int nivel) {
        this.volumen = nivel;
        System.out.println("El volumen ha sido ajustado al " + nivel + "%");
    }

    public void freeSyncPantalla () {
        if (freeSync) {
            System.out.println("La pantalla soporta la tecnología FreeSync");
        } else {
            System.out.println("La pantalla no soporta la tecnología FreeSync");
        }
    }
}