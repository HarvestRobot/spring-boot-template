# Bank accounts and cards management

## This service has the following API calls

### GET /account/{accountId}/summary
get all the movements an account (accountId) has, searching by their type (movementTypeId)
### POST /account/{accountId}/operation/withdraw
withdraw money from an account, given its id (accountId)
### POST /account/{accountId}/operation/save
save money from an account, given its id (accountId)
### POST /account/{accountId}/operation/transfer
transfer money from an account (accountId) to another account (toAccountId)
### POST /card/{cardId}/activate
activate a card (cardId)
### POST /card/{cardId}/security/pinCode
operations related to the pincode of a card
### GET /card/{cardId}/security/configuration
get the configuration of a card (cardId)
### PATCH /card/{cardId}/security/configuration
change the configuration of a card (cardId)