public class Espada {
    private String material;
    private int durabilidad;
    private int danio;
    
    // Constructor sin parámetros (espada básica)
    public Espada() {
        this.material = "Madera";
        this.durabilidad = 60;
        this.danio = 4;
    }
    
    // Constructor con parámetros (espada personalizada)
    public Espada(String material, int durabilidad, int danio) {
        this.material = material;
        this.durabilidad = durabilidad;
        this.danio = danio;
    }
    
    public void mostrarEstado() {
        System.out.println("Espada de " + material);
        System.out.println("Durabilidad: " + durabilidad);
        System.out.println("Daño: " + danio);
    }
}
