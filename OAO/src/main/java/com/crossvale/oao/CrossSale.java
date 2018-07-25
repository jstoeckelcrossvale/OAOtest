package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("crossale")
public class Crossale implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("customerType")
   private java.lang.String customerType;
   @org.kie.api.definition.type.Label("creditScore")
   private java.lang.Integer creditScore;

   @org.kie.api.definition.type.Label("creditCard")
   private String creditCard;

   @org.kie.api.definition.type.Label("loan")
   private java.lang.String loan;

   @org.kie.api.definition.type.Label("rating")
   private java.lang.String rating;

   @org.kie.api.definition.type.Label("savingsFlag")
   private java.lang.Boolean savingsFlag;

   @org.kie.api.definition.type.Label("checkingFlag")
   private java.lang.Boolean checkingFlag;

   @org.kie.api.definition.type.Label("loanFlag")
   private java.lang.Boolean loanFlag;

   @org.kie.api.definition.type.Label("creditCardFlag")
   private java.lang.Boolean creditCardFlag;

   @org.kie.api.definition.type.Label("checking")
   private java.lang.String checking;

   @org.kie.api.definition.type.Label("savings")
   private java.lang.String savings;

   public Crossale()
   {
   }

   public java.lang.String getCustomerType()
   {
      return this.customerType;
   }

   public void setCustomerType(java.lang.String customerType)
   {
      this.customerType = customerType;
   }

   public java.lang.Integer getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(java.lang.Integer creditScore)
   {
      this.creditScore = creditScore;
   }

   public java.lang.String getCreditCard()
   {
      return this.creditCard;
   }

   public void setCreditCard(java.lang.String creditCard)
   {
      this.creditCard = creditCard;
   }

   public java.lang.String getLoan()
   {
      return this.loan;
   }

   public void setLoan(java.lang.String loan)
   {
      this.loan = loan;
   }

   public java.lang.String getRating()
   {
      return this.rating;
   }

   public void setRating(java.lang.String rating)
   {
      this.rating = rating;
   }

   public java.lang.Boolean getSavingsFlag()
   {
      return this.savingsFlag;
   }

   public void setSavingsFlag(java.lang.Boolean savingsFlag)
   {
      this.savingsFlag = savingsFlag;
   }

   public java.lang.Boolean getCheckingFlag()
   {
      return this.checkingFlag;
   }

   public void setCheckingFlag(java.lang.Boolean checkingFlag)
   {
      this.checkingFlag = checkingFlag;
   }

   public java.lang.Boolean getLoanFlag()
   {
      return this.loanFlag;
   }

   public void setLoanFlag(java.lang.Boolean loanFlag)
   {
      this.loanFlag = loanFlag;
   }

   public java.lang.Boolean getCreditCardFlag()
   {
      return this.creditCardFlag;
   }

   public void setCreditCardFlag(java.lang.Boolean creditCardFlag)
   {
      this.creditCardFlag = creditCardFlag;
   }

   public java.lang.String getChecking()
   {
      return this.checking;
   }

   public void setChecking(java.lang.String checking)
   {
      this.checking = checking;
   }

   public java.lang.String getSavings()
   {
      return this.savings;
   }

   public void setSavings(java.lang.String savings)
   {
      this.savings = savings;
   }

   public Crossale(java.lang.String customerType, java.lang.Integer creditScore,
         java.lang.String creditCard, java.lang.String loan,
         java.lang.String rating, java.lang.Boolean savingsFlag,
         java.lang.Boolean checkingFlag, java.lang.Boolean loanFlag,
         java.lang.Boolean creditCardFlag, java.lang.String checking,
         java.lang.String savings)
   {
      this.customerType = customerType;
      this.creditScore = creditScore;
      this.creditCard = creditCard;
      this.loan = loan;
      this.rating = rating;
      this.savingsFlag = savingsFlag;
      this.checkingFlag = checkingFlag;
      this.loanFlag = loanFlag;
      this.creditCardFlag = creditCardFlag;
      this.checking = checking;
      this.savings = savings;
   }

}