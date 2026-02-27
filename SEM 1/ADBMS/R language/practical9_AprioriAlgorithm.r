
# Aim: To analyze a dataset using the Apriori algorithm and discover interesting association rules that reveal relationships and patterns between different attributes in the data.

# ----------------------------------Recomended way--------------------------------------

# -------------------------------------------------------
# Step 1: Load the required package
# -------------------------------------------------------
# The arules package provides functions for association rule mining using the Apriori algorithm
install.packages("arules")      # run only once
library(arules)

# -------------------------------------------------------
# Step 2: Load the dataset
# -------------------------------------------------------
# Read the CSV file containing transaction data
# Each row represents a transaction
# Each column represents an item (I1 to I5)
# Values are YES (item present) or NO (item absent)
dat <- read.csv("example.csv")

# View the dataset
dat

# Output
#   I1  I2  I3  I4  I5
#  YES YES  NO  NO YES
#   NO YES  NO YES  NO
#   NO YES YES  NO  NO
#  YES YES  NO YES  NO
#  YES  NO YES  NO  NO
#   NO YES YES  NO  NO
#  YES  NO YES  NO  NO
#  YES YES YES  NO YES
#  YES YES YES  NO  NO


# -------------------------------------------------------
# Step 3: Check the dimensions of the dataset
# -------------------------------------------------------
# This shows number of transactions (rows) and number of items (columns)
dim(dat)


# -------------------------------------------------------
# Step 4: Convert YES/NO values to logical values
# -------------------------------------------------------
# Apriori requires item presence information
# YES is converted to TRUE (item present)
# NO is converted to FALSE (item absent)
dat_logical <- dat == "YES"

# View logical dataset
dat_logical


# -------------------------------------------------------
# Step 5: Convert logical data into transactions
# -------------------------------------------------------
# The apriori() function works on transaction objects
# This conversion ensures only TRUE values are treated as items
trans <- as(dat_logical, "transactions")

# Inspect the transaction data
inspect(trans)

# -------------------------------------------------------
# Step 6: Apply Apriori algorithm with default parameters
# -------------------------------------------------------
# Default values:
# support = 0.1
# confidence = 0.8
# minlen = 1
rules_default <- apriori(trans)

# View generated rules
inspect(rules_default)


# -------------------------------------------------------
# Step 7: Apply Apriori with custom support and confidence
# -------------------------------------------------------
# supp = 0.25 means the itemset must appear in at least 25% of the transactions
# conf = 0.7 means the rule must be at least 70% confident
rules_custom <- apriori(
  trans,
  parameter = list(
    supp = 0.25,
    conf = 0.7
  )
)

# Inspect filtered rules
inspect(rules_custom)


# -------------------------------------------------------
# Step 8: Restrict rule length using minlen and maxlen
# -------------------------------------------------------
# minlen = 2 removes rules with empty LHS {}
# maxlen = 5 limits the maximum number of items in a rule
rules_final <- apriori(
  trans,
  parameter = list(
    supp = 0.25,
    conf = 0.7,
    minlen = 2,
    maxlen = 5
  )
)

# Inspect the final set of association rules
inspect(rules_final)




# -------------------------------------College method (Simple way)---------------------------------

# -------------------------------------------------------
# Step 1: Load the required package
# -------------------------------------------------------
# The arules package provides functions for association rule mining using the Apriori algorithm
install.packages("arules")      # run only once
library(arules)

# -------------------------------------------------------
# Step 2: Load the dataset
# -------------------------------------------------------
# Read the CSV file containing transaction data
# Each row represents a transaction
# Each column represents an item (I1 to I5)
# Values are YES (item present) or NO (item absent)
dat <- read.csv("example.csv")

# View the dataset
dat

# Output
#   I1  I2  I3  I4  I5
#  YES YES  NO  NO YES
#   NO YES  NO YES  NO
#   NO YES YES  NO  NO
#  YES YES  NO YES  NO
#  YES  NO YES  NO  NO
#   NO YES YES  NO  NO
#  YES  NO YES  NO  NO
#  YES YES YES  NO YES
#  YES YES YES  NO  NO


# -------------------------------------------------------
# Step 3: Check the dimensions of the dataset (Optional)
# -------------------------------------------------------
# This shows number of transactions (rows) and number of items (columns)
dim(dat)

# -------------------------------------------------------
# Step 4: view the dataset (Optional)
# -------------------------------------------------------
# This shows data
View(dat)

# -------------------------------------------------------
# Step 5: Apply Apriori algorithm with default parameters
# -------------------------------------------------------
# Default values:
# support = 0.1
# confidence = 0.8
# minlen = 1
rules <- apriori(dat)

# View generated rules
inspect(rules)

# -------------------------------------------------------
# Step 6: Apply Apriori with custom support and confidence
# -------------------------------------------------------
# supp = 0.25 means the itemset must appear in at least 25% of the transactions
# conf = 0.7 means the rule must be at least 70% confident
rules <- apriori(dat, parameter = list(supp = 0.25, conf = 0.7))

# View generated rules
inspect(rules)

# -------------------------------------------------------
# Step 7: Restrict rule length using minlen and maxlen
# -------------------------------------------------------
# minlen = 2 removes rules with empty LHS {}
# maxlen = 5 limits the maximum number of items in a rule
rules <- apriori(dat, parameter = list(minlen = 2, maxlen = 5, supp = 0.25, conf = 0.7))

# View generated rules
inspect(rules)








# ----------------------different data------------------------

# -------------------------------------------------------
# Step 1: Read the dataset
# -------------------------------------------------------
# The dataset has two columns:
# trans_id -> numeric transaction ID
# item.sets -> a string of items separated by commas
dat <- read.csv("ex.csv")  # reading CSV file
dat
# Output
#   trans_id          item.sets
#      1          Bag, uniform, crayons
#      2          Book, Bag, uniform
#      3        Bag, uniform, pencil
#      4          Bag, pencil, book
#      5       Uniform, crayons, Bag
#      6          Bag, pencil, book
#      7       Crayons, uniform, bag
#      8          Book, crayons, Bag
#      9      Uniform, crayons, Pencil
#     10       Pencil, uniform, book


# -------------------------------------------------------
# Step 2: Apply apriori directly (not recommended)
# -------------------------------------------------------
rules <- apriori(dat)

# View generated rules
inspect(rules)

# -------------------------------------------------------
# Step 3: Apply apriori with custom support and confidence
# -------------------------------------------------------
# 1
rules <- apriori(dat, parameter = list(supp = 0.25, conf = 0.7))
# Warning remains the same
# No rules found because the support threshold is too high and apriori is still misinterpreting data
# View generated rules
inspect(rules)

# 2
rules <- apriori(dat, parameter = list(supp = 0.11, conf = 0.8))
# A single rule appears, but still incorrect because of how the data is treated
inspect(rules)

# 3
rules <- apriori(dat, parameter = list(supp = 0.10, conf = 0.8))
# Multiple rules appear, but they are still using full strings instead of individual items
inspect(rules)