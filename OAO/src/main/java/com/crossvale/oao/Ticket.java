package com.crossvale.oao;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Ticket")
public class Ticket implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label("narrative")
   private java.lang.String narrative;
   @org.kie.api.definition.type.Label("accountNumber")
   private java.lang.String accountNumber;
   @org.kie.api.definition.type.Label("customerNumber")
   private java.lang.String customerNumber;

   @org.kie.api.definition.type.Label("customer")
   private com.crossvale.carddispute.Customer customer;

   @org.kie.api.definition.type.Label("complaintFlag")
   private java.lang.String complaintFlag;

   @org.kie.api.definition.type.Label("approvalFlag")
   private java.lang.String approvalFlag;

   @org.kie.api.definition.type.Label("securityLevelCode")
   private java.lang.String securityLevelCode;

   @org.kie.api.definition.type.Label("createdDate")
   private java.util.Date createdDate;

   @org.kie.api.definition.type.Label("receivedDate")
   private java.util.Date receivedDate;

   @org.kie.api.definition.type.Label("assignTo")
   private com.crossvale.carddispute.AssignTo assignTo;

   @org.kie.api.definition.type.Label("audit")
   private com.crossvale.carddispute.Audit audit;

   @org.kie.api.definition.type.Label("category")
   private com.crossvale.carddispute.CodeValue category;

   @org.kie.api.definition.type.Label("item")
   private com.crossvale.carddispute.CodeValue item;

   @org.kie.api.definition.type.Label("status")
   private com.crossvale.carddispute.CodeValue status;

   @org.kie.api.definition.type.Label("severity")
   private com.crossvale.carddispute.CodeValue severity;

   @org.kie.api.definition.type.Label("priority")
   private com.crossvale.carddispute.CodeValue priority;

   @org.kie.api.definition.type.Label("originator")
   private com.crossvale.carddispute.Originator originator;

   @org.kie.api.definition.type.Label("requestor")
   private com.crossvale.carddispute.Requestor requestor;

   @org.kie.api.definition.type.Label("contactMethod")
   private com.crossvale.carddispute.ContactMethod contactMethod;

   @org.kie.api.definition.type.Label("classification")
   private com.crossvale.carddispute.Classification classification;

   @org.kie.api.definition.type.Label("transactionList")
   private java.util.List<com.crossvale.carddispute.Transaction> transactionList;

   @org.kie.api.definition.type.Label("attributeList")
   private java.util.List<com.crossvale.carddispute.Attribute> attributeList;

   @org.kie.api.definition.type.Label("attachmentList")
   private java.util.List<com.crossvale.carddispute.Attachment> attachmentList;

   @org.kie.api.definition.type.Label("actionList")
   private java.util.List<com.crossvale.carddispute.Action> actionList;

   @org.kie.api.definition.type.Label("taskList")
   private java.util.List<com.crossvale.carddispute.Task> taskList;

   @org.kie.api.definition.type.Label(value = "sla")
   private java.lang.String sla;

   public Ticket()
   {
   }

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public java.lang.String getNarrative()
   {
      return this.narrative;
   }

   public void setNarrative(java.lang.String narrative)
   {
      this.narrative = narrative;
   }

   public java.lang.String getAccountNumber()
   {
      return this.accountNumber;
   }

   public void setAccountNumber(java.lang.String accountNumber)
   {
      this.accountNumber = accountNumber;
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public com.crossvale.carddispute.Customer getCustomer()
   {
      return this.customer;
   }

   public void setCustomer(com.crossvale.carddispute.Customer customer)
   {
      this.customer = customer;
   }

   public java.lang.String getComplaintFlag()
   {
      return this.complaintFlag;
   }

   public void setComplaintFlag(java.lang.String complaintFlag)
   {
      this.complaintFlag = complaintFlag;
   }

   public java.lang.String getApprovalFlag()
   {
      return this.approvalFlag;
   }

   public void setApprovalFlag(java.lang.String approvalFlag)
   {
      this.approvalFlag = approvalFlag;
   }

   public java.lang.String getSecurityLevelCode()
   {
      return this.securityLevelCode;
   }

   public void setSecurityLevelCode(java.lang.String securityLevelCode)
   {
      this.securityLevelCode = securityLevelCode;
   }

   public java.util.Date getCreatedDate()
   {
      return this.createdDate;
   }

   public void setCreatedDate(java.util.Date createdDate)
   {
      this.createdDate = createdDate;
   }

   public java.util.Date getReceivedDate()
   {
      return this.receivedDate;
   }

   public void setReceivedDate(java.util.Date receivedDate)
   {
      this.receivedDate = receivedDate;
   }

   public com.crossvale.carddispute.AssignTo getAssignTo()
   {
      return this.assignTo;
   }

   public void setAssignTo(com.crossvale.carddispute.AssignTo assignTo)
   {
      this.assignTo = assignTo;
   }

   public com.crossvale.carddispute.Audit getAudit()
   {
      return this.audit;
   }

   public void setAudit(com.crossvale.carddispute.Audit audit)
   {
      this.audit = audit;
   }

   public com.crossvale.carddispute.CodeValue getCategory()
   {
      return this.category;
   }

   public void setCategory(com.crossvale.carddispute.CodeValue category)
   {
      this.category = category;
   }

   public com.crossvale.carddispute.CodeValue getItem()
   {
      return this.item;
   }

   public void setItem(com.crossvale.carddispute.CodeValue item)
   {
      this.item = item;
   }

   public com.crossvale.carddispute.CodeValue getStatus()
   {
      return this.status;
   }

   public void setStatus(com.crossvale.carddispute.CodeValue status)
   {
      this.status = status;
   }

   public com.crossvale.carddispute.CodeValue getSeverity()
   {
      return this.severity;
   }

   public void setSeverity(com.crossvale.carddispute.CodeValue severity)
   {
      this.severity = severity;
   }

   public com.crossvale.carddispute.CodeValue getPriority()
   {
      return this.priority;
   }

   public void setPriority(com.crossvale.carddispute.CodeValue priority)
   {
      this.priority = priority;
   }

   public com.crossvale.carddispute.Originator getOriginator()
   {
      return this.originator;
   }

   public void setOriginator(com.crossvale.carddispute.Originator originator)
   {
      this.originator = originator;
   }

   public com.crossvale.carddispute.Requestor getRequestor()
   {
      return this.requestor;
   }

   public void setRequestor(com.crossvale.carddispute.Requestor requestor)
   {
      this.requestor = requestor;
   }

   public com.crossvale.carddispute.ContactMethod getContactMethod()
   {
      return this.contactMethod;
   }

   public void setContactMethod(
         com.crossvale.carddispute.ContactMethod contactMethod)
   {
      this.contactMethod = contactMethod;
   }

   public com.crossvale.carddispute.Classification getClassification()
   {
      return this.classification;
   }

   public void setClassification(
         com.crossvale.carddispute.Classification classification)
   {
      this.classification = classification;
   }

   public java.util.List<com.crossvale.carddispute.Transaction> getTransactionList()
   {
      return this.transactionList;
   }

   public void setTransactionList(
         java.util.List<com.crossvale.carddispute.Transaction> transactionList)
   {
      this.transactionList = transactionList;
   }

   public java.util.List<com.crossvale.carddispute.Attribute> getAttributeList()
   {
      return this.attributeList;
   }

   public void setAttributeList(
         java.util.List<com.crossvale.carddispute.Attribute> attributeList)
   {
      this.attributeList = attributeList;
   }

   public java.util.List<com.crossvale.carddispute.Attachment> getAttachmentList()
   {
      return this.attachmentList;
   }

   public void setAttachmentList(
         java.util.List<com.crossvale.carddispute.Attachment> attachmentList)
   {
      this.attachmentList = attachmentList;
   }

   public java.util.List<com.crossvale.carddispute.Action> getActionList()
   {
      return this.actionList;
   }

   public void setActionList(
         java.util.List<com.crossvale.carddispute.Action> actionList)
   {
      this.actionList = actionList;
   }

   public java.util.List<com.crossvale.carddispute.Task> getTaskList()
   {
      return this.taskList;
   }

   public void setTaskList(java.util.List<com.crossvale.carddispute.Task> taskList)
   {
      this.taskList = taskList;
   }

   public java.lang.String getSla()
   {
      return this.sla;
   }

   public void setSla(java.lang.String sla)
   {
      this.sla = sla;
   }

   public Ticket(java.lang.String ticketNumber, java.lang.String narrative,
         java.lang.String accountNumber, java.lang.String customerNumber,
         com.crossvale.carddispute.Customer customer,
         java.lang.String complaintFlag, java.lang.String approvalFlag,
         java.lang.String securityLevelCode, java.util.Date createdDate,
         java.util.Date receivedDate,
         com.crossvale.carddispute.AssignTo assignTo,
         com.crossvale.carddispute.Audit audit,
         com.crossvale.carddispute.CodeValue category,
         com.crossvale.carddispute.CodeValue item,
         com.crossvale.carddispute.CodeValue status,
         com.crossvale.carddispute.CodeValue severity,
         com.crossvale.carddispute.CodeValue priority,
         com.crossvale.carddispute.Originator originator,
         com.crossvale.carddispute.Requestor requestor,
         com.crossvale.carddispute.ContactMethod contactMethod,
         com.crossvale.carddispute.Classification classification,
         java.util.List<com.crossvale.carddispute.Transaction> transactionList,
         java.util.List<com.crossvale.carddispute.Attribute> attributeList,
         java.util.List<com.crossvale.carddispute.Attachment> attachmentList,
         java.util.List<com.crossvale.carddispute.Action> actionList,
         java.util.List<com.crossvale.carddispute.Task> taskList,
         java.lang.String sla)
   {
      this.ticketNumber = ticketNumber;
      this.narrative = narrative;
      this.accountNumber = accountNumber;
      this.customerNumber = customerNumber;
      this.customer = customer;
      this.complaintFlag = complaintFlag;
      this.approvalFlag = approvalFlag;
      this.securityLevelCode = securityLevelCode;
      this.createdDate = createdDate;
      this.receivedDate = receivedDate;
      this.assignTo = assignTo;
      this.audit = audit;
      this.category = category;
      this.item = item;
      this.status = status;
      this.severity = severity;
      this.priority = priority;
      this.originator = originator;
      this.requestor = requestor;
      this.contactMethod = contactMethod;
      this.classification = classification;
      this.transactionList = transactionList;
      this.attributeList = attributeList;
      this.attachmentList = attachmentList;
      this.actionList = actionList;
      this.taskList = taskList;
      this.sla = sla;
   }

}