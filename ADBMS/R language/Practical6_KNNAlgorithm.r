# Aim: To implement the K-Nearest Neighbors(KNN) classification algorithm in R using the built-in iris dataset and evaluate its performance using a confusion matrix.
# Iris is a predefined dataset in R Studio

# Introduction to KNN (K-Nearest Neighbors)
# K-Nearest Neighbors (KNN) is a supervised machine learning algorithm used for classification and regression.
# In KNN:
# The model does not learn explicitly during training
# It stores the training data

# When a new data point is given, it:
#   Calculates the distance to all training points
#   Selects the K nearest neighbors
#   Assigns the class based on majority voting

# KNN works best when:
# Data is normalized
# A proper value of K is chosen

# -------------------------------------------------------
# Step 1: Load the iris dataset
# -------------------------------------------------------
# The built-in iris dataset contains 150 samples of flowers
# with 4 numeric features and 1 categorical class label
iris_dataset <- iris

# -------------------------------------------------------
# Step 2: Shuffle the dataset randomly
# -------------------------------------------------------
# Shuffling is important because the iris dataset is originally ordered by species
shuffle_iris <- iris_dataset[sample(nrow(iris_dataset)), ]    # here nrow(irisDataset) counts the number of row in irisDataset and sample() pick the random number 

# Display shuffled dataset
shuffle_iris

# -------------------------------------------------------
# Step 3: Define a normalization function
# -------------------------------------------------------
# KNN is distance-based, so normalization ensures that
# all features contribute equally to distance calculation
# This function scales values between 0 and 1

# it will take a single column as x and minus each value with minimum of that column then divides with maximum minus minimum of that column
normalize <- function(x){return((x - min(x)) / (max(x) - min(x)))}

# -------------------------------------------------------
# Step 4: Normalize only numeric columns (features)
# -------------------------------------------------------
# Columns 1 to 4 are numeric features
# lapply :- applies the normalize function column-wise
# shuffle_iris[c(1, 2, 3, 4)] :- it will take first 4 columns as they have numeric vaues
# as.data.frame() :- it will convert result into data frame
iris_n <- as.data.frame(lapply(shuffle_iris[c(1, 2, 3, 4)], normalize))

# Display normalized data
iris_n

# -------------------------------------------------------
# Step 5: Split the dataset into training and testing data
# -------------------------------------------------------
# First 130 rows are used for training
# Remaining 20 rows are used for testing
iris_train <- iris_n[1:130, ]
iris_test <- iris_n[131: 150, ]

# -------------------------------------------------------
# Step 6: Extract the class labels (Species)
# -------------------------------------------------------
# Column 5 contains the target variable (Species)
iris_train_species <- shuffle_iris[1:130, 5]
iris_test_species <- shuffle_iris[131:150, 5]

# -------------------------------------------------------
# Step 7: Apply the KNN algorithm
# -------------------------------------------------------
# k = 13 means classification is based on the 13 nearest neighbors
# The knn() function predicts the class labels
model <- knn(train = iris_train, test = iris_test, cl = iris_train_species, k = 13)

# Display predicted classes
model

# -------------------------------------------------------
# Step 8: Evaluate the model using a confusion matrix
# -------------------------------------------------------
# Compares actual class labels with predicted labels
table(iris_test_species, model)    # iris_original_test is the original data and model is the predicted data