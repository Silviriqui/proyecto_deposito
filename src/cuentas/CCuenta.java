package cuentas;

/**
 * Clase que representa una cuenta con
 * operaciones básicas.
 * Se puede consultar el saldo, ingresar y retirar dinero
 * @author srami
 * @version 1.0
 */
public class CCuenta {
    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    /**
     * Numero de cuenta
     */
    private String cuenta;
    /**
     * Saldo disponible
     */
    private double saldo;
    /**
     * Tipo de interes aplicado.
     */
    private double tipoInteres;

    /**
     * Constructor de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     *Comnstructor de parametros para inicar cuenta.
     *
     * @param nombre Nombre titular de la cuenta
     * @param cuenta Número de cuenta.
     * @param saldo Saldo disponible en la cuenta.
     * @param tipo Tipo de interes
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipo) {

        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipo;

        /**
         * Método para obtener saldo actual
         *
         * @return Saldo disponible
         */
    }
    public double estado() {
        return saldo;
    }
    /**
     * Ingresar una cantidad de dinero
     *
     * @param cantidad cuanto se va a ingresar
     * @throws Exception Por si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Cantidad de dinero a retirar
     *
     * @param cantidad cuanto se va a ingresar
     * @throws Exception Por si la cantidad es negativa.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }

    // Getters y Setters para encapsular los atributos

    /**
     * Obtiene
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define
     * @param nombre Nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene numero de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * define nº de cuenta
     * @param cuenta nº de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible
     * @return saldo nuevo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene tipo de interes
     * @return tipo de interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interes
     * @param tipoInteres tipo de interes
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}


