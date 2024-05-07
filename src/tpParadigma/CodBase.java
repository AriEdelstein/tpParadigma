package tpParadigma;
import java.util.ArrayList;

public class CodBase {
	    private int id;
	    private String nombre;
	    private String contraseña;
	    private String contraseñaValida;
	    private String email;

	    public void cargarAutoparte() {
	        // Lógica para cargar una autoparte
	    }

	    public void modificarAutoparte() {
	        // Lógica para modificar una autoparte
	    }

	    public void listarStock() {
	        // Lógica para listar el stock de autopartes
	    }

	    public void darDeBaja() {
	        // Lógica para dar de baja una autoparte
	    }

	    public void registrarPedido() {
	        // Lógica para registrar un pedido
	    }

	    public void registrarVenta() {
	        // Lógica para registrar una venta
	    }

	    public void cancelarPedido() {
	        // Lógica para cancelar un pedido
	    }

	    public void confirmacion() {
	        // Lógica para confirmar una acción
	    }

	    public void reservarProducto() {
	        // Lógica para reservar un producto en un pedido
	    }
	}

	class Autoparte {
	    private int id;
	    private String denominacion;
	    private String descripcion;
	    private String categoria;
	    private String marca;
	    private String vehiculo;
	    private int precio;
	    private int stock;
	    private int stockMin;
	    private String enlace;

	    public void alertaStockMin() {
	        // Lógica para alertar cuando el stock alcanza el mínimo
	    }
	}

	class Cliente {
	    private int id;
	    private String nombre;
	    private String direccion;
	    private String telefono;
	    private String localidad;
	    private String provincia;
	    private String email;
	}

	class Pedido {
	    private int id;
	    private Cliente cliente;
	    private int fecha;
	    private int montoFinal;
	    private ArrayList<Autoparte> productos;
	    private int cantidad;
	    private String estado;

	    public void reservarProducto() {
	        // Lógica para reservar un producto en un pedido
	    }
	}

	class Venta {
	    private int id;
	    private ArrayList<Autoparte> productos;
	    private String medioDePago;
	    private int montoFinal;
	    private int fecha;

	    public void seleccionarMetodoPago() {
	        // Lógica para seleccionar el método de pago
	    }

	    public void calcularTotal() {
	        // Lógica para calcular el monto total de la venta
	    }

	    public void aplicarDescuento() {
	        // Lógica para aplicar el descuento correspondiente
	    }

	    public void aplicarRecargo() {
	        // Lógica para aplicar un recargo en caso de ser necesario
	    }
	}

	class MedioDePago {
	    private int id;
	    private String tipo;
	    private int cuotas;

	    public void calcularDescuento() {
	        // Lógica para calcular el descuento según el medio de pago
	    }

	    public void calcularRecargo() {
	        // Lógica para calcular un recargo según el medio de pago y las cuotas
		    }
}
