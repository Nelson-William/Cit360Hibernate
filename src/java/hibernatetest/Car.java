package hibernatetest;
// Generated Jun 11, 2018 9:17:13 PM by Hibernate Tools 4.3.1



/**
 * Car generated by hbm2java
 */
public class Car  implements java.io.Serializable {


     private int idcar;
     private String make;
     private String model;
     private String color;

    public Car() {
    }

	
    public Car(int idcar) {
        this.idcar = idcar;
    }
    public Car(int idcar, String make, String model, String color) {
       this.idcar = idcar;
       this.make = make;
       this.model = model;
       this.color = color;
    }
   
    public int getIdcar() {
        return this.idcar;
    }
    
    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }
    public String getMake() {
        return this.make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }




}

