package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.entidades.Titulo;
import apitiendavideo.apitiendavideo.interfaces.ITituloServicio;
import apitiendavideo.apitiendavideo.repositorios.TituloRepositorio;

@Service
public class TituloServicio implements ITituloServicio{
        private TituloRepositorio repositorio;

    public TituloServicio(TituloRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Titulo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Titulo obtener(long id) {
        var titulo = repositorio.findById(id);
        return titulo.isEmpty() ? null : titulo.get();
    }

    @Override
    public Titulo guardar(Titulo titulo) {
        return repositorio.save(titulo);
    }

    @Override
    public boolean eliminar(long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public List<Titulo> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }
}
