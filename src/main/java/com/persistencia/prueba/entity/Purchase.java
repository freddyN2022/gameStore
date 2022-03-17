package com.persistencia.prueba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @Column(name = "purchase_id", nullable = false, length = 50)
    private String id;

    @Column(name = "date_of_purchase")
    private LocalDate dateOfPurchase;

    @Column(name = "purchase_details", length = 50)
    private String purchaseDetails;

    @Column(name = "customer_id", length = 50)
    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPurchaseDetails() {
        return purchaseDetails;
    }

    public void setPurchaseDetails(String purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}