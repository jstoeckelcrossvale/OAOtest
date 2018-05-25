package com.crossvale.oao;
import package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("AssignTo")
public class AssignTo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("user")
   private com.crossvale.carddispute.CodeValue user;
   @org.kie.api.definition.type.Label("group")
   private com.crossvale.carddispute.CodeValue group;

   @org.kie.api.definition.type.Label("firstName")
   private java.lang.String firstName;

   @org.kie.api.definition.type.Label("lastName")
   private java.lang.String lastName;

   public AssignTo()
   {
   }

   public com.crossvale.carddispute.CodeValue getUser()
   {
      return this.user;
   }

   public void setUser(com.crossvale.carddispute.CodeValue user)
   {
      this.user = user;
   }

   public com.crossvale.carddispute.CodeValue getGroup()
   {
      return this.group;
   }

   public void setGroup(com.crossvale.carddispute.CodeValue group)
   {
      this.group = group;
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

   public AssignTo(com.crossvale.carddispute.CodeValue user,
         com.crossvale.carddispute.CodeValue group, java.lang.String firstName,
         java.lang.String lastName)
   {
      this.user = user;
      this.group = group;
      this.firstName = firstName;
      this.lastName = lastName;
   }

}