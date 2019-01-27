package com.mono.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
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
