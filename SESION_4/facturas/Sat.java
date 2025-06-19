package facturas;

import java.util.concurrent.CompletableFuture;

public class Sat {
    
    public static CompletableFuture<Factura> crearFactura(Ticket ticket) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Generando factura...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return new Factura(ticket.getCodigo(), ticket.getTotal());
        });
    }

    public static CompletableFuture<FacturaFirmada> firmarFactura(Factura factura) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Firmando factura digitalmente...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return new FacturaFirmada(factura.getCodigo(), factura.getTotal(), "SELLO-SAT-DIGITAL");
        });
    }
}
