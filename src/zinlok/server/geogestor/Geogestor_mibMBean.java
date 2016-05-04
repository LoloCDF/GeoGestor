package zinlok.server.geogestor;

//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB en modo metadata est�ndar.
//


// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

/**
 * La interfaz es utilizada para representar la interfaz de administraci�n remota del MBean "Geogestor_mib".
 */
public interface Geogestor_mibMBean {

    /**
     * Getter para la variable "NumClientes".
     */
    public Integer getNumClientes() throws SnmpStatusException;

    /**
     * Setter para la variable "NumClientes".
     */
    public void setNumClientes(Integer x) throws SnmpStatusException;

    /**
     * Controlador para la variable "NumClientes".
     */
    public void checkNumClientes(Integer x) throws SnmpStatusException;

    /**
     * Acceso a la variable "Tabla".
     */
    public TableTabla accessTabla() throws SnmpStatusException;

}
