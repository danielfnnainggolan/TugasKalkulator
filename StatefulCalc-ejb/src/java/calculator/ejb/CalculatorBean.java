/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ejb;
import javax.ejb.Stateful;
@Stateful
public class CalculatorBean implements CalculatorBeanLocal {
private String sn1="";
private String sn2="";
private String operator="";
@Override
public double add(double addend1, double addend2) {
return addend1 + addend2;
    }

@Override
public double subtract(double minuend, double subtrahend) {
return minuend - subtrahend;
    }
@Override
public double multiply(double factor1, double factor2) {
return factor1 * factor2;
    }
@Override
public double divide(double dividend, double divisor) {
return dividend / divisor;
    }
public String addSn1(String sn1) {
    return this.sn1 +=sn1;
}
public String move(String sn1) {
    this.sn2 = this.sn1;
    this.sn1 = "";
    return this.sn2;
}

public String movevalue(String value) {
    this.sn1 = value;
    return this.sn1;
}
public String operator(String operator) {
    return this.operator =operator;
}

public String getOperator() {
    return operator;
}
public String addSn2(String sn2) {
    return this.sn2 +=sn2;
}
public String getSn1() {
return sn1;
    }
public String getSn2() {
return sn2;
    }

public void Reset() {
    sn1 = "";
    sn2 = "";
    }
}
