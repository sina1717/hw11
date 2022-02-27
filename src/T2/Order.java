package T2;


import java.sql.Date;

public class Order {
    private Integer id;
    private Customer customer;
    private Product product;
    private Date date;

    public Order(Integer id, Customer customer, Product product, Date date) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer.getName() +
                ", product=" + product.getName() +
                ", date=" + date +
                '}';
    }
}
