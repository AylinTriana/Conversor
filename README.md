# Conversor De Moneda 

Este proyecto consiste en un programa Java que permite convertir montos de una moneda a otra utilizando la API de ExchangeRate-API. A continuación se detalla cada componente y funcionalidad del código:

## :hammer:Funcionalidades del proyecto

 `Archivos Principales`:
- ConversorMoneda.java: Esta clase contiene la lógica principal para realizar la conversión de monedas.

 `Atributos`:
- moneda: Representa la moneda base a convertir.
- convertirMoneda: Representa la moneda objetivo a la cual se desea convertir.

 `Métodos`:
- consultar(int opcion, Double monto): Construye la URL de la API según la opción seleccionada por el usuario y realiza la solicitud HTTP. Devuelve un objeto de tipo Moneda con la respuesta convertida.
- establecerMonedas(int opcion): Establece las monedas base y objetivo según la opción seleccionada por el usuario.
- realizarSolicitud(URI url): Realiza la solicitud HTTP a la API utilizando HttpClient de Java.

 `Main.java`: Este archivo contiene la lógica de la interfaz de usuario y la ejecución principal del programa.

 `Funcionalidades`:
- Presenta al usuario un menú con opciones para elegir la conversión deseada.
- Solicita al usuario el monto a convertir.
- Invoca el método consultar de ConversorMoneda para obtener el resultado de la conversión.
- Maneja excepciones como entradas inválidas o errores en la solicitud HTTP.

 `Clase Moneda`: Moneda.java: Esta clase es un registro (record) que representa el resultado de la conversión.

 `Campos`:
- base_code: Código de la moneda base.
- target_code: Código de la moneda objetivo.
- conversion_result: Monto convertido en la moneda objetivo.

 `Funcionamiento`:
- Menú de Opciones: El usuario selecciona una opción para especificar la conversión deseada.
- Ingreso de Monto: Se solicita al usuario ingresar el monto que desea convertir.
- Conversión: Utilizando la API de ExchangeRate-API, se realiza la conversión de moneda.
- Resultado: Se muestra al usuario el monto original y el monto convertido junto con los códigos de moneda correspondientes.

 `Uso del Programa`:
- Clonar el repositorio y compilar los archivos Java.
- Ejecutar el archivo Main.java.
- Seguir las instrucciones en consola para realizar conversiones de moneda según las opciones presentadas.

  
Este programa proporciona una manera sencilla y efectiva de convertir monedas utilizando una API externa, brindando al usuario una experiencia interactiva y práctica para realizar cálculos de conversión monetaria.

