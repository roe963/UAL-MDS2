/**
 * Licensee: Juandi(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12021PFOrtegaOrtegaDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance());
			basededatos.MDS12021PFOrtegaOrtegaPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
