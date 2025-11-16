public class Bloque {
    // Atributos (características del bloque)
    private String tipo;
    private int dureza;
    private boolean esMineable;
    
    // Constructor (cómo crear un bloque)
    public Bloque(String tipo, int dureza, boolean esMineable) {
        this.tipo = tipo;
        this.dureza = dureza;
        this.esMineable = esMineable;
    }
    
    // Método (comportamiento del bloque)
    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Dureza: " + dureza);
        System.out.println("¿Es mineable?: " + esMineable);
    }
}
