package com.itshaala.model;

import lombok.Data;
/* Lombok = Java ka shortcut tool for boring code.reduce boilerplate code
@Slf4j: Adds logging frameworks seamlessly.
@Value: Creates immutable classes.-> Once the object is created, its state cannot be changed.-> state means-> instance variables
@Data se:
getters
setters
toString()
equals() / hashCode()
sab auto-generate ho jata hai.
 */
@Data
public class Student {
    private int id;
    private String name;
    private String email;
    private String city;

}
