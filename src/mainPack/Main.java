package mainPack;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class Main {


	public static void generateMenu() {
		System.out.println("-------------------");
		System.out.println("1.- Introducir Producto");
		System.out.println("2.- Introducir Cliente");
		System.out.println("3.- Introducir Pedido");
		System.out.println("4.- Guardar en XML");
		System.out.println("9.- Leer datos de XML");
		System.out.println("0.- Quit");
	}
		
	public static Producto showSubmenuProducto() throws IOException {
		
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String codigo = null , stock = null, pasillo = null, estanteria = null, estante = null,pendiente = null, nombre = null, descripcion = null;

        System.out.println("Código:");
        codigo = in.readLine();
		System.out.println("Nombre:");
		nombre = in.readLine();
		System.out.println("Descripción:");
		descripcion = in.readLine();
		System.out.println("Unidades en stock:");
        stock = in.readLine();
		System.out.println("Localización:");
		System.out.println("Pasillo:");
        pasillo = in.readLine();
        System.out.println("Estantería:");
        estanteria = in.readLine();
        System.out.println("Estante:");
        estante = in.readLine();
        System.out.println("Pendientes de entrada al almacén:");
        pendiente = in.readLine();
        Localizacion localizacion = new Localizacion(pasillo, estanteria, estante);
		Producto producto = new Producto(nombre, descripcion, codigo, stock, localizacion, pendiente);
		return producto;
	}
	
	public static Cliente showSubmenuCliente() throws IOException {
		
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre = null, apellidos = null, email = null, calle = null, poblacion = null, pais = null, telf = null, numcalle = null, codpostal = null;

		System.out.println("Nombre:");
		nombre = in.readLine();
		System.out.println("Apellidos:");
		apellidos = in.readLine();
		System.out.println("Email:");
		email = in.readLine();
		System.out.println("Telf Contacto:");
        telf = in.readLine();
		System.out.println("Dirección:");
		System.out.println("Calle:");
		calle = in.readLine();
		System.out.println("Número:");
        numcalle = in.readLine();
        System.out.println("Código postal:");
        codpostal = in.readLine();
		System.out.println("Población:");
		poblacion = in.readLine();
		System.out.println("País:");
		pais = in.readLine();
        Direccion direccion = new Direccion(calle, numcalle, poblacion, pais, codpostal);
		Cliente cliente = new Cliente(nombre, apellidos, email, telf, direccion);
		return cliente;
	}
	
	public static Pedido showSubmenuPedidos() throws IOException {
		
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String producto = null, calle = null, poblacion = null, pais = null, destinatario = null, cantidad = null, fechaestimada = null, numcalle = null, codpostal = null;

		System.out.println("Nombre producto:");
		producto = in.readLine();
		System.out.println("Cantidad:");
        cantidad = in.readLine();        
		System.out.println("Dirección:");
		System.out.println("Calle:");
		calle = in.readLine();
		System.out.println("Número:");
        numcalle = in.readLine();
        System.out.println("Código postal:");
        codpostal = in.readLine();
		System.out.println("Población:");
		poblacion = in.readLine();
		System.out.println("País:");
		pais = in.readLine();
		System.out.println("Destinatario:");
		poblacion = in.readLine();
		System.out.println("Fecha de entrega estimada:");
        fechaestimada = in.readLine();
        Direccion direccion = new Direccion(calle, numcalle, poblacion, pais, codpostal);
		Pedido pedido = new Pedido(producto, destinatario, cantidad, fechaestimada, direccion);
		return pedido;
	}
	
	private static void jaxbObjectToXML(Almacen almacen) 
    {
        try
        {

            JAXBContext jaxbContext = JAXBContext.newInstance(Almacen.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", "\n<!DOCTYPE Example SYSTEM  \"example.dtd\">");
 
            File file = new File("almacen.xml");
             
            jaxbMarshaller.marshal(almacen, file);
            
 
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Almacen almacen = new Almacen();
		List<Cliente> Clientes = new ArrayList<Cliente>();
		List<Producto> Productos = new ArrayList<Producto>();
		List<Pedido> Pedidos = new ArrayList<Pedido>();
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
			case 4:
				almacen.setProducto(Productos);
				almacen.setCliente(Clientes);
				almacen.setPedido(Pedidos);

				jaxbObjectToXML(almacen);

				break;
			case 5:
				
				System.out.println(Productos.isEmpty());
				System.out.println(Clientes.isEmpty());
				System.out.println(Pedidos.isEmpty());
				
				break;
			case 9:
				
//				File file = new File("xml.xml");
//				JAXBContext jaxbContext = JAXBContext.newInstance(Clase.class);  
//		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
//		        Clase clase= (Clase) jaxbUnmarshaller.unmarshal(file);  
//		        List <Alumno> list = clase.getAlumno();
				
				File xmlFile = new File("almacen.xml");
				 
				JAXBContext jaxbContext;
				try
				{
				    jaxbContext = JAXBContext.newInstance(Almacen.class);              
				 
				    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				 
				    almacen = (Almacen) jaxbUnmarshaller.unmarshal(xmlFile);
				    Clientes = almacen.getCliente();
				    Pedidos = almacen.getPedido();
				    Productos = almacen.getProducto();
				    
				    
				     
				    System.out.println(almacen);
				}
				catch (JAXBException e) 
				{
				    e.printStackTrace();
				}

				break;
			case 0:
				break;
			}
			
		}

	}
	
}


