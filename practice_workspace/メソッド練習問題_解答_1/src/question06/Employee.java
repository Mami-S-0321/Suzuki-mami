/**
 * privateでString型のフィールドname
 * privateでint型のフィールドid
 * privateでint型のフィールドpass
 * 上記3つのフィールドを作成し、それぞれのgetterとsetterを作成してください。
 * また、getterとsetterの自動生成を使用すること
 */
package question06;

public class Employee {
	
	private String name;
	
	private int id;
	
	private int pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	
	
	

}
