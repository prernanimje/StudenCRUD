package com.studentCURD.StudenCURD.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    public String StudentName;
    public int StudentId;
    public String Grade;
    public int TotalFees;
}
