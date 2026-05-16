/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_flowershopmanagementsystem;

import java.sql.Date;


/**
 *
 * @author HP
 */
public class flowersData {
    
    private Integer flowerId;
    private String name;
    private String status;
    private Double price;
    private Date date;
    private String image;
    
    public flowersData(Integer flowerId, String name, String status, Double price,String image, Date date)
    {
        this.flowerId = flowerId;
        this.name = name;
        this.status = status;
        this.price = price;
        this.date = date;
        this.image = image;
    }
    
    public Integer getFlowerId(){
        return flowerId;
    }
    public String getName(){
        return name;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
    public String getImage(){
        return image;
    }
    
}
