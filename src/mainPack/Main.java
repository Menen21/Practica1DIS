package mainPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {


	public static void generateMenu() {
		System.out.println("-------------------");
		System.out.println("1.- Introducir Producto");
		System.out.println("2.- Introducir Cliente");
		System.out.println("3.- Introducir Pedido");
		System.out.println("0.- Quit");
	}
	
	public static void writeToFile(String xml, String fileName) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    try {
			writer.write(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
	
	public static Producto showSubmenuProducto() throws IOException {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int codigo = 0 , stock = 0, pasillo = 0, estanteria = 0, estante = 0,pendiente = 0;
		String nombre = null, descripcion = null;
		boolean success = false;
		while (!success) {
            try {
            	System.out.println("Código:");
        		codigo = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		System.out.println("Nombre:");
		nombre = in.readLine();
		System.out.println("Descripción:");
		descripcion = in.readLine();
		success = false;
		while (!success) {
            try {
        		System.out.println("Unidades en stock:");
        		stock = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		System.out.println("Localización:");
		success = false;
		while (!success) {
            try {
        		System.out.println("Pasillo:");
        		pasillo = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		success = false;
		while (!success) {
            try {
        		System.out.println("Estantería:");
        		estanteria = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		success = false;
		while (!success) {
            try {
        		System.out.println("Estante:");
        		estante = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		success = false;
		while (!success) {
            try {
        		System.out.println("Pendientes de entrada al almacén:");
        		pendiente = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		Producto producto = new Producto(codigo, stock, pasillo, estanteria, estante, pendiente, nombre, descripcion);
		return producto;
	}
	
	public static Cliente showSubmenuCliente() throws IOException {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre = null, apellidos = null, email = null, calle = null, poblacion = null, pais = null;
		int telf = 0, numcalle = 0, codpostal = 0;
		boolean success = false;
		System.out.println("Nombre:");
		nombre = in.readLine();
		System.out.println("Apellidos:");
		apellidos = in.readLine();
		System.out.println("Email:");
		email = in.readLine();
		while (!success) {
            try {
        		System.out.println("Telf Contacto:");
        		telf = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		System.out.println("Dirección:");
		System.out.println("Calle:");
		calle = in.readLine();
		success = false;
		while (!success) {
            try {
        		System.out.println("Número:");
        		numcalle = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		success = false;
		while (!success) {
            try {
        		System.out.println("Código postal:");
        		codpostal = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		System.out.println("Población:");
		poblacion = in.readLine();
		System.out.println("País:");
		pais = in.readLine();
		Cliente cliente = new Cliente(nombre, apellidos, email, calle, poblacion, pais, telf, numcalle, codpostal);
		return cliente;
	}
	
	public static Pedido showSubmenuPedidos() throws IOException {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Producto producto = null;
		Cliente destinatario = null;
		String fecha = null;
		int cantidad = 0;
		boolean success = false;
		while (!success) {
            try {
        		System.out.println("Número:");
        		cantidad = Integer.parseInt(in.readLine());
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Introducir un nº entero por favor");
            }
        }
		Pedido pedido = new Pedido(producto, destinatario, cantidad, fecha);
		return pedido;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
		ArrayList<Producto> Productos = new ArrayList<Producto>();
		ArrayList<Pedido> Pedidos = new ArrayList<Pedido>();
		int menu = -1;
		
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (menu != 0) {
			generateMenu();
			menu = Integer.parseInt(in.readLine());
			
			switch (menu) {
			case 1:
				Producto producto_leido = showSubmenuProducto();
				Productos.add(producto_leido);
				break;
			case 2:
				Cliente cliente_leido = showSubmenuCliente();
				Clientes.add(cliente_leido);
				break;
			case 3:
				Pedido pedido_leido = showSubmenuPedidos();
				Pedidos.add(pedido_leido);
				break;
			case 0:
				break;
			}}
	}
	}


