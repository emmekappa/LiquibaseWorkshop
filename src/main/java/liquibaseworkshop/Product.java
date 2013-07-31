package liquibaseworkshop;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Michele Cantelli
 * Date: 31/07/13
 * Time: 11.40
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Products")
public class Product {
    private int id;
    private String name;

    @Id
    @Column(name = "ProductId")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    @Basic
    public void setName(String name) {
        this.name = name;
    }
}
