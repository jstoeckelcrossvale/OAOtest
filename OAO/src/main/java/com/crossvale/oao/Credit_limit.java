package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Credit_limit implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "currency")
   private java.lang.String currency;
   @org.kie.api.definition.type.Label(value = "amount")
   private java.lang.Double amount;

   public Credit_limit()
   {
   }

   public java.lang.String getCurrency()
   {
      return this.currency;
   }

   public void setCurrency(java.lang.String currency)
   {
      this.currency = currency;
   }

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public Credit_limit(java.lang.String currency, java.lang.Double amount)
   {
      this.currency = currency;
      this.amount = amount;
   }

}