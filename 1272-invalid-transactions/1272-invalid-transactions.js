class Validation {
  constructor(transaction) {
    this.transaction = transaction;
  }

  // I would probably maybe create a separate calss for transactionObject, i'm kinda being lazy here.
  static getTransactionObject(transaction) {
    const transactionSplit = transaction.split(",");
    const name = transactionSplit[0];
    const time = Number(transactionSplit[1]);
    const amount = Number(transactionSplit[2]);
    const city = transactionSplit[3];

    return { name, time, amount, city };
  }

  isValid() {
    throw new Exception("Should not call abstract method");
  }
}

class LocationValidation extends Validation {
  constructor(transaction, transactions) {
    super(transaction);
    this.transactions = transactions;
  }

  // Override
  isValid() {
    const transactionObj = Validation.getTransactionObject(this.transaction);

    for (let otherTransaction of this.transactions) {
      if (this.transaction !== otherTransaction) {
        const otherTransactionObj =
          Validation.getTransactionObject(otherTransaction);

        if (
          transactionObj.name === otherTransactionObj.name &&
          Math.abs(transactionObj.time - otherTransactionObj.time) <= 60 &&
          transactionObj.city !== otherTransactionObj.city
        ) {
          return false;
        }
      }
    }

    return true;
  }
}

class AmountValidation extends Validation {
  constructor(transaction) {
    super(transaction);
  }

  // Override
  isValid() {
    const amount = Validation.getTransactionObject(this.transaction).amount;

    return amount <= 1000;
  }
}

// We don't want Validator to know how to create these validation checks
// EX: Validator shouldn't have to know that AmountValidation takes 1 variable, and LocationValidation takes in 2 variables
class ValidationFactory {
  static AMOUNT_VALIDATION = "AMOUNT_VALIDATION";
  static LOCATION_VAILDATION = "LOCATION_VAILDATION";

  static getValidation(type, transaction, transactions) {
    if (type === ValidationFactory.AMOUNT_VALIDATION)
      return new AmountValidation(transaction);
    else if (type === ValidationFactory.LOCATION_VAILDATION)
      return new LocationValidation(transaction, transactions);
  }
}

class Validator {
  constructor(validationChecks) {
    this.validationChecks = validationChecks;
  }

  isValid(transaction, transactions) {
    for (let validation of this.createValidations(transaction, transactions)) {
      if (!validation.isValid())
        // Validator simply calls isValid method, not worry about which functions to call when
        return false;
    }

    return true;
  }

  // Factory method used here b/c Validator doesn't need to know how to create these validation checks
  createValidations(transaction, transactions) {
    return this.validationChecks.map((type) =>
      ValidationFactory.getValidation(type, transaction, transactions)
    );
  }
}

// When wanting to add another validation check, create a new class extending 'Validation' and add to this list.
// Don't forget to add to the factory
const VALIDATION_CHECKS = [
  ValidationFactory.AMOUNT_VALIDATION,
  ValidationFactory.LOCATION_VAILDATION,
];

var invalidTransactions = function (
  transactions,
  validator = new Validator(VALIDATION_CHECKS)
) {
  let returnInvalidTransactions = [];

  // When adding new types of validation, there is no reasont to change this function at all.
  transactions.forEach((transaction) => {
    if (!validator.isValid(transaction, transactions))
      returnInvalidTransactions.push(transaction);
  });

  return returnInvalidTransactions;
};
