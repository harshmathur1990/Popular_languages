package lang;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LangPopular {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column (unique = true)
	private String languageName;

	private int noOfUsers;

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguagaeName(String languagaeName) {
		this.languageName = languagaeName;
	}

	public int getNoOfUsers() {
		return noOfUsers;
	}

	public void setNoOfUsers(int noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

	public LangPopular(String languagaeName, int noOfUsers) {
		super();
		this.languageName = languagaeName;
		this.noOfUsers = noOfUsers;
	}

	@Override
	public String toString() {
		return "LangPopular [id=" + id + ", languageName=" + languageName
				+ ", noOfUsers=" + noOfUsers + "]";
	}

	public LangPopular() {
		super();
	}

}
