package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.entidades.Pais;
import apitiendavideo.apitiendavideo.interfaces.IPaisServicio;
import apitiendavideo.apitiendavideo.repositorios.PaisRepositorio;

@Service
public class PaisServicio implements IPaisServicio {

    private PaisRepositorio repositorio;

    public PaisServicio(PaisRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Pais> listar() {
        return repositorio.findAll();
    }

    @Override
    public Pais obtener(long id) {
        return null;
    }

    @Override
    public Pais guardar(Pais pais) {
        return null;
    }

    @Override
    public boolean eliminar(long id) {
        return true;
    }

}
