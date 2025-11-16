public class Main {
    public static void main(String[] args) {
        // Crear objetos (bloques específicos)
        Bloque piedra = new Bloque("Piedra", 5, true);
        Bloque tierra = new Bloque("Tierra", 2, true);
        Bloque bedrock = new Bloque("Bedrock", 100, false);
        
        // Usar los objetos
        System.out.println("=== Bloque de Piedra ===");
        piedra.mostrarInfo();
        
        System.out.println("\n=== Bloque de Tierra ===");
        tierra.mostrarInfo();
        
        System.out.println("\n=== Bedrock ===");
        bedrock.mostrarInfo();
    }
}
