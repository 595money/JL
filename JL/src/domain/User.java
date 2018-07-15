package domain;

public class User {

	public String id;
	public String passWord;
	public String name;
	public String getId() {
		return id;
	}

	public void setId(String id) throws JLException{
		if(id == null || id == "") {
			throw new JLException("ID不正確");
		}
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String pwd) throws JLException{
		if(pwd == null || pwd == "") {
			throw new JLException("pwd不正確");
		}
		this.passWord = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws JLException{
		if(name == null || name == "") {
			throw new JLException("name不正確");
		}
		this.name = name;
	}

}
