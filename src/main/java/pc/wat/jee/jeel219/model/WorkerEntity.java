/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.wat.jee.jeel219.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="WORKERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkerEntity implements Serializable{
    @Id
    private String name;
    @ManyToOne
    private CompanyEntity company;
}
