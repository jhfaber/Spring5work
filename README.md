# Spring5work
Spring project for show how create a spring boot project with thymeleaf, security, security, web since a aproach monolitic, HTTP querys



## This project

is a beatifull begin for my experience in development, i want increase my skillls in all the new tecnologies and follow my way as develop profesional.

# Features

This project just have some features for practice, it just use JPA for create a database in h2 and use some concepts as Controllers, Repositorires, CRUD, views (thymeleaf), i use some console commands for show registers.

Este projecto tiene como resultado base [con un archivo readme](/edit/master/README.md) para la utilización de metodos y escrituras.


## CDI

Para tendener un poco CDI podemos seguir el siguiente [enlace](http://programandoointentandolo.com/2013/05/inyeccion-de-dependencias-en-spring.html).

Algunos elementos importantes a notar, @Component= bean, @Service, @Repository y @Controller son estereotipos de @Component, mientras que @Autowired corresponde a los atributos que va a tener el bean, puede ser en puesto en un atributo, set o constructor-

- Si tenemos @Qualifier(''), se utiliza para elegir la implementacin de una interfaz, esto es cuando una interfaz tiene 2 o mas implementaciones, entonces elegimos la clase implementada que necesiatmos.
- No olvidar que con CDI es un contenedor de beans, lo que permite que cada objeto sea inyectado en vez de instanceado (creado) por la misma clase.
- Al ser un objeto inyectado, tiene por defecto @Scope('Singleton'), solo existe una instancia del objeto, el @Scope se puede cambiar para que tenga otros comportamientos.
