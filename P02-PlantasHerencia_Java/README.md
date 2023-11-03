# PlantsInheritanceJava
Exercise to practice:
* Inheritance: creation of parent/child classes
* Inherited and abstract methods
* Creating objects and calling methods from the Main class
* Encapsulation: private vs public in parent and child classes

## Parent class
The Plant.java class is created, considered the Parent class, which has the following attributes: nombre, altoTallo, tieneHojas, climaIdeal.
Empty and full constructors and getters and setters are created for this class.
In addition, the decirLoQueSoy() method is created, which will allow it to be displayed on the screen later. It is defined as an abstract method.

## Child Classes

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

## Class Main

In the main class, we proceed to create three objects, in this case we use the empty constructor because we will not indicate attributes to the objects, they are the following:
* Objeto tipo arbol: Arbol arbolito = new Arbol();
* Objeto tipo flor: Flor florecita = new Flor();
* Objeto tipo arbusto: Arbusto arbustito = new Arbusto();

and with this we observe the output of the project.

Finally, we analyze the concept of encapsulation, in which the following was verified:
1. Clase Padre public --> es accesible por cualquier clase del proyecto y además, permite que la clase hija la indique como public
2. Clase Padre private --> solo es accesible por las clases hijas.
3. Clase Padre protected --> solo es accesible por las clases hijas y éstas lo pueden indicar como protected o public.


## Technologies
* Netbeans 12.3
* JDK 11

<hr>

# PlantasHerenciaJava
Ejercicio para practicar:
* Herencia: creación de clases padre/hijas
* Métodos heredados y abstractos
* Creación de objetos y llamado de métodos desde clase Main
* Encapsulamiento: private vs public en clases padre e hijas

## Clase Padre
Se crea la clase Planta.java, considerada la clase Padre, que tenga los siguientes atributos: nombre, altoTallo, tieneHojas, climaIdeal.
A esta clase se le crean los constructores vacío y full y los getters y setters.
Además, se crea el método decirLoQueSoy(), que permitirá mostrar en pantalla posteriormente. Se define como método abstracto.

## Clases Hijas

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

## Clase Main

En la clase main, procedemos a crear tres objetos, en este caso hacemos uso del constructor vacío porque no indicaremos atributos a los objetos, son los siguientes:
* Objeto tipo arbol: Arbol arbolito = new Arbol();
* Objeto tipo flor: Flor florecita = new Flor();
* Objeto tipo arbusto: Arbusto arbustito = new Arbusto();

y con esto observamos la salida del proyecto.

Por ultimo analizamos el concepto de encapsulamiento, en el cual, se verificó lo siguiente:
1. Clase Padre public --> es accesible por cualquier clase del proyecto y además, permite que la clase hija la indique como public
2. Clase Padre private --> solo es accesible por las clases hijas.
3. Clase Padre protected --> solo es accesible por las clases hijas y éstas lo pueden indicar como protected o public.


## Tecnologías
* Netbeans 12.3
* JDK 11
