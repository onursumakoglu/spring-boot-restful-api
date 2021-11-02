package com.example.demo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomTreeData", schema = "public")
public class DbTableEntity implements Serializable{

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "parentId")
    private Integer parentId;
    @Column(name = "displayText")
    private String displayText;

    public DbTableEntity(){
        super();
    }

    public DbTableEntity(Integer parentId, String displayText){
        super();
        this.parentId = parentId;
        this.displayText = displayText; 
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getParentId(){
        return this.parentId;
    }

    public void setParentId(Integer parentId){
        this.parentId = parentId;
    }

    public String getDisplayText(){
        return this.displayText;
    }

    public void setDisplayText(String displayText){
       this.displayText = displayText;
    }
    
}