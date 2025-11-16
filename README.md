---

# **Reporte del Proyecto: Curso de Introducción a la Programación en Java**

## Lista de reproduccion ## 

https://www.youtube.com/playlist?list=PLvX3j-HQwy5oWhsvPagvZymgJm6iLcK2Z 

## **Objetivo General**

El objetivo principal de este proyecto es desarrollar un curso interactivo de introducción a la programación en Java, centrado en los conceptos de programación orientada a objetos (POO), para estudiantes de secundaria sin experiencia previa. A través de este curso, los estudiantes aprenderán los fundamentos básicos de Java y cómo aplicarlos para desarrollar programas sencillos, incluyendo la creación de aplicaciones basadas en POO.

---

## **Contenido del Curso**

### **1. Introducción a la programación y Java**

**Duración**: 10 minutos

**Temas cubiertos:**

* ¿Qué es Java?
* ¿Por qué usar Java?
* Primer programa en Java: "¡Hola, Mundo!"

**Objetivos:**

* Introducir el concepto de programación y el lenguaje Java.
* Explicar las razones por las cuales Java es una excelente opción para aprender a programar.
* Crear el primer programa en Java para familiarizarse con la sintaxis básica.

**Código de ejemplo:**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

---

### **2. Sintaxis básica: Variables y tipos de datos**

**Duración**: 10 minutos

**Temas cubiertos:**

* ¿Qué son las variables?
* Tipos de datos: `int`, `String`, `double`, etc.
* Declaración y uso de variables.

**Objetivos:**

* Enseñar cómo declarar y utilizar variables en Java.
* Introducir los tipos de datos básicos que se usan en Java.

**Código de ejemplo:**

```java
public class Main {
    public static void main(String[] args) {
        int edad = 15;
        String nombre = "Juan";
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
```

---

### **3. Operadores y expresiones**

**Duración**: 10 minutos

**Temas cubiertos:**

* Operadores aritméticos: `+`, `-`, `*`, `/`, `%`.
* Cómo realizar operaciones matemáticas básicas con variables.

**Objetivos:**

* Enseñar cómo usar operadores aritméticos para realizar cálculos sencillos.

**Código de ejemplo:**

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        int suma = a + b;
        int resta = a - b;
        
        System.out.println("Suma: " + suma);  // 15
        System.out.println("Resta: " + resta);  // 5
    }
}
```

---

### **4. Estructuras de control: Sentencias if-else, bucles (for, while)**

**Duración**: 10 minutos

**Temas cubiertos:**

* Sentencias `if-else`: Cómo tomar decisiones en el código.
* Bucles `for` y `while`: Cómo realizar repeticiones de código.

**Objetivos:**

* Introducir las sentencias `if-else` y los bucles para controlar el flujo del programa.

**Código de ejemplo (if-else):**

```java
public class Main {
    public static void main(String[] args) {
        int edad = 16;
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
```

**Código de ejemplo (bucle `for`):**

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

**Código de ejemplo (bucle `while`):**

```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

---

### **5. Métodos (funciones) y parámetros**

**Duración**: 10 minutos

**Temas cubiertos:**

* ¿Qué son los métodos y cómo se usan?
* Métodos con parámetros: Cómo pasar información a los métodos.
* Ejemplos prácticos de métodos en Java.

**Objetivos:**

* Enseñar cómo declarar y utilizar métodos en Java.
* Introducir los métodos con parámetros para hacer el código más modular y reutilizable.

**Código de ejemplo:**

```java
public class Main {
    public static void main(String[] args) {
        saludar("Juan", 15);
    }

    public static void saludar(String nombre, int edad) {
        System.out.println("¡Hola, " + nombre + "! Tienes " + edad + " años.");
    }
}
```

---

### **6. Entrada/Salida básica (usando `Scanner` o consola)**

**Duración**: 10 minutos

**Temas cubiertos:**

* Usar la clase `Scanner` para leer entradas desde la consola.
* Imprimir salidas en la consola.

**Objetivos:**

* Enseñar a leer datos ingresados por el usuario desde la consola y mostrar resultados.

**Código de ejemplo:**

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }
}
```

---

### **7. Introducción a la POO: Clases, objetos, constructores y métodos simples**

**Duración**: 10 minutos

**Temas cubiertos:**

* Definición de clases y objetos.
* Creación de un constructor y uso de métodos en objetos.

**Objetivos:**

* Introducir los conceptos de clases y objetos en Java.
* Crear una clase con atributos, métodos y un constructor.

**Código de ejemplo:**

```java
public class Estudiante {
    String nombre;
    int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 15);
        estudiante.mostrarInfo();
    }
}
```

---

### **8. Principios básicos de POO: Encapsulación (usando getters/setters) e instanciación simple**

**Duración**: 10 minutos

**Temas cubiertos:**

* Encapsulación y uso de los métodos `get` y `set`.
* Creación de instancias simples de objetos.

**Objetivos:**

* Introducir el concepto de encapsulación y cómo proteger los datos dentro de una clase.
* Usar los métodos `get` y `set` para acceder y modificar atributos privados.

**Código de ejemplo:**

```java
public class Estudiante {
    private String nombre;
    private int edad;

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan");
        estudiante.setEdad(15);
        
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
    }
}
```

---

### **9. Estructuras de datos simples: Manipulación de arrays o cadenas, integrada con objetos**

**Duración**: 10 minutos

**Temas cubiertos:**

* Uso de arrays y cadenas en Java.
* Manipulación de arrays con objetos.

**Objetivos:**

* Enseñar a los estudiantes cómo trabajar con estructuras de datos simples como arrays y cadenas.

**Código de ejemplo (uso de arrays):**

```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
```

---

### **10. Desarrollo de un programa básico: Aplicación simple basada en POO (ej. Registro de "Estudiante" o juego de adivinanzas con clases)**

**Duración**: 10 minutos

**Temas cubiertos:**

* Desarrollo de un programa básico usando los conceptos aprendidos en POO.

**Objetivos:**

* Aplicar los conocimientos adquiridos para desarrollar un programa sencillo utilizando clases y objetos.

**Código de ejemplo:**

```java
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7;
        
        System.out.print("Adivina el número entre 1 y 10: ");
        int intento = scanner.nextInt();
        
        if (intento == numeroSecreto) {
            System.out.println("¡Felicidades! Adivinaste el número.");
        } else {
            System.out.println("Lo siento, intenta de nuevo.");
        }
    }
}
```

---

## **Archivos Adicionales**

A continuación, se describen los archivos adicionales utilizados en el proyecto. Estos archivos forman parte del código fuente y están directamente relacionados con las lecciones del curso.

### **1. Archivo: `Main.java`**

**Descripción:**
Este es el archivo principal del proyecto, que sirve como punto de entrada para ejecutar el programa. Es responsable de coordinar la ejecución de otros objetos y de manejar la lógica general del programa.

**Código de ejemplo:**

```java
public class Main {
    public static void main(String[] args) {
        // Lógica del programa
    }
}
```

---

### **2. Archivo: `Jugador.java`**

**Descripción:**
La clase `Jugador` representa a un jugador dentro del sistema (puede ser un juego o una simulación). Esta clase contiene atributos como el nombre del jugador y su puntuación, y métodos que permiten la interacción con el jugador.

**Código de ejemplo:**

```java
public class Jugador {
    private String nombre;
    private int puntuacion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    // Métodos para interactuar con el jugador
}
```

---

### **3. Archivo: `Inventario.java`**

**Descripción:**
La clase `Inventario` maneja los objetos que un jugador puede poseer dentro del juego. En este archivo, se gestionan elementos como armas, armaduras, y otros ítems que los jugadores pueden agregar o eliminar de su inventario.

**Código de ejemplo:**

```java
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    // Métodos para agregar y eliminar objetos del inventario
}
```

---

### **4. Archivo: `Pala.java`**

**Descripción:**
Este archivo define la clase `Pala`, que puede representar una herramienta dentro del juego. La clase incluye atributos como el tipo de pala y su durabilidad, además de métodos para interactuar con ella (por ejemplo, cavar o excavar).

**Código de ejemplo:**

```java
public class Pala {
    private String tipo;
    private int durabilidad;

    public Pala(String tipo) {
        this.tipo = tipo;
        this.durabilidad = 100;  // Durabilidad inicial
    }

    // Métodos para interactuar con la pala
}
```

---

### **5. Archivo: `Espada.java`**

**Descripción:**
La clase `Espada` representa un arma dentro del juego. Los atributos de esta clase incluyen el material de la espada, el daño que puede infligir, y su durabilidad. Los métodos en esta clase permiten usar la espada para atacar a otros objetos o personajes.

**Código de ejemplo:**

```java
public class Espada {
    private String material;
    private int dano;

    public Espada(String material) {
        this.material = material;
        this.dano = 50;  // Daño básico
    }

    // Métodos para realizar ataques con la espada
}
```

---

### **6. Archivo: `Bloque.java`**

**Descripción:**
La clase `Bloque` puede estar asociada con la creación de bloques dentro de un entorno de simulación o juego (por ejemplo, en un juego tipo "Minecraft"). Esta clase incluye atributos como el tipo de bloque y su resistencia.

**Código de ejemplo:**

```java
public class Bloque {
    private String tipo;
    private int resistencia;

    public Bloque(String tipo) {
        this.tipo = tipo;
        this.resistencia = 100;  // Resistencia inicial
    }

    // Métodos para interactuar con el bloque
}
```


