# 🕹️ Tic Tac Toe en Java (MVC)

Un juego clásico de tres en línea (Tic Tac Toe) desarrollado en Java con el patrón de arquitectura **Modelo-Vista-Controlador (MVC)**.
El juego se ejecuta en la terminal y permite que dos jugadores compitan localmente. El proyecto presenta una separación clara de responsabilidades 
y está organizado para facilitar su mantenimiento y escalabilidad.

## 📌 Funcionalidades

- Juego local para dos jugadores  
- Interfaz en consola simple y clara  
- Detección automática de ganador o empate  
- Separación de lógica mediante MVC  
- Código limpio y modular  

## 🚀 Tecnologías utilizadas

- Lenguaje: **Java**  
- IDE: **IntelliJ IDEA**  
- Ejecución: **Terminal / Consola**  
- Arquitectura: **Modelo-Vista-Controlador (MVC)**  

## 🧠 ¿Cómo jugar?

### 1. Clonar el repositorio

```bash
git clone https://github.com/J-uds/tic-tac-toe.git
cd tic-tac-toe
```

### 2. Compilar el proyecto

Si estás usando terminal y `javac`:

```bash
javac -d out src/org/example/**/*.java
```

### 3. Ejecutar el juego

```bash
java -cp out org.example.Main
```

O si usas **IntelliJ IDEA**:

- Abre el proyecto desde IntelliJ (`File > Open`)
- Haz clic derecho en la clase `Main` y selecciona **Run**

### 4. Estructura del proyecto

```plaintext
src/
├── org.example.controllers/ # Controlador del juego     
├── org.example.models/ # Lógica del juego (Modelo)      
├── org.example.view/ #  # Vista en consola
└── org.example/Main.java  # Punto de entrada
```

### 5. Ejecutar pruebas (opcional)
Desde IntelliJ:

- Haz clic derecho en la carpeta `test` > **Run Tests**
