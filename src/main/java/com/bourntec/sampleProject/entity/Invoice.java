package com.bourntec.sampleProject.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="Invoice")
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer invoiceId ;
	private Integer custId;
	private Integer orderId;
	private Integer itemCode;
	private Integer invAmnt;
	private Integer paidAmnt;
	private Double retAmnt;
}
