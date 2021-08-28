package com.softserve.edu.opencart.data;

public class User {

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public String getTelephon() {
        return Telephon;
    }

    public String getFax() {
        return Fax;
    }

    public String getCompany() {
        return Company;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public String getCity() {
        return City;
    }

    public String getPostCode() {
        return PostCode;
    }

    public String getPassword() {
        return Password;
    }

    public String getPasswordConfirm() {
        return PasswordConfirm;
    }

    private String FirstName = "name";
    private String LastName = "lastname";
    private String E_Mail="esddsaadail@gmail.com";
    private String Telephon = "+38066432221";
    private String Fax = "Fax";
    private String Company = "company" ;
    private  String Address1 = "address1";
    private String Address2 = "address2";
    private String City = "city" ;
    private String PostCode = "post code";
    private String Password = "1234LS";
    private String PasswordConfirm ="1234LS";

    public String getRegion() {
        return Region;
    }

    public String getCountry() {
        return Country;
    }

    String Region  =  "Angus";
    String Country = "Afghanistan";
}
