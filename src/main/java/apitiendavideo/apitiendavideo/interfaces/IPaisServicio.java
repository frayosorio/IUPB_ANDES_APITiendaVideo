package apitiendavideo.apitiendavideo.interfaces;

import java.util.List;

import apitiendavideo.apitiendavideo.entidades.Pais;

public interface IPaisServicio {
    
    public List<Pais> listar();

    public Pais obtener(long id);

    public Pais guardar(Pais pais);

    public boolean eliminar(long id);

}
