package calculator;
/*
 * The user input are two numbers
 * that can be either added, subtracted, multiplied
 * or divided*/
public class UserInput {
	private Integer number1;
	private Integer number2;
	public UserInput() {
		// TODO Auto-generated constructor stub
	}
	public Integer getNumber1() {
		return number1;
	}
	public void setNumber1(Integer number1) {
		this.number1 = number1;
	}
	public Integer getNumber2() {
		return number2;
	}
	public void setNumber2(Integer number2) {
		this.number2 = number2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number1 == null) ? 0 : number1.hashCode());
		result = prime * result + ((number2 == null) ? 0 : number2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInput other = (UserInput) obj;
		if (number1 == null) {
			if (other.number1 != null)
				return false;
		} else if (!number1.equals(other.number1))
			return false;
		if (number2 == null) {
			if (other.number2 != null)
				return false;
		} else if (!number2.equals(other.number2))
			return false;
		return true;
	}
	public UserInput(Integer number1, Integer number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	
}
