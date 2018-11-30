//package proyectoArcade.BD;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class BDScore {
//	
//private static Exception lastError = null;  // Información de último error SQL ocurrido
//	
//	/** Inicializa una BD SQLITE y devuelve una conexión con ella
//	 * @param nombreBD	Nombre de fichero de la base de datos
//	 * @return	Conexión con la base de datos indicada. Si hay algún error, se devuelve null
//	 */
//	public static Connection initBD( String nombreBD ) {
//		try {
//		    Class.forName("org.sqlite.JDBC");
//		    Connection con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD );
////		    Statement st = con.createStatement();      // (1) Solo para foreign keys
////		    st.execute( "PRAGMA foreign_keys = ON" );  // (1)
////		    st.close();                                // (1)
//			log( Level.INFO, "Conectada base de datos " + nombreBD, null );
//		    return con;
//		} catch (ClassNotFoundException | SQLException e) {
//			lastError = e;
//			log( Level.SEVERE, "Error en conexión de base de datos " + nombreBD, e );
//			e.printStackTrace();
//			return null;
//		}
//	}
//	
//	public static void cerrarBD( Connection con, Statement st ) {
//		try {
//			if (st!=null) st.close();
//			if (con!=null) con.close();
//			log( Level.INFO, "Cierre de base de datos", null );
//		} catch (SQLException e) {
//			lastError = e;
//			log( Level.SEVERE, "Error en cierre de base de datos", e );
//			e.printStackTrace();
//		}
//	}
//	
//	public static boolean insertPuntos(int VezJugada, String NomJugador, String Juego, int Puntos) {
//		String sentSQL = "";
//		try {
//			sentSQL = "insert into HighScore values('" + VezJugada + "', " + secu(NomJugador) + "', " + "'" + secu(Juego) + "', " + Puntos + ")";
//			int val = st.executeUpdate( sentSQL );
//			log( Level.INFO, "BD fila a�adida " + val + " fila\t" + sentSQL, null );
//			if (val!=1) {  // Se tiene que a�adir 1 - error si no
//				log( Level.SEVERE, "Error en insert de BD\t" + sentSQL, null );
//				return false;  
//			}
//			return true;
//		} catch (SQLException e) {
//			log( Level.SEVERE, "Error en BD\t" + sentSQL, e );
//			lastError = e;
//			e.printStackTrace();
//			return false;
//		}
//	}
//	
//	private static String secu( String string ) {
//		StringBuffer ret = new StringBuffer();
//		for (char c : string.toCharArray()) {
//			if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ��������������.,:;-_(){}[]-+*=<>'\"�?�!&%$@#/\\0123456789".indexOf(c)>=0) ret.append(c);
//		}
//		return ret.toString();
//	}
//	
//	//Log
//	private static Logger logger = null;
//	
//	public static void setLogger( Logger logger ) {
//		BDScore.logger = logger;
//	}
//	
//	private static void log( Level level, String msg, Throwable excepcion ){
//		if (logger==null) {  // Logger por defecto local:
//			logger = Logger.getLogger( BDScore.class.getName() );  // Nombre del logger - el de la clase
//			logger.setLevel( Level.ALL );  // Loguea todos los niveles
//			try {
//				// logger.addHandler( new FileHandler( "bd-" + System.currentTimeMillis() + ".log.xml" ) );  // Y saca el log a fichero xml
//				logger.addHandler( new FileHandler( "bd.log.xml", true ) );  // Y saca el log a fichero xml
//			} catch (Exception e) {
//				logger.log( Level.SEVERE, "No se pudo crear fichero de log", e );
//			}
//		}
//		if (excepcion==null)
//			logger.log( level, msg );
//		else
//			logger.log( level, msg, excepcion );
//	}
//}


