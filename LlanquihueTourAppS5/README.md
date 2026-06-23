# LlanquihueTourApp

## Descripción
Sistema de gestión de tours para la agencia Llanquihue Tour, ubicada en la Región de Los Lagos. Lee datos desde un archivo externo (tours.txt), los carga en un ArrayList y permite recorrer, filtrar y buscar tours por consola.

## Paquetes y clases

| Paquete | Clase | Descripción |
|---------|-------|-------------|
| model | Tour.java | Clase principal con atributos, getters, setters y toString |
| model | Ubicacion.java | Clase compuesta dentro de Tour (región y comuna) |
| util | LectorArchivo.java | Lee el archivo tours.txt y crea los objetos |
| service | TourService.java | Operaciones sobre la colección: mostrar, filtrar, buscar |
| app | Main.java | Clase principal de ejecución |

## Instrucciones para ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Marcar la carpeta `src` como Sources Root.
3. Ejecutar la clase `Main` ubicada en `src/app/Main.java`.
4. El programa mostrará todos los tours, los filtrará por tipo "aventura" y buscará "Isla Huar".
