package clase02_ProyBancario;

public class Banco {

    private int numeroDeClientes;
    private Cliente[] clientes;

    //Genero constructor
    public Banco() {
        clientes = new Cliente[20];
        numeroDeClientes = 0;
    }

    //Metodos
    public void agregarClientes(String n, String a){
        clientes[numeroDeClientes] = new Cliente(n,a);
        numeroDeClientes++;
    }

    public int getNumClientes() {
        return numeroDeClientes;
    }

    public Cliente getClientes(int i) {
        return clientes[i];
    }
}
