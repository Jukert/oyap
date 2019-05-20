package by.bsuir.lab.common;

import java.util.Objects;

public class Monomial {

    private int koefficient = 1;
    private String parameter;
    private int power;
    private Operator operator;

    public int getKoefficient() {
        return koefficient;
    }

    public void setKoefficient(int koefficient) {
        this.koefficient = koefficient;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Monomial{" +
                "koefficient=" + koefficient +
                ", parameter='" + parameter + '\'' +
                ", power=" + power +
                ", operator=" + operator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monomial monomial = (Monomial) o;
        return koefficient == monomial.koefficient &&
                power == monomial.power &&
                monomial.parameter != null ? parameter.equals(monomial.parameter) : (parameter == null && monomial.parameter == null) &&
                operator == monomial.operator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(koefficient, parameter, power, operator);
    }
}
