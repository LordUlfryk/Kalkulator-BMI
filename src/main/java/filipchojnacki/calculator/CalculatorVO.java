package filipchojnacki.calculator;

import lombok.Data;

@Data
public class CalculatorVO {
    private double Value1;
    private double Value2;
    private String Operator;
	public double getValue1() {
		return Value1;
	}
	public void setValue1(double value1) {
		Value1 = value1;
	}
	public double getValue2() {
		return Value2;
	}
	public void setValue2(double value2) {
		Value2 = value2;
	}
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}

	


}
