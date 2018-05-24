package com.crossvale.oao;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Customer")
public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("status")
   private java.lang.String status;
   @org.kie.api.definition.type.Label("id")
   private java.lang.String id;
   @org.kie.api.definition.type.Label("issuePlace")
   private java.lang.String issuePlace;
   @org.kie.api.definition.type.Label("issueDate")
   private Date issueDate;
   @org.kie.api.definition.type.Label("expirationDate")
   private Date expirationDate;

   @org.kie.api.definition.type.Label("nationalityCode")
   private java.lang.String nationalityCode;

   @org.kie.api.definition.type.Label("birthDate")
   private Date birthDate;

   @org.kie.api.definition.type.Label("email")
   private java.lang.String email;

   @org.kie.api.definition.type.Label("customerNumber")
   private java.lang.String customerNumber;

   @org.kie.api.definition.type.Label("customerName")
   private java.lang.String customerName;

   @org.kie.api.definition.type.Label("customerType")
   private java.lang.String customerType;

   @org.kie.api.definition.type.Label("ssn")
   private java.lang.String ssn;

   @org.kie.api.definition.type.Label("primaryPhoneNumber")
   private java.lang.String primaryPhoneNumber;

   @org.kie.api.definition.type.Label("alternatePhoneNumber")
   private java.lang.String alternatePhoneNumber;

   @org.kie.api.definition.type.Label("address1")
   private java.lang.String address1;

   @org.kie.api.definition.type.Label("address2")
   private java.lang.String address2;

   @org.kie.api.definition.type.Label("city")
   private java.lang.String city;

   @org.kie.api.definition.type.Label("state")
   private java.lang.String state;

   @org.kie.api.definition.type.Label("postalCode")
   private java.lang.String postalCode;

   @org.kie.api.definition.type.Label("countryCode")
   private java.lang.String countryCode;

   @org.kie.api.definition.type.Label("primaryEmail")
   private java.lang.String primaryEmail;

   @org.kie.api.definition.type.Label("alternateEmail")
   private java.lang.String alternateEmail;

   @org.kie.api.definition.type.Label(value = "countryName")
   private java.lang.String countryName;

   public Customer()
   {
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public java.lang.String getIssuePlace()
   {
      return this.issuePlace;
   }

   public void setIssuePlace(java.lang.String issuePlace)
   {
      this.issuePlace = issuePlace;
   }

   public java.lang.String getNationalityCode()
   {
      return this.nationalityCode;
   }

   public void setNationalityCode(java.lang.String nationalityCode)
   {
      this.nationalityCode = nationalityCode;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.util.Date getIssueDate()
   {
      return this.issueDate;
   }

   public void setIssueDate(java.util.Date issueDate)
   {
      this.issueDate = issueDate;
   }

   public java.util.Date getExpirationDate()
   {
      return this.expirationDate;
   }

   public void setExpirationDate(java.util.Date expirationDate)
   {
      this.expirationDate = expirationDate;
   }

   public java.util.Date getBirthDate()
   {
      return this.birthDate;
   }

   public void setBirthDate(java.util.Date birthDate)
   {
      this.birthDate = birthDate;
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public java.lang.String getCustomerName()
   {
      return this.customerName;
   }

   public void setCustomerName(java.lang.String customerName)
   {
      this.customerName = customerName;
   }

   public java.lang.String getCustomerType()
   {
      return this.customerType;
   }

   public void setCustomerType(java.lang.String customerType)
   {
      this.customerType = customerType;
   }

   public java.lang.String getSsn()
   {
      return this.ssn;
   }

   public void setSsn(java.lang.String ssn)
   {
      this.ssn = ssn;
   }

   public java.lang.String getPrimaryPhoneNumber()
   {
      return this.primaryPhoneNumber;
   }

   public void setPrimaryPhoneNumber(java.lang.String primaryPhoneNumber)
   {
      this.primaryPhoneNumber = primaryPhoneNumber;
   }

   public java.lang.String getAlternatePhoneNumber()
   {
      return this.alternatePhoneNumber;
   }

   public void setAlternatePhoneNumber(java.lang.String alternatePhoneNumber)
   {
      this.alternatePhoneNumber = alternatePhoneNumber;
   }

   public java.lang.String getAddress1()
   {
      return this.address1;
   }

   public void setAddress1(java.lang.String address1)
   {
      this.address1 = address1;
   }

   public java.lang.String getAddress2()
   {
      return this.address2;
   }

   public void setAddress2(java.lang.String address2)
   {
      this.address2 = address2;
   }

   public java.lang.String getCity()
   {
      return this.city;
   }

   public void setCity(java.lang.String city)
   {
      this.city = city;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public java.lang.String getPostalCode()
   {
      return this.postalCode;
   }

   public void setPostalCode(java.lang.String postalCode)
   {
      this.postalCode = postalCode;
   }

   public java.lang.String getCountryCode()
   {
      return this.countryCode;
   }

   public void setCountryCode(java.lang.String countryCode)
   {
      this.countryCode = countryCode;
   }

   public java.lang.String getPrimaryEmail()
   {
      return this.primaryEmail;
   }

   public void setPrimaryEmail(java.lang.String primaryEmail)
   {
      this.primaryEmail = primaryEmail;
   }

   public java.lang.String getAlternateEmail()
   {
      return this.alternateEmail;
   }

   public void setAlternateEmail(java.lang.String alternateEmail)
   {
      this.alternateEmail = alternateEmail;
   }

   public java.lang.String getCountryName()
   {
      return this.countryName;
   }

   public void setCountryName(java.lang.String countryName)
   {
      this.countryName = countryName;
   }

   public Customer(java.lang.String status, java.lang.String id,
         java.lang.String issuePlace, java.util.Date issueDate,
         java.util.Date expirationDate, java.lang.String nationalityCode,
         java.util.Date birthDate, java.lang.String email,
         java.lang.String customerNumber, java.lang.String customerName,
         java.lang.String customerType, java.lang.String ssn,
         java.lang.String primaryPhoneNumber,
         java.lang.String alternatePhoneNumber, java.lang.String address1,
         java.lang.String address2, java.lang.String city,
         java.lang.String state, java.lang.String postalCode,
         java.lang.String countryCode, java.lang.String primaryEmail,
         java.lang.String alternateEmail, java.lang.String countryName)
   {
      this.status = status;
      this.id = id;
      this.issuePlace = issuePlace;
      this.issueDate = issueDate;
      this.expirationDate = expirationDate;
      this.nationalityCode = nationalityCode;
      this.birthDate = birthDate;
      this.email = email;
      this.customerNumber = customerNumber;
      this.customerName = customerName;
      this.customerType = customerType;
      this.ssn = ssn;
      this.primaryPhoneNumber = primaryPhoneNumber;
      this.alternatePhoneNumber = alternatePhoneNumber;
      this.address1 = address1;
      this.address2 = address2;
      this.city = city;
      this.state = state;
      this.postalCode = postalCode;
      this.countryCode = countryCode;
      this.primaryEmail = primaryEmail;
      this.alternateEmail = alternateEmail;
      this.countryName = countryName;
   }

}