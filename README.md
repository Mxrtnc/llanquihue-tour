# LlanquihueTourApp

## Descripción - Semana 7
Esta semana se aplicó polimorfismo y colecciones genéricas sobre la jerarquía de clases existente. Se agregó el método mostrarInformacion() a la superclase ServicioTuristico y se sobrescribió en cada subclase. Los objetos se almacenan en una colección List<ServicioTuristico> y se recorren polimórficamente invocando mostrarInformacion() desde referencias del tipo superclase.

## Clases

| Paquete | Clase | Descripción |
|---------|-------|-------------|
| model | ServicioTuristico.java | Superclase con método mostrarInformacion() base |
| model | RutaGastronomica.java | Sobrescribe mostrarInformacion() con sus atributos |
| model | PaseoLacustre.java | Sobrescribe mostrarInformacion() con sus atributos |
| model | ExcursionCultural.java | Sobrescribe mostrarInformacion() con sus atributos |
| data | GestorServicios.java | Colección polimórfica y recorrido con for-each |
| ui | Main.java | Clase principal de ejecución |

## Instrucciones para ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Marcar la carpeta `src` como Sources Root.
3. Ejecutar la clase `Main` ubicada en `src/ui/Main.java`.
4. El programa mostrará en consola la información de cada servicio turístico según su tipo.
