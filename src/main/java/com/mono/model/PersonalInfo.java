package com.mono.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(value = "PersonalInfo")
public class PersonalInfo {

 @PrimaryKey
 private UUID id;

 @Column
 private String name;

 @Column
 private String phone;

 @Column
 private String address;

 @Column
 private String email;

}
