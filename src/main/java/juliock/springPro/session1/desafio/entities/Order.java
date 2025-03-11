package juliock.springPro.session1.desafio.entities;


import java.util.Objects;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;

    public Order() {
    }

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }
    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(getCode(), order.getCode());
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getCode());
    }
    @Override
    public String toString() {
        return "Order{" +
                "code=" + code +
                ", basic=" + basic +
                ", discount=" + discount +
                '}';
    }
}
