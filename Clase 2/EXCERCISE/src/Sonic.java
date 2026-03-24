import java.time.LocalDate;

public class Sonic {
    
    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private int añoNacimiento;

    //CONSTRUCTOR

    public Sonic (String nombre , String apellidos,String numeroDocumentoIdentidad, int añoNacimiento)
    
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
    }

    //SETTERS



    public void setNombre (String nombre) { this.nombre = nombre;}
    public void setApellidos (String apellidos) { this.apellidos = apellidos;}
    public void setNumeroDocumentoIdentidad (String numeroDocumentoIdentidad) {this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;}
    public void setañoNacimiento (int añoNacimiento) {this.añoNacimiento = añoNacimiento;}

    //GETTERS

    public String getNombre(){ return nombre;}
    public String getApellidos(){ return apellidos;}
    public String getnumeroDocumentoIdentidad(){ return numeroDocumentoIdentidad;}
    public int getañoNacimiento(){ return añoNacimiento;}

    //INFO


    public void showInfo()

    {

        System.out.println( "Nombre de la persona: " + nombre);
        System.out.println("Apellido(s) de la persona: " + apellidos);
        System.out.println("Documento de identidad: " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + añoNacimiento);

    }

    public int calcularEdad()
    
    {

        LocalDate fechaActual = LocalDate.now();

        int edad = fechaActual.getYear() - añoNacimiento;

        return edad;
        
    }

    }