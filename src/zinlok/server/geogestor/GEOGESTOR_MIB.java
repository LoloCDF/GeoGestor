package zinlok.server.geogestor;

//
// Generado por mibgen version 5.1 (03/08/07) para compilar GEOGESTOR-MIB en modo metadata est�ndar.
//

// java imports
//
import java.io.Serializable;
import java.util.Hashtable;

// jmx imports
//
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.InstanceAlreadyExistsException;

import com.sun.management.snmp.SnmpStatusException;
// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibNode;
import com.sun.management.snmp.agent.SnmpMibTable;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;

import zinlok.server.snmp.Snmp;

/**
 * La clase es utilizada para representar "GEOGESTOR-MIB".
 * Edite el fichero si quiere modificar el comportamiento de la MIB.
 */
public class GEOGESTOR_MIB extends SnmpMib implements Serializable {
	private Snmp agente = null;
    /**
     * Constructor por defecto. Inicialice el �rbol que representa la MIB.
     */
    public GEOGESTOR_MIB(Snmp agente) {
    	this.agente=agente;
        mibName = "GEOGESTOR_MIB";
    }

    /**
     * Inicializaci�n de la MIB sin registrarla en el MBean server Java DMK.
     */
    public void init() throws IllegalAccessException {
        // Solamente una inicializaci�n de la MIB es autorizada.
        //
        if (isInitialized == true) {
            return ;
        }

        try  {
            populate(null, null);
        } catch(IllegalAccessException x)  {
            throw x;
        } catch(RuntimeException x)  {
            throw x;
        } catch(Exception x)  {
            throw new Error(x.getMessage());
        }

        isInitialized = true;
    }

    /**
     * Inicializaci�n de la MIB con REGISTRO AUTOMATICO en el MBean server Java DMK.
     */
    public ObjectName preRegister(MBeanServer server, ObjectName name)
            throws Exception {
        // Solamente una inicializaci�n de la MIB es autorizada.
        //
        if (isInitialized == true) {
            throw new InstanceAlreadyExistsException();
        }

        // Inicialice la informaci�n referente al MBean server.
        //
        this.server = server;

        populate(server, name);

        isInitialized = true;
        return name;
    }

    /**
     * Inicializaci�n de la MIB sin registrarla en el MBean server Java DMK.
     */
    public void populate(MBeanServer server, ObjectName name) 
        throws Exception {
        // Solamente una inicializaci�n de la MIB es autorizada.
        //
        if (isInitialized == true) {
            return ;
        }

        if (objectserver == null) 
            objectserver = new SnmpStandardObjectServer();

        // Inicializaci�n del grupo "Geogestor_mib".
        // Para suprimir el soporte de este grupo, redefina el m�todo 
        // "createGeogestor_mibMetaNode()" de la factor�a y haga que devuelva el valor "null"
        //
        initGeogestor_mib(server);

        isInitialized = true;
    }


    // ------------------------------------------------------------
    // 
    // Inicializaci�n del grupo "Geogestor_mib".
    // 
    // ------------------------------------------------------------


    /**
     * Inicializaci�n del grupo "Geogestor_mib".
     * 
     * Para suprimir el soporte de este grupo, redefina el m�todo 
     * "createGeogestor_mibMetaNode()" de la factor�a y haga que devuelva el valor "null"
     * 
     * @param server    MBeanServer para este grupo (puede ser nulo)
     * 
     **/
    protected void initGeogestor_mib(MBeanServer server) 
        throws Exception {
        final String oid = getGroupOid("Geogestor_mib", "1.3.6.1.3.1");
        ObjectName objname = null;
        if (server != null) {
            objname = getGroupObjectName("Geogestor_mib", oid, mibName + ":name=Geogestor_mib");
        }
        final Geogestor_mibMeta meta = createGeogestor_mibMetaNode("Geogestor_mib", oid, objname, server);
        if (meta != null) {
            meta.registerTableNodes( this, server );

            // Tenga en cuenta que cuando use la versi�n est�ndar
            // de la metadata, el objeto devuelto debe implementar
            // la interfaz "{0}".
            //
            final Geogestor_mibMBean group = (Geogestor_mibMBean) createGeogestor_mibMBean("Geogestor_mib", oid, objname, server);
            meta.setInstance( group );
            registerGroupNode("Geogestor_mib", oid, objname, meta, group, server);
        }
    }


    /**
     * M�todo de construcci�n para la meta-clase del grupo "Geogestor_mib".
     * 
     * Puede redefinir este m�todo si necesita reemplazarlo
     * la meta-clase generada por defecto por su propia clase modificada.
     * 
     * @param groupName Nombre del grupo ("Geogestor_mib")
     * @param groupOid  OID del grupo
     * @param groupObjname ObjectName de este grupo (puede ser nulo)
     * @param server    MBeanServer para este grupo (puede ser nulo)
     * 
     * @return Una instancia de la meta-clase generada para
     *         el grupo "Geogestor_mib" (Geogestor_mibMeta)
     * 
     **/
    protected Geogestor_mibMeta createGeogestor_mibMetaNode(String groupName,
                String groupOid, ObjectName groupObjname, MBeanServer server)  {
        return new Geogestor_mibMeta(this, objectserver);
    }


    /**
     * M�todo de construcci�n para el MBean representando al grupo "Geogestor_mib".
     * 
     * Puede redefinir este m�todo si necesita reemplazarlo
     * la clase del MBean generada por defecto por su propia clase modificada.
     * 
     * @param groupName Nombre del grupo ("Geogestor_mib")
     * @param groupOid  OID del grupo
     * @param groupObjname ObjectName de este grupo (puede ser nulo)
     * @param server    MBeanServer para este grupo (puede ser nulo)
     * 
     * @return Una instancia de la clase del MBean generada para
     *         el grupo "Geogestor_mib" (Geogestor_mib)
     * 
     * Tenga en cuenta que cuando use la versi�n est�ndar
     * de la metadata, el objeto devuelto debe implementar
     * la interfaz "{0}".
     * @throws SnmpStatusException 
     **/
    protected Object createGeogestor_mibMBean(String groupName,
                String groupOid,  ObjectName groupObjname, MBeanServer server) throws SnmpStatusException  {

        // Tenga en cuenta que cuando use la versi�n est�ndar
        // de la metadata, el objeto devuelto debe implementar
        // la interfaz "{0}".
        //
        if (server != null) 
            return new Geogestor_mib(this,server,this.agente);
        else 
            return new Geogestor_mib(this,this.agente);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el m�todo "registerTableMeta" definido en "SnmpMib".
    // Mirar la API Javadoc de "SnmpMib" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public void registerTableMeta( String name, SnmpMibTable meta) {
        if (metadatas == null) return;
        if (name == null) return;
        metadatas.put(name,meta);
    }


    // ------------------------------------------------------------
    // 
    // Implementa el m�todo "getRegisteredTableMeta" definido en "SnmpMib".
    // Mirar la API Javadoc de "SnmpMib" para obtener un mayor detalle.
    // 
    // ------------------------------------------------------------

    public SnmpMibTable getRegisteredTableMeta( String name ) {
        if (metadatas == null) return null;
        if (name == null) return null;
        return (SnmpMibTable) metadatas.get(name);
    }

    public SnmpStandardObjectServer getStandardObjectServer() {
        if (objectserver == null) 
            objectserver = new SnmpStandardObjectServer();
        return objectserver;
    }

    private boolean isInitialized = false;

    protected SnmpStandardObjectServer objectserver;

    protected final Hashtable metadatas = new Hashtable();
}
