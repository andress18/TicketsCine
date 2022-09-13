package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Pelicula;

public class PeliculasDAO implements DAO<Pelicula> {
    private Connection conn;
    final String TABLE_NAME = "PELICULAS";

    public PeliculasDAO() {
        this.conn = new Conexion().getConnection();
    }

    @Override
    public Pelicula Get(long id) {
        String sql = "SELECT * FROM " + TABLE_NAME + " where id_pelicula=?";
        Pelicula pelicula;
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setLong(1, id);
            ResultSet result = stm.executeQuery();
            pelicula = new Pelicula();
            while (result.next()) {
                pelicula.setIdPelicula(Integer.parseInt(result.getString("id_pelicula")));
                pelicula.setNombre(result.getString("nombre"));
                pelicula.setDuracionMinutos(Integer.parseInt(result.getString("duracion_minutos")));
                pelicula.setEstreno(result.getDate("estreno"));
                pelicula.setRutaImagen(result.getString("ruta_imagen"));
            }
            stm.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return pelicula;
    }

    @Override
    public List<Pelicula> GetAll() {
        String sql = "SELECT * FROM " + TABLE_NAME;
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet result = stm.executeQuery();
            peliculas = new ArrayList<>();
            while (result.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setIdPelicula(Integer.parseInt(result.getString("id_pelicula")));
                pelicula.setNombre(result.getString("nombre"));
                pelicula.setDuracionMinutos(Integer.parseInt(result.getString("duracion_minutos")));
                pelicula.setEstreno(result.getDate("estreno"));
                pelicula.setRutaImagen(result.getString("ruta_imagen"));

                peliculas.add(pelicula);
            }
            stm.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return peliculas;
    }

    @Override
    public void Create(Pelicula pelicula) {
        PreparedStatement stm;
        String sql = "INSERT INTO " + TABLE_NAME + " VALUES(?,?,?,?)";
        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1, pelicula.getIdPelicula().toString());
            stm.setString(2, pelicula.getNombre());
            stm.setString(3, pelicula.getDuracionMinutos().toString());
            stm.setString(4, pelicula.getEstreno().toString());
            stm.executeUpdate();

            stm.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Update(Pelicula pelicula) {
        PreparedStatement stm;
        String sql = "UPDATE " + TABLE_NAME + " SET nombre=?, duracion_minutos=?, estreno=? where id_pelicula=?";
        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1, pelicula.getNombre());
            stm.setString(2, pelicula.getDuracionMinutos().toString());
            stm.setString(3, pelicula.getEstreno().toString());
            stm.setString(4, pelicula.getIdPelicula().toString());
            stm.executeUpdate();

            stm.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Delete(long id) {
        PreparedStatement stm;
        String sql = "DELETE FROM " + TABLE_NAME + " where id_pelicula=?";
        try {
            stm = conn.prepareStatement(sql);
            stm.setLong(1, id);

            stm.executeUpdate();
            stm.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
