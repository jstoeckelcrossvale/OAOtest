package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CodeValue implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("code")
   private java.lang.String code;
   @org.kie.api.definition.type.Label(value = "description")
   private java.lang.String description;

   public CodeValue()
   {
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public CodeValue(java.lang.String code, java.lang.String description)
   {
      this.code = code;
      this.description = description;
   }

}