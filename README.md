# Projects_Java-Springboot

## Tabla de Contenido
* [E01-Vector_Java](#vectorJava)
* [E02-Centinela_Java](#centinelaJava)
* [E03-NumerosLimite_Java](#numerosJava)
* [E04-Matrices_Java](#matricesJava)
* [E05-PokeJuego_Java](#pokeJava)
* [E06-Notas_Springboot](#notasSpringboot)
* [E07-Basquet_Springboot](#basquetSpringboot)
* [E08-Triangulo_Springboot](#trianguloSpringboot)
* [E09-Estudiante_Springboot](#estudianteSpringboot)
* [P01-Videojuegos_Java](#videojuegosSpringboot)
* [P02-PlantasHerencia_Java](#plantasSpringboot)
* [P03-MenuRestaurante_Springboot](#menuSpringboot)
* [P04-Odontologia_Springboot](#odontologiaSpringboot)
* [P05-ClinicaCanina_Springboot](#clinicaSpringboot)
* [P06-Tienda_SpringBoot](#tiendaSpringboot)

## E01-Vector_Java

In. this exercise we apply a for loop, to make a program that allows loading 15 numbers in a vector.
Once loaded, the program needs to count and report on the screen how many times number 3 was loaded.

En este ejercicio aplicamos un ciclo for, para realizar un programa que permita cargar 15 números en un vector.
Una vez cargados, se necesita que el programa cuente e informe por pantallacuantas veces se cargó el número 3.

## E02-Centinela_Java

In this exercise we are going to apply a while loop, to create a program that displays words that are entered by keyboard on the screen until the word "exit" is entered.

En este ejercicio vamos a aplicar un ciclo while, para realizar un programa que muestre en pantalla palabras que sean ingresadas
por teclado hasta que se ingrese la palabra "salir".

## E03-NumerosLimite_Java

In this exercise, a while loop will be used to create a program that, given a numerical limit (for example, 100) by keyboard, displays all the numbers up to that limit (starting with 1) on the screen.

En este ejercicio se utilizará un ciclo while, para realizar un programa que dado por teclado un límite numérico (por ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1).

## E04-Matrices_Java

In this exercise, two for loops will be used so that it can allow the teacher to load the student's grades in the three positions of a table (3 columns of each row), and that the averages are calculated in the last column. Once the calculations are done, you want to show the 3 grades of each student and the corresponding average by going through the matrix

En este ejercicio, se utilizara dos ciclos for para que le pueda permitir al profesor, cargar en las tres posiciones de una tabla ( 3 columnas de cada fila), las notas del alumno, y que en la última columna se calculen los promedios. Una vez realizado los calculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.

## E05-PokeJuego_Java

There is an abstract class, which has the attributes: num_pokedex (number), nombrePokemon (name), pesoPokemon (weight), sexo (gender), temporadaQueAparece (season) and type.
Methods are implemented for the common attacks that most of them usually have, among them are: atacarPlacaje(), atacarArañazo() y atacarMordisco().
In addition, interfaces were developed to contemplate the types of pokemons: Water, Fire, Plant and Electric.

After the interfaces, the classes that handle the main characters of the video game were created, which are the starter pokemons of the first season (Charmander, Bulbasaur and Squirtle) and Pikachu; To do this, keep in mind that:
* Charmander is fire type
* Bulbasaur is a plant type
* Squirtle is a water type
* Pikachu is an electric type

Once the abstract class and interfaces have been implemented, the corresponding methods are overwritten to adapt them to each Pokemon, displaying a message on the screen indicating which Pokemon it is and what attack it is performing.
For example:
* "Hello I'm Charmander and this is my scratch attack"
* "Hi, I'm Pikachu and this is my tackle attack."

After doing the above, create the necessary instances and call each of the methods of each Pokemon.

### Technologies
* Intellij Idea 2022.3.3
* JDK 11

---

Se cuenta con una clase abstracta,la cual posee los atributos: num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece y tipo.
Se implementan métodos para los ataques comunes que suele tener la mayoría, entre ellos se encuentran: atacarPlacaje(), atacarArañazo() y atacarMordisco(). 
Además, se desarrollaron interfaces para contemplar los tipos de pokemons: Agua, Fuego, Planta y Eléctrico.

Luego de las interfaces, se crearon las clases que manejan los principales personajes del videojuego, que son los pokemons starters de la primera temporada (Charmander, Bulbasaur y Squirtle) y Pikachu; para ello tener en cuenta que: 
* Charmander es de tipo fuego
* Bulbasaur es de tipo planta
* Squirtle es de tipo agua 
* Pikachu de tipo eléctrico.

Una vez implementadas la clase abstracta e interfaces, se sobreescriben los métodos correspondientes para adaptarlos a cada Pókemon mostrando un mensaje en pantalla que indique qué pókemon es y qué ataque está realizando.
Por ejemplo: 
* “Hola soy Charmander y este es mi ataque arañazo” 
* “Hola soy Pikachu y este es mi ataque placaje”.

Luego de realizar lo mencionado, crear las instancias necesarias y llamar a cada uno de los métodos de cada Pokemon.

### Tecnologías
* Intellij Idea 2022.3.3
* JDK 11


## E06-Notas_Springboot



## E07-Basquet_Springboot



## E08-Triangulo_Springboot



## E09-Estudiante_Springboot



## P01-Videojuegos_Java

The IGU, LOGIC, and PERSISTENCE layers are created. In this exercise we focus on working with the LOGIC layer.

A class called VIdeojuego is created, which has the following attributes: codigo, titulo, consola, cantJugadores, categoria.
In addition to including the attributes, also include the constructors (empty and full), getters and setters methods.
The toString() was added as an extra to use later.

We go to the main class EjercicioVideojuego.java, in which the following exercises were carried out:

* Point 1: An ArrayList of the Videogame type was created, in which 5 videogames were created and saved in the collection using the "add" method.

* Point 2: A foreach is used to display the following on the screen: title, console, number of players of all stored videogames.

* Point 3: The name and the number of players of two video games were changed and again with a foreach it was shown on the screen to confirm the changes.

* Point 4: Finally, it was requested to filter the list of video games to show on the screen those that are from the console = "Nintendo 64".
For this, the foreach was used again but an if was included and the .equals was used to verify if the object's console matches the requested criteria.


### Technologies
* Intellij Idea 2022.3.3
* JDK 11

---

Se crean las capas IGU, LOGICA y PERSISTENCIA. En este ejercicio nos enfocamos a trabajar con la capa LOGICA.

Se crea una clase llamada Videojuego, que tenga los siguientes atributos: codigo, titulo, consola, cantidadJugadores, categoria.
Además de incluir los atributos, también incluir los constructores (vacío y full), métodos getters y setters.
Se agregó como extra el toString() para usar posteriormente.

Nos vamos a la clase principal EjercicioVideojuego.java, en la cual se realizaron los siguientes ejercicios:

* Punto 1: Se creó una ArrayList del tipo Videojuego, en los cuales se crearon 5 videojuegos y se guardaron en la collection usando el método "add"

* Punto 2: Se utiliza un foreach para mostrar por pantalla lo siguiente: titulo, consola, cantidad de jugadores de todos los videojuegos almacenados.

* Punto 3: Se realizó el cambio de nombre y la cantidad de jugadores de dos videojuegos y nuevamente con un foreach se mostró por pantalla para confirmar los cambios.

* Punto 4: Finalmente se solicitó filtrar la lista de videojuegos para mostrar en pantalla los que sean de consola = "Nintendo 64".
Para ello se usó nuevamente el foreach pero se incluyó un if y se utilizó el .equals para verificar si la consola del objeto coincide con el criterio solicitado.


### Tecnologías
* Intellij Idea 2022.3.3
* JDK 11

## P02-PlantasHerencia_Java

Project to practice:
* Inheritance: creation of parent/child classes
* Inherited and abstract methods
* Creating objects and calling methods from the Main class
* Encapsulation: private vs public in parent and child classes

### Parent class
The Plant.java class is created, considered the Parent class, which has the following attributes: nombre, altoTallo, tieneHojas, climaIdeal.
Empty and full constructors and getters and setters are created for this class.
In addition, the decirLoQueSoy() method is created, which will allow it to be displayed on the screen later. It is defined as an abstract method.

### Child Classes

Inherits from the parent class, indicating extends Planta
And the methods that the Parent class has are implemented, in this case decirLoQueSoy()

Child classes are created, with the following attributes:
* Arbol.java: variedad, tipoTronco, radioTronco, color, tipoHojas.
* Flor.java: colorPetalos, cantPetalos, colorPistillo, variedad, estación.
* Arbusto.java: ancho, esDomestico, variedad, colorHojas, sePodaONo.

Empty and full constructors and getters and setters are created for this class.

then for each class the internal content of the ``decirLoQueSoy() method is modified to the following:
* en la clase Arbol --> System.out.println("Hola, soy un árbol!");
* en la clase Flor --> System.out.println("Hola, soy una flor!");
* en la clase Arbusto --> System.out.println("Hola, soy un arbusto!");

### Class Main

In the main class, we proceed to create three objects, in this case we use the empty constructor because we will not indicate attributes to the objects, they are the following:
* Objeto tipo arbol: Arbol arbolito = new Arbol();
* Objeto tipo flor: Flor florecita = new Flor();
* Objeto tipo arbusto: Arbusto arbustito = new Arbusto();

and with this we observe the output of the project.

Finally, we analyze the concept of encapsulation, in which the following was verified:
1. Clase Padre public --> es accesible por cualquier clase del proyecto y además, permite que la clase hija la indique como public
2. Clase Padre private --> solo es accesible por las clases hijas.
3. Clase Padre protected --> solo es accesible por las clases hijas y éstas lo pueden indicar como protected o public.


### Technologies
* Netbeans 12.3
* JDK 11

---

Proyecto para practicar:
* Herencia: creación de clases padre/hijas
* Métodos heredados y abstractos
* Creación de objetos y llamado de métodos desde clase Main
* Encapsulamiento: private vs public en clases padre e hijas

### Clase Padre
Se crea la clase Planta.java, considerada la clase Padre, que tenga los siguientes atributos: nombre, altoTallo, tieneHojas, climaIdeal.
A esta clase se le crean los constructores vacío y full y los getters y setters.
Además, se crea el método decirLoQueSoy(), que permitirá mostrar en pantalla posteriormente. Se define como método abstracto.

### Clases Hijas

Se hereda de la clase padre, indicando extends Planta
Y se implementan los métodos que tiene esa clase Padre, en este caso decirLoQueSoy()

Se crean las clases Hijas, con los siguientes atributos:
* Arbol.java: variedad, tipoTronco, radioTronco, color, tipoHojas.
* Flor.java: colorPetalos, cantPetalos, colorPistillo, variedad, estación.
* Arbusto.java: ancho, esDomestico, variedad, colorHojas, sePodaONo.

A esta clase se le crean los constructores vacío y full y los getters y setters.

luego para cada clase se modifica el contenido interno del método ``decirLoQueSoy() a lo siguiente:
* en la clase Arbol --> System.out.println("Hola, soy un árbol!");
* en la clase Flor --> System.out.println("Hola, soy una flor!");
* en la clase Arbusto --> System.out.println("Hola, soy un arbusto!");

### Clase Main

En la clase main, procedemos a crear tres objetos, en este caso hacemos uso del constructor vacío porque no indicaremos atributos a los objetos, son los siguientes:
* Objeto tipo arbol: Arbol arbolito = new Arbol();
* Objeto tipo flor: Flor florecita = new Flor();
* Objeto tipo arbusto: Arbusto arbustito = new Arbusto();

y con esto observamos la salida del proyecto.

Por ultimo analizamos el concepto de encapsulamiento, en el cual, se verificó lo siguiente:
1. Clase Padre public --> es accesible por cualquier clase del proyecto y además, permite que la clase hija la indique como public
2. Clase Padre private --> solo es accesible por las clases hijas.
3. Clase Padre protected --> solo es accesible por las clases hijas y éstas lo pueden indicar como protected o public.


### Tecnologías
* Netbeans 12.3
* JDK 11


## P03-MenuRestaurante_Springboot



## P04-Odontologia_Springboot



## P05-ClinicaCanina_Springboot



## P06-Tienda_SpringBoot



## P06-Tienda_SpringBoot
