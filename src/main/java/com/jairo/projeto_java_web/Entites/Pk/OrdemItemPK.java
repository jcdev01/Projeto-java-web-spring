package com.jairo.projeto_java_web.Entites.Pk;

import com.jairo.projeto_java_web.Entites.Order;
import com.jairo.projeto_java_web.Entites.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrdemItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;



    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdemItemPK)) return false;

        OrdemItemPK that = (OrdemItemPK) o;

        return Objects.equals(
                order != null ? order.getId() : null,
                that.order != null ? that.order.getId() : null
        ) &&
                Objects.equals(
                        product != null ? product.getId() : null,
                        that.product != null ? that.product.getId() : null
                );
    }


    @Override
    public int hashCode() {
        return Objects.hash(
                order != null ? order.getId() : null,
                product != null ? product.getId() : null
        );
    }


}
