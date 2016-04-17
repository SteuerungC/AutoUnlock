# Note: This Project is just experimental
### AutoUnlock
Experimental Login/Unlock System with simple machine learning

#### Regular expressions
Regular Expressions in a special language are needed to tell the parser how an input sentence will be accepted.
- *1 or 99*: Words from the database's words-table
- *[1,56,21]*: Array of diffrent words from the words-table
- *#*: Any word
- */*: Any or no word
- *: Varius amount of any words
- *"This is a test"*: Placehoder for complete expressions

Every part of an Expression needs to divided with a space
An example for valid expressions:

``` # [1,2,3] / "," # [1,2,3] * ``` 
