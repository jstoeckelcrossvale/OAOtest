package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id")
   private java.lang.String id;
   @org.kie.api.definition.type.Label(value = "bank_routing")
   private com.crossvale.common.AccountRouting bank_routing;
   @org.kie.api.definition.type.Label(value = "account_routing")
   private com.crossvale.common.AccountRouting account_routing;
   @org.kie.api.definition.type.Label(value = "holder")
   private com.crossvale.common.Holder holder;
   @org.kie.api.definition.type.Label(value = "metadata")
   private com.crossvale.common.AccountMetadata metadata;
   @org.kie.api.definition.type.Label(value = "accountRoutingAsString")
   private java.lang.String accountRoutingAsString;

   public Transaction()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public com.crossvale.common.AccountRouting getBank_routing()
   {
      return this.bank_routing;
   }

   public void setBank_routing(com.crossvale.common.AccountRouting bank_routing)
   {
      this.bank_routing = bank_routing;
   }

   public com.crossvale.common.AccountRouting getAccount_routing()
   {
      return this.account_routing;
   }

   public void setAccount_routing(
         com.crossvale.common.AccountRouting account_routing)
   {
      this.account_routing = account_routing;
   }

   public com.crossvale.common.Holder getHolder()
   {
      return this.holder;
   }

   public void setHolder(com.crossvale.common.Holder holder)
   {
      this.holder = holder;
   }

   public com.crossvale.common.AccountMetadata getMetadata()
   {
      return this.metadata;
   }

   public void setMetadata(com.crossvale.common.AccountMetadata metadata)
   {
      this.metadata = metadata;
   }

   public java.lang.String getAccountRoutingAsString()
   {
      return this.accountRoutingAsString;
   }

   public void setAccountRoutingAsString(
         java.lang.String accountRoutingAsString)
   {
      this.accountRoutingAsString = accountRoutingAsString;
   }

   public Transaction(java.lang.String id,
         com.crossvale.common.AccountRouting bank_routing,
         com.crossvale.common.AccountRouting account_routing,
         com.crossvale.common.Holder holder,
         com.crossvale.common.AccountMetadata metadata,
         java.lang.String accountRoutingAsString)
   {
      this.id = id;
      this.bank_routing = bank_routing;
      this.account_routing = account_routing;
      this.holder = holder;
      this.metadata = metadata;
      this.accountRoutingAsString = accountRoutingAsString;
   }

}