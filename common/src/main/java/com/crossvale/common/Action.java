package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Action implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "actionNumber")
   private java.lang.String actionNumber;
   @org.kie.api.definition.type.Label(value = "actionTime")
   private java.lang.String actionTime;
   @org.kie.api.definition.type.Label(value = "ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label(value = "actionCode")
   private java.lang.String actionCode;
   @org.kie.api.definition.type.Label(value = "globalId")
   private java.lang.String globalId;
   @org.kie.api.definition.type.Label(value = "narrative")
   private java.lang.String narrative;
   @org.kie.api.definition.type.Label(value = "statusFlag")
   private java.lang.String statusFlag;
   @org.kie.api.definition.type.Label(value = "assignTo")
   private com.crossvale.common.AssignTo assignTo;
   @org.kie.api.definition.type.Label(value = "level")
   private com.crossvale.common.CodeValue level;
   @org.kie.api.definition.type.Label(value = "type")
   private com.crossvale.common.CodeValue type;
   @org.kie.api.definition.type.Label(value = "paramList")
   private com.crossvale.common.KeyValueParam paramList;
   @org.kie.api.definition.type.Label(value = "taskNumber")
   private java.lang.String taskNumber;

   public Action()
   {
   }

   public java.lang.String getActionNumber()
   {
      return this.actionNumber;
   }

   public void setActionNumber(java.lang.String actionNumber)
   {
      this.actionNumber = actionNumber;
   }

   public java.lang.String getActionTime()
   {
      return this.actionTime;
   }

   public void setActionTime(java.lang.String actionTime)
   {
      this.actionTime = actionTime;
   }

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public java.lang.String getActionCode()
   {
      return this.actionCode;
   }

   public void setActionCode(java.lang.String actionCode)
   {
      this.actionCode = actionCode;
   }

   public java.lang.String getGlobalId()
   {
      return this.globalId;
   }

   public void setGlobalId(java.lang.String globalId)
   {
      this.globalId = globalId;
   }

   public java.lang.String getNarrative()
   {
      return this.narrative;
   }

   public void setNarrative(java.lang.String narrative)
   {
      this.narrative = narrative;
   }

   public java.lang.String getStatusFlag()
   {
      return this.statusFlag;
   }

   public void setStatusFlag(java.lang.String statusFlag)
   {
      this.statusFlag = statusFlag;
   }

   public com.crossvale.common.AssignTo getAssignTo()
   {
      return this.assignTo;
   }

   public void setAssignTo(com.crossvale.common.AssignTo assignTo)
   {
      this.assignTo = assignTo;
   }

   public com.crossvale.common.CodeValue getLevel()
   {
      return this.level;
   }

   public void setLevel(com.crossvale.common.CodeValue level)
   {
      this.level = level;
   }

   public com.crossvale.common.CodeValue getType()
   {
      return this.type;
   }

   public void setType(com.crossvale.common.CodeValue type)
   {
      this.type = type;
   }

   public com.crossvale.common.KeyValueParam getParamList()
   {
      return this.paramList;
   }

   public void setParamList(com.crossvale.common.KeyValueParam paramList)
   {
      this.paramList = paramList;
   }

   public java.lang.String getTaskNumber()
   {
      return this.taskNumber;
   }

   public void setTaskNumber(java.lang.String taskNumber)
   {
      this.taskNumber = taskNumber;
   }

   public Action(java.lang.String actionNumber, java.lang.String actionTime,
         java.lang.String ticketNumber, java.lang.String actionCode,
         java.lang.String globalId, java.lang.String narrative,
         java.lang.String statusFlag,
         com.crossvale.common.AssignTo assignTo,
         com.crossvale.common.CodeValue level,
         com.crossvale.common.CodeValue type,
         com.crossvale.common.KeyValueParam paramList,
         java.lang.String taskNumber)
   {
      this.actionNumber = actionNumber;
      this.actionTime = actionTime;
      this.ticketNumber = ticketNumber;
      this.actionCode = actionCode;
      this.globalId = globalId;
      this.narrative = narrative;
      this.statusFlag = statusFlag;
      this.assignTo = assignTo;
      this.level = level;
      this.type = type;
      this.paramList = paramList;
      this.taskNumber = taskNumber;
   }

}