
//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB en modo metadata estándar.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpCounter;
import com.sun.management.snmp.SnmpCounter64;
import com.sun.management.snmp.SnmpGauge;
import com.sun.management.snmp.SnmpInt;
import com.sun.management.snmp.SnmpUnsignedInt;
import com.sun.management.snmp.SnmpIpAddress;
import com.sun.management.snmp.SnmpTimeticks;
import com.sun.management.snmp.SnmpOpaque;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpStringFixed;
import com.sun.management.snmp.SnmpOid;
import com.sun.management.snmp.SnmpNull;
import com.sun.management.snmp.SnmpValue;
import com.sun.management.snmp.SnmpVarBind;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibGroup;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;
import com.sun.management.snmp.agent.SnmpStandardMetaServer;
import com.sun.management.snmp.agent.SnmpMibSubRequest;
import com.sun.management.snmp.agent.SnmpMibTable;
import com.sun.management.snmp.EnumRowStatus;
import com.sun.management.snmp.SnmpDefinitions;

/**
 * La clase es utlizada para representar la metadata asociada al grupo "Geogestor_mib".
 * El grupo ha sido definido con el siguiente OID: 1.3.6.1.3.1.
 */
public class Geogestor_mibMeta extends SnmpMibGroup
     implements Serializable, SnmpStandardMetaServer {

    /**
     * Constructor para la metadata asociada a "Geogestor_mib".
     */
    public Geogestor_mibMeta(SnmpMib myMib, SnmpStandardObjectServer objserv) {
        objectserver = objserv;
        try {
            registerObject(2);
            registerObject(1);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * Devuelve el valor de una variable escalar
     */
    public SnmpValue get(long var, Object data)
        throws SnmpStatusException {
        switch((int)var) {
            case 2:
                return new SnmpInt(node.getNumClientes());

            case 1: {
                throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
                }

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Actualiza el valor de una variable escalar
     */
    public SnmpValue set(SnmpValue x, long var, Object data)
        throws SnmpStatusException {
        switch((int)var) {
            case 2:
                if (x instanceof SnmpInt) {
                    node.setNumClientes(((SnmpInt)x).toInteger());
                    return new SnmpInt(node.getNumClientes());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 1: {
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
                }

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
    }

    /**
     * Comprueba el valor de una variable escalar
     */
    public void check(SnmpValue x, long var, Object data)
        throws SnmpStatusException {
        switch((int) var) {
            case 2:
                if (x instanceof SnmpInt) {
                    node.checkNumClientes(((SnmpInt)x).toInteger());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 1: {
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
                }

            default:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
        }
    }

    /**
     * Permite asociar la metadata a un objeto específico.
     */
    protected void setInstance(Geogestor_mibMBean var) {
        node = var;
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "get" definido en "SnmpMibGroup".
    // Mirar la API Javadoc de "SnmpMibGroup" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void get(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.get(this,req,depth);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "set" definido en "SnmpMibGroup".
    // Mirar la API Javadoc de "SnmpMibGroup" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void set(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.set(this,req,depth);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "check" definido en "SnmpMibGroup".
    // Mirar la API Javadoc de "SnmpMibGroup" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void check(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.check(this,req,depth);
    }

    /**
     * Devuelve true si "arc" identifica a un objeto escalar.
     */
    public boolean isVariable(long arc) {

        switch((int)arc) {
            case 2:
                return true;
            default:
                break;
        }
        return false;
    }

    /**
     * Returns true if "arc" identifies a readable scalar object.
     */
    public boolean isReadable(long arc) {

        switch((int)arc) {
            case 2:
                return true;
            default:
                break;
        }
        return false;
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "skipVariable" definido en "SnmpMibGroup".
    // Mirar la API Javadoc de "SnmpMibGroup" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public boolean  skipVariable(long var, Object data, int pduVersion) {
        return false;
    }

    /**
     * Devuelve el nombre del atributo correspondiente a la variable SNMP identificada por "id".
     */
    public String getAttributeName(long id)
        throws SnmpStatusException {
        switch((int)id) {
            case 2:
                return "NumClientes";

            case 1: {
                throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
                }

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Devuelve true si "arc" identifica a una tabla.
     */
    public boolean isTable(long arc) {

        switch((int)arc) {
            case 1:
                return true;
            default:
                break;
        }
        return false;
    }

    /**
     * Devuelve la tabla identificada por "arc".
     */
    public SnmpMibTable getTable(long arc) {

        switch((int)arc) {
            case 1:
                return tableTabla;
        default:
            break;
        }
        return null;
    }

    /**
     * Registra los objetos SnmpMibTable perteneciendo al grupo en el objeto Meta correspondiente.
     */
    public void registerTableNodes(SnmpMib mib, MBeanServer server) {
        tableTabla = createTablaMetaNode("Tabla", "Geogestor_mib", mib, server);
        if ( tableTabla != null)  {
            tableTabla.registerEntryNode(mib,server);
            mib.registerTableMeta("Tabla", tableTabla);
        }

    }


    /**
     * Método de construcción para la meta-clase de la tabla "Tabla".
     * 
     * Puede redefinir este método si necesita reemplazarlo
     * la meta-clase generada por defecto por su propia clase modificada.
     * 
     * @param tableName Nombre de la tabla SNMP ("Tabla")
     * @param groupName Nombre del grupo al que pertenece esta tabla ("Geogestor_mib")
     * @param mib El objeto SnmpMib en el que la tabla está registrada.
     * @param server El MBeanServer para las entradas de esta tabla (puede ser nulo)
     * 
     * @return Una instancia de la meta-clase generada para
     *         el grupo "Tabla" (TablaMeta)
     * 
     **/
    protected TablaMeta createTablaMetaNode(String tableName, String groupName, SnmpMib mib, MBeanServer server)  {
        return new TablaMeta(mib, objectserver);
    }

    protected Geogestor_mibMBean node;
    protected SnmpStandardObjectServer objectserver = null;
    protected TablaMeta tableTabla = null;
}
