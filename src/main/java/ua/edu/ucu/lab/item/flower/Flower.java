package ua.edu.ucu.lab.item.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower {
    @Id
    @SequenceGenerator(
            name = "flower_id_sequence",
            sequenceName = "flower_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flower_id_sequence"
    )
    private Long id;
    private double sepalLength;
    private FlowerColor color;
    private double price;

    public Flower(double sepalLength, FlowerColor color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{"
                + "id=" + id
                + ", sepalLength=" + sepalLength
                + ", color=" + color
                + ", price=" + price
                + '}';
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o.getClass().getName().equals(this.getClass().getName()))) {
            return false;
        }
        return sepalLength == ((Flower) o).sepalLength
                && color == ((Flower) o).color
                && price == ((Flower) o).price;
    }
}
