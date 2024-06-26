package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");

        Item item1 = new Item(product1, new BigDecimal(10), 2, new BigDecimal(20));
        Item item2 = new Item(product2, new BigDecimal(5), 4, new BigDecimal(20));

        Invoice invoice = new Invoice("2024/06/13");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        // When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);

        int id = invoice.getId();

        // Then
        assertNotEquals(0, id);

        // CleanUp
        invoiceDao.deleteById(id);
    }
}