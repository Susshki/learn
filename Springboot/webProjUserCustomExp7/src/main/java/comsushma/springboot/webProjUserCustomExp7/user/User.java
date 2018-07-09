package comsushma.springboot.webProjUserCustomExp7.user;

public class User {
	private int id;
	private String name;

	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
