package jp.co.sss.practice.p10.q01.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PersonalInfoForm {
	@Size(min = 3, max = 4)
	@NotBlank
	private String prefName;

	@Pattern(regexp = "^[0-9]{3}-[0-9]{4}$")
	@NotBlank
	private String postalCode;

	@Max(120)
	@Min(18)
	private Integer age;

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
