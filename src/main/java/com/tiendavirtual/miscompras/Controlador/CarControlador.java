package com.tiendavirtual.miscompras.Controlador;

import com.tiendavirtual.miscompras.Controlador.dto.CarDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarControlador {
    @GetMapping("/car")
    public String obtenerCarros(){
        return "Hola mundo";
    }

    @PostMapping("/car")
    public void crearCarro(@RequestBody CarDto carDto){
        System.out.println(carDto);


    }

}
