import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Mascota {
    private int codigo;
    private String nombre;
    private String especie;
    private String accion;
    private String cualidad;	
    private int edad;

    public Mascota() {
    }

    public void ingresar() {
        nombre = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
        especie = JOptionPane.showInputDialog("Ingrese la especie de mascota");
        accion = JOptionPane.showInputDialog("Ingrese la acción de la mascota");
        cualidad = JOptionPane.showInputDialog("Ingrese la cualidad de la mascota");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal"));
    }

    public Mascota(String nombre, String especie, int edad, String accion, String cualidad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.accion = accion;
        this.cualidad = cualidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getCualidad() {
        return cualidad;
    }

    public void setCualidad(String cualidad) {
        this.cualidad = cualidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Acción: " + accion);
        System.out.println("Cualidad: " + cualidad);
    }

    public void hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else if (especie.equalsIgnoreCase("paloma")) {
            System.out.println("¡Rrrrrrr, rrrrrrr!");
        } else if (especie.equalsIgnoreCase("vaca")) {
            System.out.println("¡Muu muu!");
        } else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }

    public void obtenerAccionMascota() {
        String accionLowerCase = accion.toLowerCase();

        if (accionLowerCase.equals("perro")) {
            System.out.println("Corre");
        } else if (accionLowerCase.equals("gato")) {
            System.out.println("Corre");
        } else if (accionLowerCase.equals("paloma")) {
            System.out.println("Vuela");
        } else if (accionLowerCase.equals("vaca")) {
            System.out.println("Camina");
        } else  {
            System.out.println("La acción no fue reconocida");
        }
    }

    public void obtenerCualidadMascota() {
        String cualidadLowerCase = cualidad.toLowerCase();

        if (cualidadLowerCase.equals("perro")) {
            System.out.println("Olfatea");
        } else if (cualidadLowerCase.equals("gato")) {
            System.out.println("Cazador");
        } else if (cualidadLowerCase.equals("paloma")) {
            System.out.println("Inteligente");
        } else if (cualidadLowerCase.equals("vaca")) {
            System.out.println("Da leche");
        } else {
            System.out.println("La cualidad no fue reconocida");
        }
    }
}
