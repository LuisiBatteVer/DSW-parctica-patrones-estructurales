package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import adapter.*;
import bridge.*;
import composite.Menu;
import composite.Plato;
import decorator.HD;
import decorator.Plan;
import decorator.PlanBasico;
import facade.Carrito;
import facade.Envio;
import facade.Pago;
import facade.TiendaFacade;
import flyweight.Arbol;
import flyweight.FabricaArboles;
import proxy.Archivo;
import proxy.ArchivoProxy;


public class Main {

    public static void main(String[] args) {
        System.out.println("----Ejercicio 1: ADAPTER -----");
        System.out.println(" ");
        // Creo la impresora PDF "incompatible"
        ImpresoraPDF impresoraPDF = new ImpresoraPDF();
        // Creo el adapter para que la impresora PDF se comporte como una Impresora genérica
        Impresora impresoraPDFAdapter = new ImpresoraPDFAdapter(impresoraPDF);

        // Creo la impresora TXT "incompatible"
        ImpresoraTXT impresoraTXT = new ImpresoraTXT();
        // Creo el adapter para la impresora TXT
        Impresora impresoraTXTAdapter = new ImpresoraTXTAdapter(impresoraTXT);

        // Uso ambas impresoras a través de la misma interfaz
        System.out.println("=== Usando impresora PDF ===");
        impresoraPDFAdapter.imprimir("Contrato Laboral");

        System.out.println("=== Usando impresora TXT ===");
        impresoraTXTAdapter.imprimir("Informe de Ventas");
        System.out.println(" ");
        System.out.println("----ejercicio 2: BRIDGE---");
        System.out.println(" ");
        CanalEnvio email = new Email();
        CanalEnvio sms = new SMS();

        Notificacion alertaEmail = new Alerta(email);
        Notificacion promocionSMS = new Promocion(sms);

        alertaEmail.enviar("Sistema caído");
        promocionSMS.enviar("50% de descuento en productos");
        System.out.println(" ");
        System.out.println("Ejercicio 3: DECORATOR----");
        System.out.println(" ");
        Plan plan = new PlanBasico();
        System.out.println(plan.getNombre() + " $" + plan.getCosto());
        plan = new HD(plan);
        System.out.println(plan.getNombre() + " $" + plan.getCosto());
        System.out.println(" ");
        System.out.println("----Ejercicio 4: FACADE----");
        System.out.println(" ");
        // Crear los subsistemas
        Carrito carrito = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio();

        // Crear el Facade con los subsistemas
        TiendaFacade tienda = new TiendaFacade(carrito, pago, envio);

        // Usar solo el Facade para realizar la compra
        tienda.comprar("Auriculares Bluetooth", 1, "VISA 1234", 100000, "Calle Falsa 123");
        System.out.println(" ");
        System.out.println("----Ejercicio 5: FLYWEIGHT----");
        System.out.println(" ");

        FabricaArboles fabrica = new FabricaArboles();

        // Simular crear 10 árboles (podés subir a 1_000_000 después)
        for (int i = 0; i < 10; i++) {
            String tipo;
            if (i % 3 == 0) tipo = "Pino";
            else if (i % 3 == 1) tipo = "Roble";
            else tipo = "Eucalipto";

            Arbol arbol = fabrica.obtenerArbol(tipo, "Verde", "Textura-" + tipo);

            // Dibujar en posición aleatoria
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            arbol.dibujar(x, y);
        }

        // Mostrar cuántos objetos únicos se crearon
        System.out.println("Cantidad de árboles únicos creados: " + fabrica.obtenerArbol("Pino", "Verde", "Textura-Pino") != null ? 3 : 0);

        System.out.println(" ");
        System.out.println("----ejercicio 6: PROXY----");
        System.out.println(" ");
        Archivo archivo1 = new ArchivoProxy("Notas examen.pdf");
        Archivo archivo2 = new ArchivoProxy("planilla de notas.xls");

        archivo1.abrir("admin");
        archivo2.abrir("maria");
        System.out.println(" ");
        System.out.println("----ejercicio 7: COMPOSITE----");
        System.out.println(" ");
        // Creo platos individuales
        Plato plato1 = new Plato("Ensalada", 150);
        Plato plato2 = new Plato("Sopa", 120);
        Plato plato3 = new Plato("Hamburguesa", 300);
        Plato plato4 = new Plato("Papas Fritas", 100);

        // Creo un submenú
        Menu menuPostres = new Menu("Postres");
        menuPostres.agregar(new Plato("Helado", 90));
        menuPostres.agregar(new Plato("Flan", 80));

        // Creo un menú principal
        Menu menuPrincipal = new Menu("Menú del día");
        menuPrincipal.agregar(plato1);
        menuPrincipal.agregar(plato2);
        menuPrincipal.agregar(plato3);
        menuPrincipal.agregar(plato4);
        menuPrincipal.agregar(menuPostres); // agrego el submenú

        // Muestro todo el menú
        menuPrincipal.mostrar();
    }
}




