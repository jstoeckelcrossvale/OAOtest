package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Address implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "address1")
   private java.lang.String address1;
   @org.kie.api.definition.type.Label(value = "address2")
   private java.lang.String address2;
   @org.kie.api.definition.type.Label(value = "city")
   private java.lang.String city;
   @org.kie.api.definition.type.Label(value = "state")
   private java.lang.String state;
   @org.kie.api.definition.type.Label(value = "postalCode")
   private java.lang.String postalCode;

   public Address()
   {
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

   public Address(java.lang.String address1, java.lang.String address2,
         java.lang.String city, java.lang.String state,
         java.lang.String postalCode)
   {
      this.address1 = address1;
      this.address2 = address2;
      this.city = city;
      this.state = state;
      this.postalCode = postalCode;
   }

}