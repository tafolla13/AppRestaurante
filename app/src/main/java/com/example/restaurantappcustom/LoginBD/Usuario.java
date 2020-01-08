package com.example.restaurantappcustom.LoginBD;

public class Usuario {
    int id;
    String Nombre,Usuario, Password;

    public Usuario() {
    }

    public Usuario(String nombre, String usuario, String password) {
        Nombre = nombre;
        Usuario = usuario;
        Password = password;
    }

    public boolean isNull(){
        if(Nombre.equals("") && Usuario.equals("")&& Password.equals("") ){
            return false;
        }else{
            return true;
        }
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Usuario='" + Usuario + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
