package ua.kpi.dbsample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/*
CREATE TABLE public.bus_model
(
    id bigint NOT NULL DEFAULT nextval('bus_model_id_seq'::regclass),
    manufacturer character varying(50) COLLATE pg_catalog."default" NOT NULL,
    model character varying(50) COLLATE pg_catalog."default" NOT NULL,
    seat_number integer NOT NULL,
    CONSTRAINT bus_model_pk PRIMARY KEY (id)
)
 */
@Entity
@Table(name = "bus_model")
@Getter
@Setter
public class BusModel {

  @Id
  private Long id;

  private String manufacturer;

  private String model;

  @Column(name = "seat_number")
  private int seatNumber;

}
