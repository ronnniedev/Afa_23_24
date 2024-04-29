package ficheros;

import java.util.Objects;

public class Id {

	private String id;

	public Id(String id) {
		this.id =id;
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Id other = (Id) obj;
		return this.id.compareTo(other.id) == 0;
	}

	@Override
	public String toString() {
		return "id=" + id;
	}
	
	

	
	
	
	
	
	
}
