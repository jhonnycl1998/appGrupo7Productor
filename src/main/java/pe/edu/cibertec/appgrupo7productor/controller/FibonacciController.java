package pe.edu.cibertec.appgrupo7productor.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appgrupo7productor.rabbitmq.FibonacciProductor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {
    private final FibonacciProductor fibonacciProductor;

    @GetMapping("/send")
    public String enviarNumero(@RequestParam String listaNum){
        fibonacciProductor.enviarNumeros(listaNum);
        return "Lista enviada a RabbitMQ correctamente.";
    }
}
