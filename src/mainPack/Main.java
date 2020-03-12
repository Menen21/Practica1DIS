package mainPack;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {


	public static void generateMenu() {
		System.out.println("-------------------");
		System.out.println("1.- Introducir Producto");
		System.out.println("2.- Introducir Cliente");
		System.out.println("3.- Introducir Pedido");
		System.out.println("4.- Guardar en XML");
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
		Producto producto = new Producto(codigo, stock, pasillo, estanteria, estante, pendiente, nombre, descripcion);
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
		Cliente cliente = new Cliente(nombre, apellidos, email, calle, poblacion, pais, telf, numcalle, codpostal);
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
		Pedido pedido = new Pedido(producto, cantidad, calle, numcalle, codpostal, poblacion, pais, destinatario, fechaestimada);
		return pedido;
	}
	
	private static void jaxbObjectToXML(Almacen almacen) 
    {
        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(Almacen.class);
             
            //Create Marshaler
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
            //Print XML String to Console
            StringWriter sw = new StringWriter();
             
            //Write XML to StringWriter
            jaxbMarshaller.marshal(almacen, sw);
             
            //Verify XML Content
            String xmlContent = sw.toString();
            System.out.println( xmlContent );
 
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Almacen almacen = new Almacen();
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
			case 4:
				almacen.setProducto(Productos);
				almacen.setCliente(Clientes);
				almacen.setPedido(Pedidos);

				jaxbObjectToXML(almacen);

				break;
			case 0:
				break;
			}
			
		}

	}
	
}


