# Projects_Java-Springboot
## Resume / *Resumen*
This is a full repository including exercises and projects developed to study, learn and work in Java technology using Netbeans/Intellij and jdk versions like 8, 11, 15.

*Este es un repo completo incluyendo ejercicios y proyectos desarrollados para estudiar, aprender y trabajar con la tecnología de Java usando Netbeans/Intellij y versiones jdf como 8, 11, 15.*

## Table of Content / *Tabla de Contenido*
- Exercises / *Ejercicios*
  - [E001-Vectores](#vectores)
  - [E002-Centinelas](#centinelas)
  - [E003-NumerosLimite](#numeroslimite)
  - [E004-Matrices](#matrices)
  - [E005-TemperaturaCiudades](#temperaturaciudades)
  - [E101-PokeJuego](#pokejuego)
  - [E102-PlantasHerencia](#plantasherencia)
  - [E103-Videojuegos](#videojuegos)
  - [E301-PromedioNotas](#promedionotas)
  - [E302-EstaturasBasquet](#estaturasbasquet)
  - [E303-AreaTriangulo](#areatriangulo)
- Projects / *Proyectos*
  - [P001-Copiadora](#copiadora)
  - [P002-AgendaElectronica](#agendaelectronica)
  - [P003-ArbolitoNavidad](#arbolitonavidad)
  - [P101-PeluqueriaCanina](#peluqueriacanina)
  - [P102-ConcesionariaAutos](#concesionariaautos)
  - [P103-Login](#login)
  - [P104-RolesPermisos](#rolespermisos)
  - [P301-menuRestaurant](#menurestaurante)
  - [P302-Odontologia](#odontologia)
  - [P303-ClinicaVeterinaria](#clinicaveterinaria)
  - [P304-TiendaBazar](#tiendabazar)

## E001-Vectores

In this exercise we apply a for loop, to make a program that allows loading 15 numbers in a vector.
Once loaded, the program needs to count and report on the screen how many times number 3 was loaded.

*En este ejercicio aplicamos un ciclo for, para realizar un programa que permita cargar 15 números en un vector.
Una vez cargados, se necesita que el programa cuente e informe por pantallacuantas veces se cargó el número 3.*

### Technologies / *Tecnologías*
* Netbeans 8.2
* JDK 8

## E002-Centinelas

In this exercise we are going to apply a while loop, to create a program that displays words that are entered by keyboard on the screen until the word "exit" is entered.

*En este ejercicio vamos a aplicar un ciclo while, para realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra "salir".*

### Technologies / *Tecnologías*
* Netbeans 8.2
* JDK 8

## E003-NumerosLimite

In this exercise, a while loop will be used to create a program that, given a numerical limit (for example, 100) by keyboard, displays all the numbers up to that limit (starting with 1) on the screen.

*En este ejercicio se utilizará un ciclo while, para realizar un programa que dado por teclado un límite numérico (por ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1).*

### Technologies / *Tecnologías*
* Netbeans 8.2
* JDK 8

## E004-Matrices

In this exercise, two for loops will be used so that it can allow the teacher to load the student's grades in the three positions of a table (3 columns of each row), and that the averages are calculated in the last column. Once the calculations are done, you want to show the 3 grades of each student and the corresponding average by going through the matrix

*En este ejercicio, se utilizara dos ciclos for para que le pueda permitir al profesor, cargar en las tres posiciones de una tabla ( 3 columnas de cada fila), las notas del alumno, y que en la última columna se calculen los promedios. Una vez realizado los calculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.*

### Technologies / *Tecnologías*
* Netbeans 8.2
* JDK 8

## E101-PokeJuego

Translate to English:
Classes and interfaces that fetch information from online Pokémon and depending on the type display a message on the screen. For example:
- "Hello, I'm Charmander and this is my Scratch attack."
- "Hello, I'm Pikachu and this is my Tackle attack."
After doing the above, create the necessary instances and call each of the methods of each Pokémon.

*Clases e interfaces que toma informacion de los pokemones online y dependiendo del tipo mostrar mensaje en pantalla. Por ejemplo:*
- *“Hola soy Charmander y este es mi ataque arañazo”*
- *“Hola soy Pikachu y este es mi ataque placaje”.*
*Luego de realizar lo mencionado, crear las instancias necesarias y llamar a cada uno de los métodos de cada Pokemon.*

### Technologies / *Tecnologías*
* Intellij Idea 2022.3.3
* JDK 11

## E102-PlantasHerencia

Project to practice inheritance with the creation of parent/child classes. And encapsulation with private vs public in parent and child classes

Finally, we analyze the concept of encapsulation, in which the following was verified: (1) Parent public is accessible by any project class and allow that child class show as public. (2) Parent private is only accessible by chold classes. (3) Parent protected is only accessible by child classes and can be indicated as protected or public.

*Proyecto para practicar herencia con la creación de clases padre/hijas. Y encapsulamiento con private vs public in clases padres e hijas.*

*Por ultimo analizamos el concepto de encapsulamiento, en el cual, se verificó lo siguiente: (1) Clase Padre public es accesible por cualquier clase del proyecto y además, permite que la clase hija la indique como public. (2) Clase Padre private solo es accesible por las clases hijas. (3 )Clase Padre protected solo es accesible por las clases hijas y éstas lo pueden indicar como protected o public.*

### Technologies
* Netbeans 12.3
* JDK 11

## E103-Videojuegos

Layer model is created focused in Logic Layer.

Also attributes, constructors, getter and setter methods were included.

The points developed were: (1) An ArrayList of the Videogame type was created, in which 5 videogames were created and saved in the collection using the "add" method. (2) A foreach is used to display the following on the screen: title, console, number of players of all stored videogames. (3) The name and the number of players of two video games were changed and again with a foreach it was shown on the screen to confirm the changes.(4)) Finally, it was requested to filter the list of video games to show on the screen those that are from the console = "Nintendo 64". For this, the foreach was used again but an if was included and the .equals was used to verify if the object's console matches the requested criteria.

*Modelo de capas es creado enfocado en la capa lógica.*

*También atributos, construsctores, métodos get y set fueron incluidos.*

*Los puntos desarrollados fueron: (1) Se creó una ArrayList del tipo Videojuego, en los cuales se crearon 5 videojuegos y se guardaron en la collection usando el método "add". (2) Se utiliza un foreach para mostrar por pantalla lo siguiente: titulo, consola, cantidad de jugadores de todos los videojuegos almacenados. (3) Se realizó el cambio de nombre y la cantidad de jugadores de dos videojuegos y nuevamente con un foreach se mostró por pantalla para confirmar los cambios. (4) Finalmente se solicitó filtrar la lista de videojuegos para mostrar en pantalla los que sean de consola = "Nintendo 64".*

### Technologies
* Intellij Idea 2022.3.3
* JDK 11

## E301-PromedioNotas

## E302-EstaturasBasquet

## E303-AreaTriangulo

## P001-Copiadora

## P002-AgendaElectronica

## P003-ArbolitoNavidad

## P101-PeluqueriaCanina

## P102-ConcesionariaAutos

## P103-Login

## P104-RolesPermisos

## P301-menuRestaurant

## P302-Odontologia

## P303-ClinicaVeterinaria

## P304-TiendaBazar
