# Vitamin-K-Recipes-Tracker
Vitamin K Recipes &amp; Tracker Android App for the Technica 2020 Hackathon

# Inspiration
This past summer one of our teammates had a heart surgery that went longer than expected.  During the surgery her blood clotted, and the clots traveled to her lungs.  To save her life, she was placed on a medication called Warfarin.

Warfarin is a blood-thinning medication commonly used to treat blood clots and prevent stroke in people with heart arrhythmias or artificial valves.  Warfarin decreases blood clotting by blocking an enzyme called vitamin K epoxide reductase that reactivates vitamin K1. [Warfarin is the most commonly prescribed and affordable blood thinner](https://www.nhs.uk/conditions/anticoagulants/). 

**Patients who are taking Warfarin have to keep their intake of Vitamin K the same each day.** The provider can adjust the dose to allow for any Vitamin K amount, but the intake must be consistent. Too much Vitamin K will block Warfarin's blood-thinning effects, leading to clots, whereas too little may cause the blood to become overly thin and trigger internal bleeding.

**Manually tracking daily vitamin K intake and keeping it the same each day is burdensome and often error-prone.** Most nutrition, recipe, and diet apps do not include an easy way to view and track vitamin K.

The question our team tried to answer is **“How can we make it easier for patients who are taking Warfarin to expand their horizons and spend less time tracking vitamin K or worrying about what they eat while still staying safe?”**

Our answer was to create the Vitamin K Recipes and Tracker android mobile application.



# What it Does

Vitamin K Recipes and Tracker is an android app that helps users to keep their daily intake of Vitamin K consistent.  

It calculates the [Vitamin K (Dihydrophylloquinone) Content ](https://www.uofmhealth.org/health-library/abo1632#:~:text=To%20ensure%20that%20warfarin%20is,your%20blood%20clot%20more%20slowly.) in a recipe with one or more ingredients after fetching and summing the vitamin K content of the individual ingredients of the recipe from the [Edamam Nutrition API](https://developer.edamam.com/edamam-docs-nutrition-api).

It then updates then displays a daily total based on the sum of recipe totals, along with a weekly average based on the 7 previous daily totals. 
By displaying the previous day total simultaneously with the weekly average, the User can easily adjust their consumption to keep their vitamin K intake relatively uniform over time. 


## Most Important Goals

### Recipe Edit Activity
- [ ] User can view/ Edit recipe name
- [ ] User can view/edit recipe photo
- [ ] User can see recipe and vitamin K total
- [ ] User can see the total update as ingredients are added or removed
- [ ] User can add, & remove ingredients
- [ ] User can view and edit recipe directions
- [ ] User can navigate to the Daily Journal screen

### Daily Journal Activity
- [ ] User can see daily Vitamin K count (sum of recipes for a day)
- [ ] User can see weekly average
- [ ] User can see the previous day's count
- [ ] User can see and compare the daily vitamin K count, weekly average, and previous day's count
- [ ] User can add or delete recipes from the daily total
- [ ] User can select and navigate to a specific recipe edit screen
- [ ] User can save the entire day
- [ ] User can delete the whole day

## Stretch Goals

### Login Activity
- [ ] User can sign into the app using a username and password 

### Home Activity
- [ ] User sees a welcome message
- [ ] User can navigate to the Daily Journal screen
- [ ] User can navigate to the recipe search screen
- [ ] User can navigate to the weekly totals and averages screen


### Week Totals and Averages Activity
- [ ] User sees a list of daily totals for a rolling week
- [ ] User can select a day and go to its journal/ total screen
- [ ] User can navigate to the Home screen
- [ ] User can navigate to the Daily Journal Screen

### Recipe Search Activity
- [ ] User can search recipes using the [Edamam Recipe Search API](https://developer.edamam.com/edamam-docs-recipe-api)
- [ ] User can select a recipe and go to its recipe edit page
- [ ] User can scroll through the results from the API
- [ ] User can return to Daily Journal screen
- [ ] User can return to Recipe Search screen






