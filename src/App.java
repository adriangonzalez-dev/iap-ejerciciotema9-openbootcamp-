public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNombre("Adrian");
        cliente.setEdad(32);
        cliente.setTelefono(113323232);
        cliente.setCredito(1000000);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Adrian");
        trabajador.setEdad(32);
        trabajador.setTelefono(113323232);
        trabajador.setSalario(1000000);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        System.out.println("----------------");

        System.out.println("Trabajador: " + trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }

}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }

}