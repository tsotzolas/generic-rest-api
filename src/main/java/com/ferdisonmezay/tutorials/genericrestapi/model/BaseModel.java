package com.ferdisonmezay.tutorials.genericrestapi.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@SuppressWarnings("serial")
public class BaseModel implements Serializable {
	
	@Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Basic(optional = false)  
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT")  
    private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BaseModel baseModel = (BaseModel) o;
		return id == baseModel.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
