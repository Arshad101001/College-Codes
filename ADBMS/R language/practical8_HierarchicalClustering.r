# Aim: To perform hierarchical clustering on a dataset using numerical features, compute distances between data points, and visualize the resulting clusters using a dendrogram.

# -------------------------------------------------------
# Hierarchical Clustering Example - Small Dataset
# -------------------------------------------------------

# Step 1: Check current working directory
# -------------------------------------------------------
# getwd() shows where R is currently looking for files
getwd()     # this line checks the current working directory
# This is important to ensure your dataset.csv is in this folder

# Step 2: Read dataset
# -------------------------------------------------------
# Reading the CSV file into a data frame
dt <- read.csv("dataset.csv")
dt
# Output:
#   Name sb1 sb2
# 1   aa   2   3
# 2   bb   5   2
# 3   cc   5   3
# 4   dd   1   4
# 5   ee   4   5

# Step 3: Select only numerical columns
# -------------------------------------------------------
# Hierarchical clustering works only on numeric data So we drop non-numeric column 'Name'
dt <- dt[2:3]
dt

# Step 4: Scale the data
# -------------------------------------------------------
# Scaling standardizes features (mean=0, sd=1)
# This ensures features contribute equally to distance
dt <- scale(dt)
dt


# Step 5: Compute distance matrix
# -------------------------------------------------------
# Compute pairwise distances between rows (Euclidean by default)
# Each value represents the distance between two points
fdt <- dist(dt)
fdt


# Step 6: Apply hierarchical clustering
# -------------------------------------------------------
# hclust() performs clustering based on the distance matrix
# method = "complete" means complete linkage:
# distance between clusters = maximum distance between points in clusters
hcrl <- hclust(fdt, method = "complete")
hcrl


# Step 7: Plot dendrogram
# -------------------------------------------------------
# Visual representation of hierarchical clustering
# Each merge is represented as a horizontal line
plot(hcrl)
# The lower the line, the closer the points are merged

# Step 8: Optional: color the dendrogram
# -------------------------------------------------------
# col = c(3) sets color for branches (3 = green in R)
plot(hcrl, col = c(3))

# --------------------------------------------------------Hierarchical Clustering with iris dataset--------------------------------------------------------------

# -------------------------------------------------------
# Hierarchical Clustering Example - Iris Dataset
# -------------------------------------------------------

# Step 1: Select only numeric features (exclude Species)
iris_features <- iris[, 1:4]  # Sepal.Length, Sepal.Width, Petal.Length, Petal.Width

# Step 2: Scale the data
iris_scaled <- scale(iris_features)
iris_scaled  # Standardized values

# Step 3: Compute distance matrix
iris_dist <- dist(iris_scaled)  # Euclidean distance between flowers
iris_dist  # Display distance matrix

# Step 4: Apply hierarchical clustering
iris_hc <- hclust(iris_dist, method = "complete")  # Complete linkage
# Alternative: method = "ward.D2" for more compact clusters

# Step 5: Plot dendrogram
plot(iris_hc, main="Dendrogram - Iris Dataset")  # Visual representation

# Step 6: Optional: Cut tree to form clusters
iris_clusters <- cutree(iris_hc, k = 3)  # Cut dendrogram into 3 clusters

# Step 7: Compare clusters with actual species
table(Actual_Species = iris$Species, Cluster_Assigned = iris_clusters)