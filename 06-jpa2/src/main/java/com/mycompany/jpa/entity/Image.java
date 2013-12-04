package com.mycompany.jpa.entity;

import javax.persistence.*;

@Entity
@NamedQueries(
        {
//                @NamedQuery(name="getById" , query = "select image from Image image where image.imageId = :imageId"),
//                @NamedQuery(name="getAll" , query = "select image from Image image")
        }
)
@Table(name="tbl_ord_image")
public class Image extends BaseEntity{

	// Fields    
//     private OrderTO order;
     private String path;
     private String seq;

    public Image() {
    }

    @Column(length=150)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(length = 10)
    public String getSeq() {
        return this.seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }
}