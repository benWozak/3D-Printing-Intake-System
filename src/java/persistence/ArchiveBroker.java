package persistence;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ArchiveBroker implements Broker{

	/**
	 * Instantiates a new Archive broker.
	 */
	private ArchiveBroker() {
		
	}
	
	/**
	 * Gets the broker.
	 *
	 * @return the broker
	 */
	public ArchiveBroker getBroker() {
		return null;
		
	}
	
	/* (non-Javadoc)
	 * @see persistence.Broker#closeBroker()
	 */
	public void closeBroker() {
		
	}

	/* (non-Javadoc)
	 * @see persistence.Broker#search(int)
	 */
	@Override
	public Object search(int id) {
		return null;
	}

	/* (non-Javadoc)
	 * @see persistence.Broker#persist(java.lang.Object)
	 */
	@Override
	public boolean persist(Object object) {
		return false;
	}

	/* (non-Javadoc)
	 * @see persistence.Broker#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(Object object) {
		return false;
	}

	/* (non-Javadoc)
	 * @see persistence.Broker#execute(java.lang.String)
	 */
	@Override
	public ResultSet execute(String statement) {
		return null;
	}

	/* (non-Javadoc)
	 * @see persistence.Broker#getAll()
	 */
	@Override
	public ArrayList<Object> getAll() {
		return null;
	}
}
