package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Account_routing implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "scheme")
   private java.lang.String scheme;
   @org.kie.api.definition.type.Label(value = "address")
   private java.lang.String address;

   public Account_routing()
   {
   }

   public java.lang.String getScheme()
   {
      return this.scheme;
   }

   public void setScheme(java.lang.String scheme)
   {
      this.scheme = scheme;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public Account_routing(java.lang.String scheme, java.lang.String address)
   {
      this.scheme = scheme;
      this.address = address;
   }

}