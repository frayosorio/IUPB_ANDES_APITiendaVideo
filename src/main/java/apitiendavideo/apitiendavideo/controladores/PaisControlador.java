package apitiendavideo.apitiendavideo.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.entidades.Pais;
import apitiendavideo.apitiendavideo.interfaces.IPaisServicio;

@RestController
@RequestMapping("/paises")
public class PaisControlador {

    private IPaisServicio servicio;

    public PaisControlador(IPaisServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Pais> listar() {
        return this.servicio.listar();
    }

}
