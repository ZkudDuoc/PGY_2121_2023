/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc_pgy2131.proyect;

/**
 *
 * @author vicen
 */
public class Tarjeta {
    private int numero;
    private int cvv;
    private int saldo;
    private int lineaCredito;
    private boolean estado;

    public Tarjeta(int numero, int cvv, int saldo, boolean estado) {
    }

    public Tarjeta(int numero, int cvv, int saldo, int lineaCredito, boolean estado) {
        this.numero = numero;
        this.cvv = cvv;
        this.saldo = saldo;
        this.lineaCredito = lineaCredito;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(int lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", cvv=" + cvv + ", saldo=" + saldo + ", lineaCredito=" + lineaCredito + ", estado=" + estado + '}';
    }
    
    public String agregarSaldo(int saldoAgregado){
        if(saldoAgregado>0){
            this.saldo = this.saldo + saldoAgregado;
            return "Saldo Agregado";
        
        }else{
            return "Saldo, no corresponde";
        }
    }
    public String retirarSaldo(int saldoRetirado){
        if((saldo+lineaCredito)>=saldoRetirado){
            if(saldo>saldoRetirado){
                this.saldo =this.saldo - saldoRetirado;
            }else{
                saldoRetirado = saldoRetirado - this.saldo;
                this.saldo = 0;
                this.lineaCredito = this.lineaCredito - saldoRetirado;
                return "Retiro exitoso, ocupo la linea de credito";
            }
        }else{
            return "ERROR, Excede el maximo permitido";
        }
        return "Ha agregado dinero con exito";
    }

}
