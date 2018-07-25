package com.crossvale.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Crossale implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("creditScore")
   private java.lang.Integer creditScore;
   @org.kie.api.definition.type.Label("rating")
   private java.lang.String rating;
   @org.kie.api.definition.type.Label("hasLoan")
   private java.lang.Boolean hasLoan;
   @org.kie.api.definition.type.Label("hasCreditCard")
   private Boolean hasCreditCard;
   @org.kie.api.definition.type.Label("hasChecking")
   private java.lang.Boolean hasChecking;
   @org.kie.api.definition.type.Label("hasSavings")
   private java.lang.Boolean hasSavings;
   @org.kie.api.definition.type.Label("checkingCrossale")
   private java.lang.Boolean checkingCrossale;
   @org.kie.api.definition.type.Label("loanCrossale")
   private java.lang.Boolean loanCrossale;
   @org.kie.api.definition.type.Label("creditCardCrossale")
   private java.lang.Boolean creditCardCrossale;
   @org.kie.api.definition.type.Label("savingsCrossale")
   private java.lang.Boolean savingsCrossale;

   public Crossale()
   {
   }

   public java.lang.Integer getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(java.lang.Integer creditScore)
   {
      this.creditScore = creditScore;
   }

   public java.lang.String getRating()
   {
      return this.rating;
   }

   public void setRating(java.lang.String rating)
   {
      this.rating = rating;
   }

   public java.lang.Boolean getHasLoan()
   {
      return this.hasLoan;
   }

   public void setHasLoan(java.lang.Boolean hasLoan)
   {
      this.hasLoan = hasLoan;
   }

   public java.lang.Boolean getHasChecking()
   {
      return this.hasChecking;
   }

   public void setHasChecking(java.lang.Boolean hasChecking)
   {
      this.hasChecking = hasChecking;
   }

   public java.lang.Boolean getHasSavings()
   {
      return this.hasSavings;
   }

   public void setHasSavings(java.lang.Boolean hasSavings)
   {
      this.hasSavings = hasSavings;
   }

   public java.lang.Boolean getCheckingCrossale()
   {
      return this.checkingCrossale;
   }

   public void setCheckingCrossale(java.lang.Boolean checkingCrossale)
   {
      this.checkingCrossale = checkingCrossale;
   }

   public java.lang.Boolean getLoanCrossale()
   {
      return this.loanCrossale;
   }

   public void setLoanCrossale(java.lang.Boolean loanCrossale)
   {
      this.loanCrossale = loanCrossale;
   }

   public java.lang.Boolean getCreditCardCrossale()
   {
      return this.creditCardCrossale;
   }

   public void setCreditCardCrossale(java.lang.Boolean creditCardCrossale)
   {
      this.creditCardCrossale = creditCardCrossale;
   }

   public java.lang.Boolean getSavingsCrossale()
   {
      return this.savingsCrossale;
   }

   public void setSavingsCrossale(java.lang.Boolean savingsCrossale)
   {
      this.savingsCrossale = savingsCrossale;
   }

   public java.lang.Boolean getHasCreditCard()
   {
      return this.hasCreditCard;
   }

   public void setHasCreditCard(java.lang.Boolean hasCreditCard)
   {
      this.hasCreditCard = hasCreditCard;
   }

   public Crossale(java.lang.Integer creditScore, java.lang.String rating,
         java.lang.Boolean hasLoan, java.lang.Boolean hasCreditCard,
         java.lang.Boolean hasChecking, java.lang.Boolean hasSavings,
         java.lang.Boolean checkingCrossale, java.lang.Boolean loanCrossale,
         java.lang.Boolean creditCardCrossale, java.lang.Boolean savingsCrossale)
   {
      this.creditScore = creditScore;
      this.rating = rating;
      this.hasLoan = hasLoan;
      this.hasCreditCard = hasCreditCard;
      this.hasChecking = hasChecking;
      this.hasSavings = hasSavings;
      this.checkingCrossale = checkingCrossale;
      this.loanCrossale = loanCrossale;
      this.creditCardCrossale = creditCardCrossale;
      this.savingsCrossale = savingsCrossale;
   }

}