package co.edu.uniquindio.devplus;

public class MainDevPlus {

    private static Empresa miEmpresa;

    public static void main(String[] args) {

        miEmpresa = new Empresa("DevPlus", "900123456-1", "Calle 123", "3001234567", "www.devplus.com");

        int opcion = 0;
        do {
            try {
                String input = JOptionPane.showInputDialog("Menú Principal DevPlus\n" +
                        "Seleccione una opción:\n" +
                        "1. Registrar nuevo cliente\n" +
                        "2. Buscar cliente por teléfono\n" +
                        "3. Verificar si un número es perfecto\n" +
                        "0. Salir del sistema");

                if (input == null) break;
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1:
                        solicitarInformacionCliente();
                        break;
                    case 2:
                        solicitarBusquedaCliente();
                        break;
                    case 3:
                        solicitarVerificacionNumero();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "El programa finalizó");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no es válida");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un valor numérico válido.");
                opcion = -1; // Reinicia el ciclo si hay error de tipeo
            }
        } while (opcion != 0);
    }

    private static void solicitarInformacionCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese la razón social o nombre del cliente:");
        String nit = JOptionPane.showInputDialog("Ingrese el NIT o documento:");
        long telefono = Long.parseLong(JOptionPane.showInputDialog("Ingrese el número de teléfono:"));
        String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico:");
        String pais = JOptionPane.showInputDialog("Ingrese el país de procedencia:");

        Cliente nuevoCliente = new Cliente(nombre, nit, telefono, correo, pais);
        boolean resultado = miEmpresa.registrarCliente(nuevoCliente);

        if (resultado) {
            JOptionPane.showMessageDialog(null, "Registro exitoso. Cliente agregado.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar. Capacidad máxima alcanzada.");
        }
    }

    private static void solicitarBusquedaCliente() {
        long telefonoBusqueda = Long.parseLong(JOptionPane.showInputDialog("Ingrese el teléfono del cliente que desea buscar:"));

        Cliente clienteEncontrado = miEmpresa.buscarClientePorTelefono(telefonoBusqueda);

        if (clienteEncontrado != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado:\n\n" +
                    "Nombre: " + clienteEncontrado.getNombreRazonSocial() + "\n" +
                    "NIT: " + clienteEncontrado.getDocumentoNit() + "\n" +
                    "Correo: " + clienteEncontrado.getCorreo() + "\n" +
                    "País: " + clienteEncontrado.getPaisProcedencia());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con ese número de teléfono.");
        }
    }

    private static void solicitarVerificacionNumero() {
        long numero = Long.parseLong(JOptionPane.showInputDialog("Ingrese el número a verificar:"));

        boolean esPerfecto = miEmpresa.esNumeroPerfecto(numero);

        if (esPerfecto) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " SÍ es un número perfecto.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " NO es un número perfecto.");
        }
    }
}