/**
 * Clase que representa una cuenta bancaria básica.
 * Contiene información sobre el titular, el número de cuenta, el saldo y el tipo de interés.
 * Permite realizar operaciones básicas como consultar el estado, ingresar y retirar dinero.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta bancaria. */
    private String nombre;
    
    /** Número identificador de la cuenta bancaria. */
    private String cuenta;
    
    /** Saldo actual disponible en la cuenta. */
    private double saldo;
    
    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInterés;

    /**
     * Obtiene el nombre del titular de la cuenta.
     * * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * * @param nombre El nombre a asignar al titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * * @return El número de la cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * * @param cuenta El número de cuenta a asignar.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * * @return El saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * * @param saldo El nuevo saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * * @return El tipo de interés actual.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * * @param tipoInterés El nuevo tipo de interés a aplicar.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor por defecto.
     * Crea un objeto CCuenta vacío, sin inicializar sus atributos.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     * Inicializa una cuenta bancaria con los datos proporcionados.
     * * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de la cuenta bancaria.
     * @param sal  Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        // tipoInterés = tipo; // Sugerencia: Te faltaba asignar esta variable en tu código original
    }

    /**
     * Devuelve el estado actual de la cuenta, que corresponde a su saldo.
     * * @return El saldo disponible en la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * Aumenta el saldo actual con la cantidad indicada.
     * * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * Disminuye el saldo actual con la cantidad indicada.
     * * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad a retirar es negativa o igual a cero.
     * @throws Exception Si la cantidad a retirar es superior al saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception ("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}