
# -------------------------------
# PRACTICAL: DEALING WITH MISSING VALUES IN R
# -------------------------------

# -------------------------------
# Installing and loading package
# -------------------------------
install.packages("Hmisc")
library(Hmisc)

# -------------------------------
# Working with a small numeric vector
# -------------------------------

x <- c(6, 2, 5, NA, 9, 2, NA)          # Numeric vector with missing values
print(x)

# -------------------------------
# Impute missing values using MEAN
# -------------------------------

aq_mean <- impute(x, fun = mean)      # Replace NA with mean
print(aq_mean)

# -------------------------------
# Impute missing values using MEDIAN
# -------------------------------

aq_median <- impute(x, fun = median)  # Replace NA with median
print(aq_median)



# -------------------------------
# Working with dataset columns
# -------------------------------

dat <- read.csv("missing.csv")        # Read dataset
print(dat)

# Output
# srno  Name Salary Department
#    1  Rick   6000         IT
#    2   Dan     NA         HR
#    3   Eva   7600    Account
#    4  Gary   8500         HR
#   NA  John   9200         IT
#    6  Rock   6700    Account
#    7  Brad   5900         IT
#    8 Simon     NA    Finance


# -------------------------------
# Impute missing values in 'srno' column
# -------------------------------

srno_imputed <- impute(dat$srno, fun = mean)  # Mean imputation
print(srno_imputed)

# -------------------------------
# Impute missing values in 'Salary' column
# -------------------------------

salary_imputed <- impute(dat$Salary, fun = median)  # Median imputation
print(salary_imputed)


# -------------------------------
# Checking NA values in dataset
# -------------------------------

is.na(dat)                            # Shows TRUE/FALSE for NA values

# -------------------------------
# Checking complete cases (column-wise)
# -------------------------------

complete.cases(dat$srno)              # TRUE if value is not NA
complete.cases(dat$Salary)

# -------------------------------
# Dealing with categorical (factor) data
# -------------------------------

gender <- c("male", "female", "female")  # Character vector
gender_factor <- factor(gender)          # Convert to factor
print(gender_factor)


# -------------------------------
# Ordered categorical data
# -------------------------------

z <- c("low", "low", "high", "medium", "high")

# Explicit level ordering
z_factor <- factor(z, levels = c("low", "medium", "high"))  # <-- ADDED clarity
print(z_factor)