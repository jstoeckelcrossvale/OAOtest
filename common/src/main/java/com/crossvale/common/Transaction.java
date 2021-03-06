package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("id")
   private java.lang.String id;
   @org.kie.api.definition.type.Label("ticketNumber")
   private java.lang.String ticketNumber;

   @org.kie.api.definition.type.Label(value = "other_account")
   private com.crossvale.common.TransactionOtherAccount other_account;

   @org.kie.api.definition.type.Label(value = "this_account")
   private com.crossvale.common.TransactionOwnAccount this_account;

   @org.kie.api.definition.type.Label(value = "details")
   private com.crossvale.common.TransactionDetails details;

   @org.kie.api.definition.type.Label(value = "metadata")
   private com.crossvale.common.TransactionMetadata metadata;

   @org.kie.api.definition.type.Label(value = "entities")
   private java.util.List<com.crossvale.common.Entity> entities;

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

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public com.crossvale.common.TransactionOtherAccount getOther_account()
   {
      return this.other_account;
   }

   public void setOther_account(
         com.crossvale.common.TransactionOtherAccount other_account)
   {
      this.other_account = other_account;
   }

   public com.crossvale.common.TransactionOwnAccount getThis_account()
   {
      return this.this_account;
   }

   public void setThis_account(
         com.crossvale.common.TransactionOwnAccount this_account)
   {
      this.this_account = this_account;
   }

   public com.crossvale.common.TransactionDetails getDetails()
   {
      return this.details;
   }

   public void setDetails(com.crossvale.common.TransactionDetails details)
   {
      this.details = details;
   }

   public com.crossvale.common.TransactionMetadata getMetadata()
   {
      return this.metadata;
   }

   public void setMetadata(com.crossvale.common.TransactionMetadata metadata)
   {
      this.metadata = metadata;
   }

   public java.util.List<com.crossvale.common.Entity> getEntities()
   {
      return this.entities;
   }

   public void setEntities(java.util.List<com.crossvale.common.Entity> entities)
   {
      this.entities = entities;
   }

   public Transaction(java.lang.String id, java.lang.String ticketNumber,
         com.crossvale.common.TransactionOtherAccount other_account,
         com.crossvale.common.TransactionOwnAccount this_account,
         com.crossvale.common.TransactionDetails details,
         com.crossvale.common.TransactionMetadata metadata,
         java.util.List<com.crossvale.common.Entity> entities)
   {
      this.id = id;
      this.ticketNumber = ticketNumber;
      this.other_account = other_account;
      this.this_account = this_account;
      this.details = details;
      this.metadata = metadata;
      this.entities = entities;
   }

}