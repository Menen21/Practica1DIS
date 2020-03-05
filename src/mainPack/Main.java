package mainPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
		int codigo , stock, pasillo, estanteria, estante,pendiente;
		String nombre = null, descripcion = null;
		System.out.println("C�digo:");
		codigo = Integer.parseInt(in.readLine());
		System.out.println("Nombre:");
		nombre = in.readLine();
		System.out.println("Descripci�n:");
		descripcion = in.readLine();
		System.out.println("Unidades en stock:");
		stock = Integer.parseInt(in.readLine());
		System.out.println("Localizaci�n:");
		System.out.println("Pasillo:");
		pasillo = Integer.parseInt(in.readLine());
		System.out.println("Estanter�a:");
		estanteria = Integer.parseInt(in.readLine());
		System.out.println("Estante:");
		estante = Integer.parseInt(in.readLine());
		System.out.println("Pendientes de entrada al almac�n:");
		pendiente = Integer.parseInt(in.readLine());
		Producto producto = new Producto(codigo, stock, pasillo, estanteria, estante, pendiente, nombre, descripcion);
		return producto;
	}
	
	public static Cliente showSubmenuCliente() throws IOException {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre = null, apellidos = null, email = null, calle = null, poblacion = null, pais = null;
		int telf, numcalle, codpostal;
		System.out.println("Nombre:");
		nombre = in.readLine();
		System.out.println("Apellidos:");
		apellidos = in.readLine();
		System.out.println("Email:");
		email = in.readLine();
		System.out.println("Telf Contacto:");
		telf = Integer.parseInt(in.readLine());
		System.out.println("Direcci�n:");
		System.out.println("Calle:");
		calle = in.readLine();
		System.out.println("N�mero:");
		numcalle = Integer.parseInt(in.readLine());
		System.out.println("C�digo postal:");
		codpostal = Integer.parseInt(in.readLine());
		System.out.println("Poblaci�n:");
		poblacion = in.readLine();
		System.out.println("Pa�s:");
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


