package hiber.model;

import javax.persistence.*;
import java.security.PublicKey;

@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String model;
    @Column
    private int series;

    public Car() {

    }
    public Car(String model, int series){
        this.model=model;
        this.series=series;
    }
    public String getModel() {
        return model;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }


    @Override
    public String toString() {
        return "Car:" + model + series;
    }
}
