/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.wat.jee.jeel219.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="COMPANIES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity implements Serializable{
    @Id
    private String name;
    @Column(nullable = true)
    private String address;
    private double netWorth = 0;   
}
