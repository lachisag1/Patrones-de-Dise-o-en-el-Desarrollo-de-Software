/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioAdapter1;

/**
 *
 * @author labesp
 */
public class PagoAdapter implements Pago{
    private PagoEuro pagoEuro;
    private PagoPesos pagoPesos;
    private PagoYen pagoYenes;
    private PagoReal pagoReales;
    private PagoLibra pagoLibras;

    public PagoAdapter(PagoEuro pagoEuro) {
        this.pagoEuro = pagoEuro;
    }

    public PagoAdapter(PagoPesos pagoPesos) {
        this.pagoPesos = pagoPesos;
    }

    public PagoAdapter(PagoYen pagoYenes) {
        this.pagoYenes = pagoYenes;
    }

    public PagoAdapter(PagoReal pagoReales) {
        this.pagoReales = pagoReales;
    }

    public PagoAdapter(PagoLibra pagoLibras) {
        this.pagoLibras = pagoLibras;
    }
    
    @Override
    public void pagar(double monto, int opcion) {
        switch(opcion){
            case 1:
                double euros = monto * 0.84;
                pagoEuro.pagarenEuros(euros); break;
            case 2:
                double pesos = monto * 17.23;
                pagoPesos.pagarPesos(pesos); break;
            case 3:
                double yenes = monto * 153.14;
                pagoYenes.pagarenYen(yenes); break;
            case 4:
                double reales = monto * 5.19;
                pagoReales.pagarenReal(reales); break;
            case 5:
                double libra = monto * 0.72;
                pagoLibras.pagarenLibra(libra);
        }
    }
}
