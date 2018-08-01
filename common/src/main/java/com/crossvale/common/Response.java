package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Response implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "errors")
   private java.util.List<java.lang.String> errors;

   @org.kie.api.definition.type.Label(value = "status")
   private java.lang.String status;

   @org.kie.api.definition.type.Label(value = "entities")
   private java.util.List<java.lang.String> entities;

   public Response()
   {
   }

   public java.util.List<java.lang.String> getErrors()
   {
      return this.errors;
   }

   public void setErrors(java.util.List<java.lang.String> errors)
   {
      this.errors = errors;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.util.List<java.lang.String> getEntities()
   {
      return this.entities;
   }

   public void setEntities(java.util.List<java.lang.String> entities)
   {
      this.entities = entities;
   }

   public Response(java.util.List<java.lang.String> errors,
         java.lang.String status, java.util.List<java.lang.String> entities)
   {
      this.errors = errors;
      this.status = status;
      this.entities = entities;
   }

}