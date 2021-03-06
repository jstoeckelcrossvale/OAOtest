package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Balance")
public class Balance implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("currency")
   private java.lang.String currency;
   @org.kie.api.definition.type.Label("amount")
   private String amount;

   public Balance()
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

   public java.lang.String getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.String amount)
   {
      this.amount = amount;
   }

   public Balance(java.lang.String currency, java.lang.String amount)
   {
      this.currency = currency;
      this.amount = amount;
   }

}