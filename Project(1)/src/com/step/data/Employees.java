package com.step.data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Employees {

    //region enumDeclarations
    public enum GenderEnum{
        Male,
        Female,
        Custom
    }
    public enum FunctionsEnum{
        SysEng(1),
        NetEng(2),
        SysAdmin(3),
        ProjMan(4),
        Helpdesk(5),
        DesktopSupport(6);

        //region implementationForGettingValueBasedOnInt
        private final int funcCode;
        final private static Map<Integer,FunctionsEnum> map = new HashMap<>();

        static {
            for (FunctionsEnum pageType : FunctionsEnum.values()) {
                map.put(pageType.funcCode, pageType);
            }
        }

        public static FunctionsEnum valueOfInt(int funcCode){
            return map.get(funcCode);
        }

        FunctionsEnum(int funcCode){
            this.funcCode=funcCode;
        }
        //endregion

    }
    //endregion

    //region properties
    String IDNP,name,surname; // not String because we can still modify it (in the app at least)
    LocalDate birthDate,employedOn;
    double salary;
    GenderEnum gender; // even if the chance is small, we will still be able to change a person's gender
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
    }

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
    public void setIDNP(String IDNP){this.IDNP=IDNP;}
    public void setName(String name){this.name=name;}
    public void setSurname(String surname){this.surname=surname;}
    public void setBirthDate(LocalDate birthDate){this.birthDate=birthDate;}
    public void setEmployedOn(LocalDate employedOn){this.employedOn=employedOn;}
    public void setGender(GenderEnum gender){this.gender=gender;}
    public void setSalary(double salary){this.salary=salary;}
    public void setFunction(FunctionsEnum function){this.function=function;}
    //endregion
}
