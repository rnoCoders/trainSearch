package com.rnocoders.trainticketing.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "train_data")
public class TrainSearch {
    @Id
    private String id;
    private String train_no;
    private String train_name;
    private String seq;
    private String station_code;
    private String station_name;
    private String arrival_time;
    private String departure_time;
    private String distance;
    private String source_station;
    private String source_station_name;
    private String destination_station;
    private String destination_station_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrain_no() {
        return train_no;
    }

    public void setTrain_no(String train_no) {
        this.train_no = train_no;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getStation_code() {
        return station_code;
    }

    public void setStation_code(String station_code) {
        this.station_code = station_code;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getSource_station() {
        return source_station;
    }

    public void setSource_station(String source_station) {
        this.source_station = source_station;
    }

    public String getSource_station_name() {
        return source_station_name;
    }

    public void setSource_station_name(String source_station_name) {
        this.source_station_name = source_station_name;
    }

    public String getDestination_station() {
        return destination_station;
    }

    public void setDestination_station(String destination_station) {
        this.destination_station = destination_station;
    }

    public String getDestination_station_name() {
        return destination_station_name;
    }

    public void setDestination_station_name(String destination_station_name) {
        this.destination_station_name = destination_station_name;
    }
}

