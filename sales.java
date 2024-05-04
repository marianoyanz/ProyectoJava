import java.util.Date;

public class sales {
    String id;
    int paymentmethod;
    Date date;
    double amount;
    int customer;
    int status;

    public void setId(String id) {
        this.id = id;
    }

    public void setPaymentmethod(int paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public int getPaymentmethod() {
        return paymentmethod;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public int getCustomer() {
        return customer;
    }

    public int getStatus() {
        return status;
    }
}
