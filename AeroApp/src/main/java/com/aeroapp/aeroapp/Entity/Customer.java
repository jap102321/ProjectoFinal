package com.aeroapp.aeroapp.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long customer_id;
    private String name;
    private String last_name;
    private Long cell_phone;
    private String gender;
    private int customer_reservation;
    private String reservation_number;
    private String reservation_identifier;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "reserva")
    private Reserva reserva;


    public Customer() {
    }

    public Customer(Long customer_id, String name, String last_name, Long cell_phone,
                    String gender, int customer_reservation, String reservation_number,String reservation_identifier
                    ,Reserva reserva) {
        this.customer_id = customer_id;
        this.name = name;
        this.last_name = last_name;
        this.cell_phone = cell_phone;
        this.gender = gender;
        this.customer_reservation = customer_reservation;
        this.reservation_number = reservation_number;
        this.reserva = reserva;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Long getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(Long cell_phone) {
        this.cell_phone = cell_phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }


    public int getCustomer_reservation() {
        return customer_reservation;
    }

    public void setCustomer_reservation(int customer_reservation) {
        this.customer_reservation = customer_reservation;
    }

    public String getReservation_number() {
        return reservation_number;
    }

    public void setReservation_number(String reservation_number) {
        this.reservation_number = reservation_number;
    }

    public String getReservation_identifier() {
        return reservation_identifier;
    }

    public void setReservation_identifier(String reservation_identifier) {
        this.reservation_identifier = reservation_identifier;
    }
}
