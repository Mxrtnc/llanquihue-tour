# LlanquihueTourApp

## Descripción - Semana 6
Esta semana se implementó una jerarquía de clases con herencia simple para representar los distintos servicios turísticos que ofrece la agencia Llanquihue Tour: rutas gastronómicas, paseos lacustres y excursiones culturales. Todas las subclases heredan de una superclase común y sobrescriben el método toString().

## Clases creadas

| Paquete | Clase | Descripción |
|---------|-------|-------------|
| model | ServicioTuristico.java | Superclase con atributos nombre y duracionHoras |
| model | RutaGastronomica.java | Subclase con atributo adicional numeroDeParadas |
| model | PaseoLacustre.java | Subclase con atributo adicional tipoEmbarcacion |
| model | ExcursionCultural.java | Subclase con atributo adicional lugarHistorico |
| data | GestorServicios.java | Crea instancias de prueba de cada subclase |
| ui | Main.java | Clase principal de ejecución |

## Instrucciones para
