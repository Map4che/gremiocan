/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NonNull;




@Entity
@Table(name = "usuario")
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(name = "nombre",length = 30,nullable = false)
    private String name;
    @Column(name = "apellido",length = 30,nullable = false)
    private String lastname;
    @Column(name="direccion",length = 150,nullable = false)
    private String address;
    @Column(name = "celular",length = 10,nullable = false)
    private Integer phone;
    @Column(name = "ciudad",length = 30,nullable = false)
    private String city;
    @Column(name = "departamento",length = 15,nullable = false)
    private String state;
    @Column(name = "email",length = 100,nullable = false)
    private String email;
    @Column (name = "password",length = 25,nullable = false)
    private String password;
    @Column(name = "negocio",length = 80,nullable = false)
    private String bussiness;
    @Column(name = "prueba")
    private String prove;
    public User() {
    }

    public User(Integer id, String name, String lastname, String address, Integer phone, String city, String state, String email, String password, String bussiness, String prove) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.email = email;
        this.password = password;
        this.bussiness = bussiness;
        this.prove = prove;
        
    }

    public User(String email, String password, String no_Existe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBussiness() {
        return bussiness;
    }

    public void setBussiness(String bussiness) {
        this.bussiness = bussiness;
    }

    public String getProve() {
        return prove;
    }

    public void setProve(String prove) {
        this.prove = prove;
    }


   

    
    
}