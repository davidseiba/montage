
package poo;


public class RegistrosHoteles {
    // atributos
    private int idHabitacion;
    private String Nombre;
    private String Telefono;
    private int Noches;
    private String Fecha;
    // Atributos para evento:
    private String nombreEvento;
    private String hotelLugar;
    private String fechaInicio;
    private String mesa;
    private String centroMesa;
    private String mantel;
    private String lucesLed;
    private String flores;

    public RegistrosHoteles() {
    }

    public RegistrosHoteles(int idHabitacion, String Nombre, String Telefono, int Noches, String Fecha) {
        this.idHabitacion = idHabitacion;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Noches = Noches;
        this.Fecha = Fecha;
    }

    public RegistrosHoteles(int idHabitacion, String Nombre, String Telefono, int Noches, String Fecha, String nombreEvento, String hotelLugar, String fechaInicio, String mesa, String centroMesa, String mantel, String lucesLed, String flores) {
        this.idHabitacion = idHabitacion;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Noches = Noches;
        this.Fecha = Fecha;
        this.nombreEvento = nombreEvento;
        this.hotelLugar = hotelLugar;
        this.fechaInicio = fechaInicio;
        this.mesa = mesa;
        this.centroMesa = centroMesa;
        this.mantel = mantel;
        this.lucesLed = lucesLed;
        this.flores = flores;
    }
      

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNoches() {
        return Noches;
    }

    public void setNoches(int Noches) {
        this.Noches = Noches;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }  

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }  

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getHotelLugar() {
        return hotelLugar;
    }

    public void setHotelLugar(String hotelLugar) {
        this.hotelLugar = hotelLugar;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getCentroMesa() {
        return centroMesa;
    }

    public void setCentroMesa(String centroMesa) {
        this.centroMesa = centroMesa;
    }

    public String getMantel() {
        return mantel;
    }

    public void setMantel(String mantel) {
        this.mantel = mantel;
    }

    public String getLucesLed() {
        return lucesLed;
    }

    public void setLucesLed(String lucesLed) {
        this.lucesLed = lucesLed;
    }

    public String getFlores() {
        return flores;
    }

    public void setFlores(String flores) {
        this.flores = flores;
    }
    
    
}
