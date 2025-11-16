public class Jugador {
    // Atributos privados (encapsulados)
    private String nombre;
    private int vida;
    private int hambre;
    private int experiencia;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vida = 20; // 10 corazones
        this.hambre = 20; // Barra llena
        this.experiencia = 0;
    }
    
    // Getter: permite LEER el valor de vida
    public int getVida() {
        return vida;
    }
    
    // Setter controlado: permite MODIFICAR vida con validación
    public void setVida(int nuevaVida) {
        if (nuevaVida >= 0 && nuevaVida <= 20) {
            this.vida = nuevaVida;
        } else {
            System.out.println("Valor de vida inválido");
        }
    }
    
    // Método específico para recibir daño
    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " recibió " + cantidad + " de daño");
        System.out.println("Vida actual: " + vida);
    }
    
    // Método específico para comer
    public void comer(int puntosSalud) {
        vida += puntosSalud;
        if (vida > 20) vida = 20;
        hambre += 2;
        if (hambre > 20) hambre = 20;
        System.out.println(nombre + " comió y recuperó salud");
    }
}
