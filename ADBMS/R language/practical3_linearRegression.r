# Aim: To understand and implement Simple Linear Regression in R programming using height and weight data, and to predict weight based on a given height.


# ----------------------------------------
# SIMPLE LINEAR REGRESSION IN R
# Height vs Weight
# ----------------------------------------


# Step 1: Create height data (in ft)
height <- c(5.2, 5.5, 5.8, 6.1, 6.4, 5.1, 5.4, 6.4)

# Step 2: Create weight data (in kg)
weight <- c(64, 68, 70, 73, 76, 62, 64, 76)

# Step 3: Combine height and weight into a data frame
# (Like an Excel table)
data <- data.frame(height, weight)

# Step 4: Display the data
print(data)

# Step 5: Plot height vs weight
plot(data$height, data$weight, main = "Height vs Weight", xlab = "Height (ft)", ylab = "Weight (kg)", col = "blue")

# Step 6: Apply linear regression
# weight is predicted using height
model <- lm(weight ~ height, data = data)       # here weight is dependent on height(here data attribute is optional, pass it if you want to write better code)

# Step 7: Display summary of the model
summary(model)

# Step 8: Draw the regression line on the graph
abline(model, col = "red", lwd = 2)

# Step 9: Predict weight for a new height value
new_height <- data.frame(height = 168)
predicted_weight <- predict(model, new_height)

# Step 10: Print the predicted weight
print(predicted_weight)


# Important points
# 1. lm() is used to build model
# 2. predeict() is used to predict the new variable base on model

# NOTE:
# it uses formula i.e (y = mx + c) in this example c is intercept, m is estimated height in model, x is new height given by user

# Predicting weight using formula
predicted_weight <- model$coefficients[[1]] + model$coefficients[[2]] * 160   # here model$coefficients[[1]] is C (intercept), model$coefficients[[2]] is M (estimated height), 160 is new height

# Predicting weight using predict method
new_height <- data.frame(height = 160)
predicted_weight <- predict(model, new_height)


# both gives same result