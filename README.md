# INSTRUCCIONES

## **Fizzbuzz**
**Descripción del problema**

Escribir un programa que muestre en pantalla los números del 1 al 100, sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por “buzz” y los múltiplos de ambos, es decir, los múltiplos de 3 y 5 (o de 15), por la palabra “fizzbuzz”.

- Una vez hayas descargado el repositorio del proyecto y haberlo abierto en tu **IDE** podremos seguir adelante.

- Cuando la aplicación esté en funcionamiento, puedes probar la **API** enviando solicitudes **HTTP**.  De los cuales podras hacer uso a travez de  un **Navegador Web** o una herramienta como **Postman**.

- Es crucial recordar que este programa recibira un parametro inicial que es muy importante para poder saber en que categoria cae siguiendo las intrunciones del ejercicio **FizzBuzz**.

**Algunos ejemplos de solicitudes que puedes utilizar**
- http://localhost:8080/fizzbuzz?number=3  --> debería devolver "Fizz"
- http://localhost:8080/fizzbuzz?number=5 --> debería devolver "Buzz"
- http://localhost:8080/fizzbuzz?number=15 --> debería devolver "FizzBuzz"
- http://localhost:8080/fizzbuzz?number=7 --> debería devolver "7"


## **Collatz**

**Descripción del problema**

La secuencia de Collatz de un número entero se construye de la siguiente forma:
- si el número es par, se lo divide por dos;
- si es impar, se le multiplica tres y se le suma uno;
- la sucesión termina al llegar a uno.

La conjetura de Collatz afirma que, al partir desde cualquier número, la secuencia siempre llegará a 1.

- Una vez hayas descargado el repositorio del proyecto y haberlo abierto en tu **IDE** podremos seguir adelante.

- Cuando la aplicación esté en funcionamiento, puedes probar la **API** enviando solicitudes **HTTP**.  De los cuales podras hacer uso a travez de  un **Navegador Web** o una herramienta como **Postman**.

- Es crucial recordar que este programa recibira un parametro inicial que es muy importante para el cual se calculará la secuencia de **Collatz**.

**Algunos ejemplos de solicitudes que puedes utilizar**

http://localhost:8080/collatz?number=10  --> debería devolver  "10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1"

http://localhost:8080/collatz?number=16 --> debería devolver "16 -> 8 -> 4 -> 2 -> 1"

http://localhost:8080/collatz?number=21 --> debería devolver "21 -> 64 -> 32 -> 16 -> 8 -> 4 -> 2 -> 1"

Esto muestra la secuencia de Collatz generada para el número **n**. Comienza con **n**, luego sigue los pasos de la secuencia hasta llegar a 1, que es el valor final. Cada número en la secuencia es el resultado de aplicar la regla de Collatz al número anterior.
