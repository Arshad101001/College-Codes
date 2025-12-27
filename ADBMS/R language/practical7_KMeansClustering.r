# Aim: To apply the K-Means clustering algorithm on the iris dataset and group the data into clusters based on feature similarity.


# -------------------------------------------------------
# Step 1: Load the iris dataset
# -------------------------------------------------------
# The iris dataset is a built-in dataset in R
# It contains 150 observations and 5 columns
# (4 numeric features and 1 categorical species column)
iris_dataset <- iris

# -------------------------------------------------------
# Step 2: Select only numeric columns
# -------------------------------------------------------
# K-means clustering works only with numeric data
# Columns 1 to 4 represent sepal and petal measurements
iris_features <- iris_dataset[, 1:4]

# -------------------------------------------------------
# Step 3: Define a normalization function
# -------------------------------------------------------
# Normalization is important so that all features contribute equally to distance calculation
# This function scales values between 0 and 1
# it will take a single column as x and minus each value with minimum of that column then divides with maximum minus minimum of that column
normalize <- function(x) {
  return((x - min(x)) / (max(x) - min(x)))
}

# -------------------------------------------------------
# Step 4: Normalize only numeric columns (features)
# -------------------------------------------------------
# lapply() :- applies the normalize() function column-wise
# as.data.frame() :- it will convert result into data frame
# it will take each column from iris_features and pass it to normalize function and make all feature values are on the same scale
iris_normalized <- as.data.frame(lapply(iris_features, normalize))

# -------------------------------------------------------
# Step 5: Load required libraries
# -------------------------------------------------------
# dplyr is used for data manipulation (not mandatory here but useful)
install.packages("dplyr")
library(dplyr)

# stats package contains the kmeans() function
# stats is usually pre-installed in R
install.packages("stats")
library(stats)


# -------------------------------------------------------
# Step 6: Apply K-Means clustering
# -------------------------------------------------------
# We choose K = 3 because the iris dataset naturally has 3 species
# nstart = 10 runs the algorithm 10 times with different random initial centroids and selects the best result
kmeans_model <- kmeans(
  iris_normalized,
  centers = 3,   # number of clusters
  nstart = 10    # runs algorithm multiple times for stability
)

# -------------------------------------------------------
# Step 7: Compare actual species with assigned clusters
# -------------------------------------------------------
# This table helps evaluate clustering performance
# Rows represent actual species
# Columns represent clusters assigned by K-means
table(Actual_Species = iris_dataset$Species, Cluster_Assigned = kmeans_model$cluster)

# -------------------------------------------------------
# Step 8: Install and load visualization libraries
# -------------------------------------------------------
# ggplot2 is used for plotting graphs
install.packages("ggplot2")
library(ggplot2)

# ggfortify provides autoplot() for easy visualization
# of K-means clustering results
install.packages("ggfortify")
library(ggfortify)

# -------------------------------------------------------
# Step 9: Visualize K-Means clusters
# -------------------------------------------------------
# autoplot() reduces multidimensional data using PCA and displays clusters in a 2D plot
# frame = TRUE draws a boundary around each cluster
autoplot(kmeans_model, iris_normalized, frame = TRUE)     # helps to visualize the clusters







