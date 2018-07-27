package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TransactionMetadata implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "narrative")
   private java.lang.String narrative;
   @org.kie.api.definition.type.Label(value = "comments")
   private java.util.List<com.crossvale.common.Tag> comments;
   @org.kie.api.definition.type.Label(value = "tags")
   private java.util.List<com.crossvale.common.Tag> tags;
   @org.kie.api.definition.type.Label(value = "where")
   private com.crossvale.common.Location where;
   @org.kie.api.definition.type.Label(value = "images")
   private java.util.List<com.crossvale.common.Image> images;

   public TransactionMetadata()
   {
   }

   public java.lang.String getNarrative()
   {
      return this.narrative;
   }

   public void setNarrative(java.lang.String narrative)
   {
      this.narrative = narrative;
   }

   public java.util.List<com.crossvale.common.Tag> getComments()
   {
      return this.comments;
   }

   public void setComments(java.util.List<com.crossvale.common.Tag> comments)
   {
      this.comments = comments;
   }

   public java.util.List<com.crossvale.common.Tag> getTags()
   {
      return this.tags;
   }

   public void setTags(java.util.List<com.crossvale.common.Tag> tags)
   {
      this.tags = tags;
   }

   public com.crossvale.common.Location getWhere()
   {
      return this.where;
   }

   public void setWhere(com.crossvale.common.Location where)
   {
      this.where = where;
   }

   public java.util.List<com.crossvale.common.Image> getImages()
   {
      return this.images;
   }

   public void setImages(java.util.List<com.crossvale.common.Image> images)
   {
      this.images = images;
   }

   public TransactionMetadata(java.lang.String narrative,
         java.util.List<com.crossvale.common.Tag> comments,
         java.util.List<com.crossvale.common.Tag> tags,
         com.crossvale.common.Location where,
         java.util.List<com.crossvale.common.Image> images)
   {
      this.narrative = narrative;
      this.comments = comments;
      this.tags = tags;
      this.where = where;
      this.images = images;
   }

}