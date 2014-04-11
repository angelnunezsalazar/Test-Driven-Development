Secure Password

Description:
- Passwords must be at least 6 characters long 
- Passwords must contain at least one letter, one number, and one symbol.
					 
Scenario:  Valid Password
Given no accounts
When create an account luis with password p@ssw0rd
Then the account should be created

Scenario:  Invalid Password
Given no accounts
When create an account [user] with password [password|
Then the account should not be created

Examples:
|user|password|
|luis|pass|
|luis|p@ssword|