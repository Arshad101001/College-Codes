# Aim: To study how weight depends on more than one variable (height and age) using multiple linear regression in R.

# Simple Linear Regression → 1 input variable
# Example: Weight depends on Height

# Multiple Linear Regression → 2 or more input variables
# Example: Weight depends on Height AND Age

# --------------------------------------------------------
# Height of people in cm
height <- c(150, 155, 160, 165, 170, 175, 180)

# Age of people in years
age <- c(20, 22, 25, 27, 30, 32, 35)

# Weight of people in kg
weight <- c(50, 53, 56, 60, 65, 68, 72)

# Here: Height and Age → independent variables Weight → dependent variable

# Combine all variables into one data frame
data <- data.frame(height, age, weight)

# Display the dataset
print(data)

# Create multiple linear regression model
model <- lm(weight ~ height + age, data = data)     # weight ~ (depends on) height + age
print(model)

# --------output----------
# Call:
# lm(formula = weight ~ height + age, data = data)

# Coefficients:
# (Intercept)       height          age  
#    -17.1667       0.3333       0.8333

# intercet value shows value of weight when height and age will be zero (not realistic, but needed for math)
# height value Tells how much weight changes when height increases by 1 cm e.x (height = 0.3333 means weight increases by 0.3333 kg per cm )
# age value Tells how much weight changes when age increases by 1 year e.x (age = 0.8333 means weight increases by 0.8333 kg per year)




# ---------------Prediction-------------------
# Create new data for prediction
new_person <- data.frame(height = 168, age = 28)

# Predict weight
predict(model, new_person)


# Formula will be y = ((M1 * X1) + (M2 * X2)) + C  (where M1 and M2 are estimated Height and Age, X1 and X2 are new Height and Age)

# Predicting weight using formula
model$coefficients[[1]] + (model$coefficients[[2]] * 168) + (model$coefficients[[3]] * 28)