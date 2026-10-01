# SmartLibrary – Taller Bloque 5

Implementación parcial en Java del caso SmartLibrary, usada para validar las decisiones de diseño del taller *De clases aisladas a objetos que colaboran* (asociación, agregación, composición, herencia, interfaces y componentes UML).


## Requisitos

- **JDK 11 o superior** (se probó con JDK 21).
- Verifica tu instalación con:

```bash
java -version
javac -version
```

```

## Cómo compilar y ejecutar

Desde la carpeta raíz del proyecto (`SmartLibrary/`):

**1. Compilar**

```bash
javac -d out src/smartlibrary/*.java
```

Esto genera los archivos `.class` en la carpeta `out/`.

**2. Ejecutar**

```bash
java -cp out smartlibrary.Main
```

> En PowerShell o CMD, si el comodín `*.java` no funciona, usa:
> `javac -d out (Get-ChildItem src -Recurse -Filter *.java).FullName`



## Documentación

El diagrama de clases UML y las justificaciones de las actividades están en la carpeta [`docs/`](docs/).
