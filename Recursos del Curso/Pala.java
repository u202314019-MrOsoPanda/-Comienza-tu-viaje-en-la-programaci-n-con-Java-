public class Pala {
    private String material;
    private int durabilidad;
    private int durabilidadMaxima;
    
    public Pala(String material, int durabilidadMaxima) {
        this.material = material;
        this.durabilidadMaxima = durabilidadMaxima;
        this.durabilidad = durabilidadMaxima;
    }
    
    // Método: acción de cavar
    public void cavar() {
        if (durabilidad > 0) {
            System.out.println("¡Cavando con pala de " + material + "!");
            perderDurabilidad(1);
        } else {
            System.out.println("¡La pala está rota!");
        }
    }
    
    // Método: reducir durabilidad
    private void perderDurabilidad(int cantidad) {
        durabilidad -= cantidad;
        if (durabilidad <= 0) {
            durabilidad = 0;
            System.out.println("¡La pala se ha roto!");
        }
    }
    
    // Método: reparar la pala
    public void reparar() {
        durabilidad = durabilidadMaxima;
        System.out.println("Pala reparada al máximo");
    }
}
