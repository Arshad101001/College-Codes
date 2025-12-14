# Aim: To implement the Naive Bayes classification algorithm using the Iris dataset and predict the species of flowers based on their measurements.

# Iris is a predefined dataset in R Studio

# Loading the data into a variable
irisDataset <- iris

# Randomly shuffle the dataset rows This helps avoid bias while splitting training and testing data
irisData <- irisDataset[sample(nrow(irisDataset)), ]    # here nrow(irisDataset) counts the number of row in irisDataset and sample() pick the random number 

# Create training dataset (first 120 observations) These data are used to train the Naive Bayes model
irisTrain <- irisData[1:120, ]
print(irisTrain)

# Create testing dataset (remaining 30 observations) These data are used to test the model performance
irisTest <- irisData[121:150, ]
print(irisTest)

# Install the e1071 package (needed for Naive Bayes algorithm)
install.packages("e1071")

# Load the e1071 package
library(e1071)

# Train the Naive Bayes model using training data
# Species is the target variable and '.' means all other columns are predictors
model <- naiveBayes(Species ~ ., data = irisTrain)     # Species ~ (Depends on) . (all other variable)

# Display the trained model
model

# ---------------Output-----------------
# A-priori probabilities:
# Y
#     setosa versicolor  virginica    #   probabilities of occuring
#  0.3333333  0.3083333  0.3583333 

# Conditional probabilities:
#             Sepal.Length
# Y                [,1]      [,2]         # [,1] is Mean (average)   [,2] is Standard Deviation
#   setosa     5.020000 0.3420901
#   versicolor 5.986486 0.5498293
#   virginica  6.648837 0.6551525

#             Sepal.Width
# Y                [,1]      [,2]         # [,1] is Mean (average)   [,2] is Standard Deviation
#   setosa     3.445000 0.3842742
#   versicolor 2.775676 0.3394484
#   virginica  3.011628 0.3238234

#             Petal.Length
# Y                [,1]      [,2]         # [,1] is Mean (average)   [,2] is Standard Deviation
#   setosa     1.452500 0.1663908
#   versicolor 4.272973 0.4723750
#   virginica  5.604651 0.5644017

#             Petal.Width
# Y                [,1]      [,2]         # [,1] is Mean (average)   [,2] is Standard Deviation
#   setosa     0.240000 0.1007663
#   versicolor 1.329730 0.2079862
#   virginica  2.030233 0.2907584


# ---------------Prediction-------------------
# Predict species for the test dataset
predictedData <- predict(model, irisTest)       #  it takes each row from irisTest, compares its column values with the trained model, and predicts the species of the flower. 

# Display predicted species
predictedData

# Create a confusion matrix to compare predicted and actual species
table(prediction = predictedData, actual = irisTest$Species)








