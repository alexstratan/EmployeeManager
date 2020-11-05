package com.step.data;

import java.time.LocalDate;

public class Employees {

    //region properties
    final String IDNP;
    String name;
    String surname;
    LocalDate birthDate;
    LocalDate employedOn;
    public static enum GenderEnum{
        Male,
        Female,
        Custom
    }
    GenderEnum gender;
    double salary;
    public static enum FunctionsEnum{
        SysEng,
        NetEng,
        SysAdmin,
        ProjMan,
        Helpdesk,
        DesktopSupport,
    }
    FunctionsEnum function;
    //endregion

    //region constructor
    public Employees(String IDNP,String name, String surname, LocalDate employedOn,LocalDate birthDate,GenderEnum gender,double salary,FunctionsEnum function){
        this.IDNP=IDNP;
        this.name=name;
        this.surname=surname;
        this.employedOn=employedOn;
        this.birthDate=birthDate;
        this.gender=gender;
        this.salary=salary;
        this.function=function;
    };

    //endregion

    //region getters
    public String getIDNP(){return this.IDNP;}
    public String getName(){return this.name;}
    public String getSurname(){return this.surname;}
    public LocalDate getBirthDate(){return this.birthDate;}
    public LocalDate getEmployedOn(){return this.employedOn;}
    public GenderEnum getGender(){return this.gender;}
    public double getSalary(){return this.salary;}
    public FunctionsEnum getFunction(){return this.function;}
    //endregion

    //region setters
    void setName(String name){this.name=name;}
    void setSurname(String surname){this.surname=surname;}
    void setBirthDate(LocalDate birthDate){this.birthDate=birthDate;}
    void setEmployedOn(LocalDate employedOn){this.employedOn=employedOn;}
    void setGender(GenderEnum gender){this.gender=gender;}
    void setSalary(double salary){this.salary=salary;}
    void setFunction(FunctionsEnum function){this.function=function;}
    //endregion
}
