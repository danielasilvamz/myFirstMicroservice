// Controlador para un microservicio utilizando Spring Boot

package com.microservices.myfirstmicroservice;
//Importar librerias para que funcione:
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indica que esta clase actúa como un controlador de API REST
@RequestMapping("/api") //Define "api" como la parte inicial de la ruta para todos los puntos de acceso en este controlador
public class microservicecontroller {
    @GetMapping("/hello") //Ruta para devolver un saludo básico
    public String hello() {
        return "hello world";
    }
    @GetMapping("/hello/{nombre}") //Ruta para devolver un saludo con el nombre proporcionado en la URL
    public String hello(@PathVariable String nombre) {
        return "Hello World! es un tema de tiempo "+nombre;
    }
 
    @GetMapping("/hola/{nombre}") //Ruta para devolver un saludo en español con el nombre proporcionado en la URL
    public String hola(@PathVariable String nombre) {
        return "Hola mundo! es un tema de tiempo "+nombre;
    }
}
