<h1 align="center">🎫 Registro de Entradas en Java</h1>
<p align="center">Segundo reto del curso Java Standard Edition 1 (2025) de Tecnolochicas en colaboración con Bedu.</p>

<p align="center">
  <img src="https://img.shields.io/badge/Estado-Finalizado-brightgreen"/>
  <img src="https://img.shields.io/badge/Java-17%2B-red"/>
  <img src="https://img.shields.io/badge/POO-Clases%20y%20Records-blue"/>
  <img src="https://img.shields.io/github/last-commit/samantha09s/registro-de-entradas?style=flat-square"/>
</p>

<p align="center">
  <img src="https://i.pinimg.com/originals/9a/2e/3d/9a2e3dd3f3dc79b9da3bd0ee11d347b3.gif" width="400"/>
</p>

---

## 📚 Descripción

Este proyecto desarrolla un programa en **Java** que permite registrar la información básica de entradas para eventos.  
Se aplican conceptos esenciales de **Programación Orientada a Objetos (POO)** como clases, atributos, métodos, constructores, y se explora el uso de **records** para estructuras más compactas en Java moderno.

---

## Tabla de Contenidos

- [Objetivo del Reto](#-objetivo-del-reto)
- [Cómo Ejecutar el Programa](#️-cómo-ejecutar-el-programa)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Salida Esperada](#-salida-esperada)
- [Aprendizajes](#-aprendizajes)

---

## 🎯 Objetivo del Reto

- Crear una clase `Entrada` con atributos: **nombre del evento** y **precio de la entrada**.
- Implementar un constructor y un método `mostrarInformacion()`.
- Crear una clase `Principal` para instanciar objetos de tipo `Entrada` y desplegar su información.
- (Extra) Utilizar `Entrada_Record` como una solución moderna usando `record`.

---

## ▶️ Cómo Ejecutar el Programa

1. Clona este repositorio:
   ```
   git clone https://github.com/samantha09s/registro-de-entradas.git
   ```
2. Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, VSCode, etc.).
3. Asegúrate de tener configurado **Java 17** o superior.
4. Ejecuta el archivo `Principal.java` para ver el resultado.

---

## 📁 Estructura del Proyecto

```
├── src/
│   ├── Entrada.java          // Clase tradicional con atributos y método
│   ├── Entrada_Record.java   // Record para estructura compacta
│   └── Principal.java        // Clase principal para ejecutar el programa
└── README.md
```

---

## 📤 Salida Esperada

```
Evento: Taylor Swift: The Eras Tour | Precio: $5000.0
Evento: Hope on Stage | Precio: $5125.0

--- Ahora usando el record Entrada_Record ---
Evento: Concierto de Juan Gabriel en Bellas Artes | Precio: $3000.0
Evento: Ballet El Lago de los Cisnes en Castillo Chapultepec | Precio: $1000.0
```

---

## 📘 Aprendizajes

- Creación y uso de **clases** en Java.
- Declaración de **atributos**, **métodos** y **constructores**.
- Aplicación del concepto `record` para simplificar estructuras de datos.
- Buenas prácticas de **organización** en proyectos Java modernos.

---

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos como parte del curso **Java SE 1** de **Tecnolochicas en colaboración con Bedu**.

[![License: CC BY-NC 4.0](https://img.shields.io/badge/Licencia-CC%20BY--NC%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by-nc/4.0/)

---

<p align="center">
  <a href="https://www.linkedin.com/in/samanthamunguia/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-Samantha%20Munguía-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/>
  </a>
  <a href="https://github.com/samantha09s" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-samantha09s-181717?style=for-the-badge&logo=github&logoColor=white"/>
  </a>
</p>

<p align="center">
¡Gracias por visitar este repositorio! 🚀
</p> <h1 align="center">🏥 Registro Básico de Pacientes en Java</h1>
<p align="center">Proyecto de práctica con Programación Orientada a Objetos</p>

<p align="center">
  <img src="https://img.shields.io/badge/Estado-Finalizado-brightgreen"/>
  <img src="https://img.shields.io/badge/Java-8%2B-red"/>
  <img src="https://img.shields.io/badge/OOP-Fundamentals-blue"/>
  <img src="https://img.shields.io/github/last-commit/samantha09s/Registro-de-Pacientes?style=flat-square"/>
  <img src="https://visitor-badge.laobi.icu/badge?page_id=samantha09s.Registro-de-Pacientes" />
</p>

<p align="center">
  <img src="https://media.giphy.com/media/VbnUQpnihPSIgIXuZv/giphy.gif" width="400"/>
</p>

---

## Tabla de Contenidos
- [📂 Descripción](#-descripción)
- [🎯 Objetivo del Reto](#-objetivo-del-reto)
- [▶️ Cómo Ejecutar el Programa](#️-cómo-ejecutar-el-programa)
- [🛠️ Mejoras Futuras](#️-mejoras-futuras)
- [📁 Requisitos del Programa](#-requisitos-del-programa)
- [📦 Estructura del Proyecto](#-estructura-del-proyecto)
- [📤 Ejemplo de Salida Esperada](#-ejemplo-de-salida-esperada)
- [📘 Aprendizajes](#-aprendizajes)
- [📄 Licencia](#-licencia)
- [🤝 Conectemos](#-conectemos)

---

## 📂 Descripción
Este proyecto es una introducción práctica a la **Programación Orientada a Objetos en Java**. A través del reto, se busca implementar clases, objetos, atributos y métodos, así como manejar la entrada de datos desde consola utilizando `Scanner`.

---

## 🎯 Objetivo del Reto
Desarrollar un programa en Java que registre los datos de un paciente, utilizando los fundamentos de:
- Clases y Objetos.
- Atributos y Métodos.
- Entrada de datos por consola.

---

## ▶️ Cómo Ejecutar el Programa
1. Clona el repositorio
2. Abre el proyecto en tu IDE favorito (como IntelliJ IDEA o VSCode)
3. Ejecuta `Principal.java`
4. Ingresa los datos cuando se te soliciten

---

## 🛠️ Mejoras Futuras
- [ ] Validación de entradas
- [ ] Persistencia de datos con archivos
- [ ] Menú interactivo para múltiples pacientes

---

## 📁 Requisitos del Programa

### Clase: `Paciente`
Contiene los siguientes **atributos**:
```java
String nombre;
int edad;
String expediente;
```

Incluye el **método**:
```java
public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Expediente: " + expediente);
}
```

### Clase: `Principal`
Contiene el **método `main`**:
- Se crea un objeto de la clase `Paciente`.
- Se capturan los datos por consola usando `Scanner`.
- Se llama al método `mostrarInformacion()` para imprimir los datos.

---

## 📦 Estructura del Proyecto

```
├── Principal.java       // Ejecuta el programa y pide datos al usuario
└── Paciente.java        // Define la clase Paciente con atributos y método mostrarInformacion
```

---

## 📤 Ejemplo de Salida Esperada

```
--- Información del paciente ---
Nombre: Lena Marie
Edad: 25
Expediente: EXP202409
```

---

## 📘 Aprendizajes
- Declaración y uso de clases personalizadas
- Aplicación de métodos públicos
- Manejo de entrada de datos desde consola
- Separación de lógica en archivos independientes para mantener el código limpio y organizado

---

## 📄 Licencia
Este proyecto fue creado con fines educativos dentro del curso de **Programación en Java** por parte de Tecnolochicas FT + BEDU.

[![License: CC BY-NC 4.0](https://img.shields.io/badge/License-CC%20BY--NC%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by-nc/4.0/)

---

## 🤝 Conectemos
- [GitHub](https://github.com/samantha09s)
- [LinkedIn](https://www.linkedin.com/in/samanthamunguia/)

---

<p align="center">
Gracias por visitar este repositorio. ¡Sigue explorando y aprendiendo más sobre Java! 💻📚
</p>
