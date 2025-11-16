# dealing with missing values
install.packages("Hmisc")               # installing package to deal with missing values
library("Hmisc")                        # after installing must set the installed package into library

# example of missing values and how to deal with
a <- c(2, 3, NA, 4, 1, 2, NA)
a

mean(a)                                 # it will give you N/A since you haven't handled the missing values
median(a)

a[!is.na(a)]                            # simply skips the N/A values

mean(a[!is.na(a)])                      # now it will produce the result
median(a[!is.na(a)])
sd(a[!is.na(a)])

# getting current working directory
getwd()

# reading csv files
# create a file in above directory
data <- read.csv('fileName.csv')
data

# reading excell file using "readxl" package
install.packages("readxl")
library(readxl)
var <- read_excel("newExcell.xlsx")
var

# reading and write excell file using "XLConnect" package
install.packages("XLConnect")
library(XLConnect)


dd <- XLConnect::readWorksheetFromFile("newExcell.xlsx", sheet = 1)                             # reading xlsx file
dd

# creating and converting data frame into excell file
# create dataframe in R
empid <- c(11, 22,33,44)
empname <- c("aa", "bb", "cc", "dd")
df <- data.frame(empid, empname)
df

# write into file
fy <- XLConnect::writeWorksheetToFile("one.xlsx", df, sheet = "About")                          # create and write into file
fy                                   # stores name of the file


# dealing with inbuild csv files
# we already have many csv files present in R

mcar <- mtcars                       # mtcars is inbuild csv file which has cars info
mcar

# printing first 5 to 6 rows of mtcars
head(mcar)

# printing last 5 rows 
tail(mcar)

# printing some specific rows of columns
mdat <- mcar[1:6, 1:5]               # [rows, cols]
mdat


# dplyr package
# The dplyr package offers data manipulation functions.
install.packages("dplyr")
library(dplyr)


# adding one new column
mdat$new_hp <- mdat$hp*0.5          # creating new column in mdat and storing values
mdat
colnames(mdat)
