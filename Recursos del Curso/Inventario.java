public class Inventario {
    private int[] items;
    private int capacidadMaxima;
    private int itemsActuales;
    
    public Inventario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.items = new int[capacidadMaxima];
        this.itemsActuales = 0;
    }
    
    // Getter: obtener cantidad de items
    public int getItemsActuales() {
        return itemsActuales;
    }
    
    // Getter: verificar si está lleno
    public boolean estaLleno() {
        return itemsActuales >= capacidadMaxima;
    }
    
    // Getter: obtener capacidad
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    // Método controlado para agregar item
    public boolean agregarItem(int itemId) {
        if (estaLleno()) {
            System.out.println("¡Inventario lleno!");
            return false;
        }
        items[itemsActuales] = itemId;
        itemsActuales++;
        System.out.println("Item agregado. Total: " + itemsActuales);
        return true;
    }
    
    // Método controlado para remover item
    public boolean removerItem(int posicion) {
        if (posicion < 0 || posicion >= itemsActuales) {
            System.out.println("Posición inválida");
            return false;
        }
        System.out.println("Item removido de posición " + posicion);
        // Lógica para remover...
        itemsActuales--;
        return true;
    }
}
