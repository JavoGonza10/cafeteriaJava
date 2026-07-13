# cafeteriaJava

## ¿Qué es este proyecto?
Aplicación de consola en Java para gestionar tickets de venta de una cafetería

## ¿Qué hace?
Funcionalidad: registra clientes, camareros y productos (comida/bebida) en un ticket,
calcula el total y permite aplicar descuentos

## ¿Cómo se hace? (funcionamiento interno)
Explica el flujo: se crea un Cliente y un Camarero → se abre un Ticket → se le añaden
Productos (Bebida o Comida) con agregarProducto() → calcularTotal() suma los precios →
mostrarTicket() genera el resumen final

## Tecnologías usadas
- Java 17
- Gradle (gestión de dependencias y build)
- JUnit 5 (testing)
- Javadoc (documentación)
- Git / GitHub (control de versiones)

## Cómo usarlo
```bash
git clone https://github.com/JavoGonza10/cafeteriaJava.git
cd cafeteriaJava
.\gradlew.bat build
.\gradlew.bat run
```

## Arquitectura básica

## Producto: 
es la clase basetiene nombre, precio, categoría, e implementa la interfaz Descontable (método aplicarDescuento).

## Bebida y Comida: 
heredan de Producto y sobrescriben mostrarDetalles() para añadir su atributo propio (tamanio / esCaliente).

## Ticket: 
no hereda de nada, sino que compone: contiene un Cliente, un Camarero y un array de Producto (polimorfismo: el array guarda tanto Bebida como Comida indistintamente).

## Cliente y Camarero: 
son clases independientes, simples contenedores de datos con sus getters/setters.