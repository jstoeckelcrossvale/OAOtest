package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Originator")
public class Originator implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("gloabalId")
   private java.lang.String globalId;
   @org.kie.api.definition.type.Label("costCenterCode")
   private java.lang.String costCenterCode;
   @org.kie.api.definition.type.Label("medium")
   private com.crossvale.oao.CodeValue medium;
   @org.kie.api.definition.type.Label("channel")
   private com.crossvale.oao.CodeValue channel;
   @org.kie.api.definition.type.Label("firstName")
   private java.lang.String firstName;
   @org.kie.api.definition.type.Label("lastName")
   private java.lang.String lastName;
   @org.kie.api.definition.type.Label("group")
   private com.crossvale.oao.CodeValue group;

   public Originator()
   {
   }

   public java.lang.String getGlobalId()
   {
      return this.globalId;
   }

   public void setGlobalId(java.lang.String globalId)
   {
      this.globalId = globalId;
   }

   public java.lang.String getCostCenterCode()
   {
      return this.costCenterCode;
   }

   public void setCostCenterCode(java.lang.String costCenterCode)
   {
      this.costCenterCode = costCenterCode;
   }

   public com.crossvale.oao.CodeValue getMedium()
   {
      return this.medium;
   }

   public void setMedium(com.crossvale.oao.CodeValue medium)
   {
      this.medium = medium;
   }

   public com.crossvale.oao.CodeValue getChannel()
   {
      return this.channel;
   }

   public void setChannel(com.crossvale.oao.CodeValue channel)
   {
      this.channel = channel;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public com.crossvale.oao.CodeValue getGroup()
   {
      return this.group;
   }

   public void setGroup(com.crossvale.oao.CodeValue group)
   {
      this.group = group;
   }

   public Originator(java.lang.String globalId, java.lang.String costCenterCode,
         com.crossvale.oao.CodeValue medium,
         com.crossvale.oao.CodeValue channel,
         java.lang.String firstName, java.lang.String lastName,
         com.crossvale.oao.CodeValue group)
   {
      this.globalId = globalId;
      this.costCenterCode = costCenterCode;
      this.medium = medium;
      this.channel = channel;
      this.firstName = firstName;
      this.lastName = lastName;
      this.group = group;
   }

}