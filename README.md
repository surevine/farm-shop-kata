# Farm Shop

Hi and welcome to the Farm Shop.

As you know, we are a small rural business with a prime location. We buy and sell only 
the finest local produce. Unfortunately, our goods are constantly degrading in quality 
as they approach their sell by date.

We have a system in place that updates our inventory for us. Your task is to add the 
new feature to our system so that we can begin selling a new category of items.

## The system as it stands

First an introduction to our system:

  - All items have a sell-in value which denotes the number of days we have to
    sell the item

  - All items have a quality value which denotes how valuable the item is

  - At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

  - Once the sell by date has passed, quality degrades twice as fast

  - The quality of an item is never negative

  - "Local Wine" actually increases in quality the older it gets

  - The quality of an item is never more than 50

  - "Morello Cherry Jam", being a preservative, never has to be sold or decreases in
    quality

  - "Harvest Festival Tickets", also increase in quality as their sell-in
    value approaches; quality increases by 2 when there are 10 days or less
    and by 3 when there are 5 days or less but quality drops to 0 after the
    festival

## New requirements

We have recently signed a supplier of perishable items. This requires an update
to our system:

  - "Perishable" items degrade in quality twice as fast as normal items

Feel free to make any changes to the update-quality method and add any new code
as long as everything still works correctly. However, do not alter the Item
class.

Just for clarification, an item can never have its quality increase above 50,
however "Morello Cherry Jam" quality is 80 and it never alters.
