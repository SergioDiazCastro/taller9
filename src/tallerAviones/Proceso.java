package tallerAviones;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Proceso {
	    private static ArrayList<Avion> listaAviones = new ArrayList<>();
	    
	    public void iniciar() {
	        int opcion;
	        do {
	            opcion = mostrarMenu();
	            switch (opcion) {
	                case 1:
	                    crearAvion();
	                    break;
	                case 2:
	                    consultarAvionIndividual();
	                    break;
	                case 3:
	                    consultarListaAviones();
	                    break;
	                case 4:
	                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida");
	            }
	        } while (opcion != 4);
	    }
	

	    private static int mostrarMenu() {
	        String menu = "Menú:\n" +
	                      "1. Crear avión\n" +
	                      "2. Consultar avión individual\n" +
	                      "3. Consultar lista de aviones\n" +
	                      "4. Salir\n" +
	                      "Ingrese el número de la opción deseada:";
	        return Integer.parseInt(JOptionPane.showInputDialog(null, menu));
	    }

	    private static void crearAvion() {
	        String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante del avión:");
	        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del avión:");
	        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del avión:"));
	        int capacidadPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de pasajeros del avión:"));
	        double velocidadMaxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad máxima del avión:"));

	        Avion nuevoAvion = new Avion(fabricante, modelo, anio, capacidadPasajeros, velocidadMaxima);
	        listaAviones.add(nuevoAvion);
	        JOptionPane.showMessageDialog(null, "Avión creado exitosamente.");
	    }

	    private static void consultarAvionIndividual() {
	        if (listaAviones.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No hay aviones registrados.");
	            return;
	        }

	        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice del avión a consultar (0-" + (listaAviones.size() - 1) + "):"));
	        if (indice < 0 || indice >= listaAviones.size()) {
	            JOptionPane.showMessageDialog(null, "Índice inválido.");
	            return;
	        }

	        Avion avionConsultado = listaAviones.get(indice);
	        JOptionPane.showMessageDialog(null, avionConsultado.obtenerInformacion(), "Información del avión", JOptionPane.INFORMATION_MESSAGE);
	    }

	    private static void consultarListaAviones() {
	        if (listaAviones.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No hay aviones registrados.");
	            return;
	        }

	    
	        String lista="Lista de aviones registrados:\n";
	        for (int i = 0; i < listaAviones.size(); i++) {
	            Avion avion = listaAviones.get(i);
	            lista+="\nAvión "+i+":\n"+
	            avion.obtenerInformacion()+"\n";
	        }

	        JOptionPane.showMessageDialog(null, lista.toString());
	    }
	
	}

