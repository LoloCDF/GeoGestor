
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
import com.sun.management.snmp.agent.SnmpMibNode;
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibEntry;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;
import com.sun.management.snmp.agent.SnmpStandardMetaServer;
import com.sun.management.snmp.agent.SnmpMibSubRequest;
import com.sun.management.snmp.agent.SnmpMibTable;
import com.sun.management.snmp.EnumRowStatus;
import com.sun.management.snmp.SnmpDefinitions;

/**
 * La clase es utlizada para representar la metadata asociada al grupo "TablaEntry".
 * El grupo ha sido definido con el siguiente OID: 1.3.6.1.3.1.1.1.
 */
public class TablaEntryMeta extends SnmpMibEntry
     implements Serializable, SnmpStandardMetaServer {

    /**
     * Constructor para la metadata asociada a "TablaEntry".
     */
    public TablaEntryMeta(SnmpMib myMib, SnmpStandardObjectServer objserv) {
        objectserver = objserv;
        varList = new int[6];
        varList[0] = 6;
        varList[1] = 5;
        varList[2] = 4;
        varList[3] = 3;
        varList[4] = 2;
        varList[5] = 1;
        SnmpMibNode.sort(varList);
    }

    /**
     * Devuelve el valor de una variable escalar
     */
    public SnmpValue get(long var, Object data)
        throws SnmpStatusException {
        switch((int)var) {
            case 6:
                return new SnmpString(node.getCiudad());

            case 5:
                return new SnmpString(node.getLocalizacion());

            case 4:
                return new SnmpString(node.getUrl());

            case 3:
                return new SnmpInt(node.getNconexiones());

            case 2:
                return new SnmpIpAddress(node.getIpAddr());

            case 1:
                return new SnmpInt(node.getIpIndex());

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
            case 6:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 5:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 4:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 3:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 2:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 1:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

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
            case 6:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 5:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 4:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 3:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 2:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 1:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            default:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
        }
    }

    /**
     * Permite asociar la metadata a un objeto específico.
     */
    protected void setInstance(TablaEntryMBean var) {
        node = var;
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "get" definido en "SnmpMibEntry".
    // Mirar la API Javadoc de "SnmpMibEntry" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void get(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.get(this,req,depth);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "set" definido en "SnmpMibEntry".
    // Mirar la API Javadoc de "SnmpMibEntry" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void set(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.set(this,req,depth);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "check" definido en "SnmpMibEntry".
    // Mirar la API Javadoc de "SnmpMibEntry" para obtener un mayor detalle.
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
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
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
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                return true;
            default:
                break;
        }
        return false;
    }


    // ------------------------------------------------------------
    // 
    // Implementa el método "skipVariable" definido en "SnmpMibEntry".
    // Mirar la API Javadoc de "SnmpMibEntry" para obtener un mayor detalle.
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
            case 6:
                return "Ciudad";

            case 5:
                return "Localizacion";

            case 4:
                return "Url";

            case 3:
                return "Nconexiones";

            case 2:
                return "IpAddr";

            case 1:
                return "IpIndex";

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    protected TablaEntryMBean node;
    protected SnmpStandardObjectServer objectserver = null;
}
