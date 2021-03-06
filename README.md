# My Personal Project

## Food Managing

***Why this project is of interest to me?***

Cooking for yourself can save you a lot of money, 
but for those who don't have extensive cooking and food shopping experience, 
managing food could be a huge problem. Every food has a different storage condition and expiration date. 
If food is not managed, it is likely to be wasted. 
So I want to develop an application that can save energy and time in this matter.

***What will the application do?***

Whenever new food is purchased, users can record its price, storage conditions, expiration date, etc. 
Used food can be removed. 
To better manage the food, 
users can divide foods by storage conditions, and the time they have left until the expiration date. 
Finally, the app can calculate food costs for the month.

***Who will use it?***

Users of the app can be people who are busy and don't have much of a food budget.

## User Stories

- As a user, I want to be able to add multiple food to food storage.
- As a user, I want to be able to view the list of food in food storage.
- As a user, I want to be able to divide and view food list by different filters.
- As a user, I want to be able to view the details of the given food.
- As a user, I want to be able to remove the food from the food storage.
- As a user, I want to be able to update the days left of all food every day.
- As a user, I want to be able to save my food library to file. 
- As a user, I want to be able to be able to load my food library from file.

## Phase 4: Task 2

Test and design Food class in model package that is robust.
The setPriceAndDaysLeft method in Food class throws an exception to prevent the negative price or days left, 
and the reduceAmount method in Food class throws two exceptions to prevent the amount being negative or mismatched unit.
Then I designed four tests in FoodTest that catch these exceptions.

## Phase 4: Task 3

- To improve the cohesion, I could split each of the frame class into two classes,
one class responsible for the graphic and another one responsible for the interaction. 
  The reason for doing this is that generating graphic and interaction are two different functionalities.
  To do this, 
  - I could move the fields, and the methods related to these fields to a new class
  - I could make the frame class call the new class to generate interactive components on the screen
- To reduce coupling, 
  I could move the field foodStorage and other similar methods among all the frame classes to a new super class.
  The field foodStorage will be passed to all other frames when initializing them, 
  which duplicated the codes and made the code harder to understand.
  To do this,
  - I could create a new abstract class GeneralFrame extends JFrame, and make all other frames extend GeneralFrame
  - I could create a protected field foodStorage in GeneralFrame



