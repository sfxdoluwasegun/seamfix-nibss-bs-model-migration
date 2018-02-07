/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import nw.orm.core.IEntity;

/**
 *
 * @author Marcel
 * @since Aug 28, 2017 - 5:53:24 PM
 */
@Entity
@Table(name = "COORDINATE_LOCATOR")
public class CoordinateLocator extends IEntity {

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "COORDINATE_ADDRESS")
    private String coordinateAddress;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getCoordinateAddress() {
        return coordinateAddress;
    }

    public void setCoordinateAddress(String coordinateAddress) {
        this.coordinateAddress = coordinateAddress;
    }

}
