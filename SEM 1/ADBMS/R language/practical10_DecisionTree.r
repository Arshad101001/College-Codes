# Aim: To build and visualize a Decision Tree model for classification using the iris dataset.

# -------------------------------------------------------
# Implementation of Decision Tree (DT)
# -------------------------------------------------------

# -------------------------------------------------------
# Step 1: Load the iris dataset
# -------------------------------------------------------
# The iris dataset is a built-in dataset in R
# It contains 150 observations and 5 columns
# (4 numeric features and 1 categorical species column)
ird <- iris

# Display the dataset
ird

# -------------------------------------------------------
# Step 2: Shuffle the dataset randomly
# -------------------------------------------------------
shuffle_data <- ird[sample(nrow(ird)), ]

# Display shuffled dataset
shuffle_data

# -------------------------------------------------------
# Step 3: Split the dataset into training and testing data
# -------------------------------------------------------
# First 100 rows are used for training
# Remaining 50 rows are used for testing

# Training data (100 records)
iris_train <- shuffle_data[1:100, ]

# Testing data (remaining 50 records)
iris_test <- shuffle_data[101: 150, ]

# Check dimensions
dim(iris_train)
dim(iris_test)

# -------------------------------------------------------
# Step 4: Install and load required packages
# -------------------------------------------------------

install.packages("rpart")
install.packages("rpart.plot")

library(rpart)
library(rpart.plot)

# -------------------------------------------------------
# Step 5: Create Decision Tree model
# -------------------------------------------------------

# Species is the target variable, All other attributes are predictors
model <- rpart(Species ~ ., data = iris_train, method = "class")

# Display model details
print(model)

# -------------------------------------------------------
# Step 6: Visualize the Decision Tree
# -------------------------------------------------------

# Different tree visualizations
rpart.plot(model, type = 0, extra = 102)
rpart.plot(model, type = 1, extra = 102)
rpart.plot(model, type = 2, extra = 102)
rpart.plot(model, type = 3, extra = 102)
rpart.plot(model, type = 4, extra = 104)

# -------------------------------------------------------
# Step 7: Predict on Test Data (optional analysis step)
# -------------------------------------------------------

# Predict species for test dataset
predicted <- predict(model, iris_test, type = "class")

# Create confusion matrix
table(Actual = iris_test$Species, Predicted = predicted)