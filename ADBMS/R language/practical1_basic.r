# creating varible
a <- 5
b <- "Hello"
c <- TRUE
# printing on console
a
b
c
print("College")
print(a)


# Basic R command

# creating list
list1 <- list("mango", "apple", "grapes", "kiwi")
list1

# accessing the perticular item of list
list1[2]

# excluding specific item of list
list1[-2]


# length of list
length(list1)

# append list
append(list1, "orange")

# appending after specific item
append(list1, "watermelon", after = 3)

# subset of list
list1[2:4]


# concatenate list
list2 <- list("aa", "bb", "cc", "dd")
list5 <- c(list1, list2)
list5

# for loop
for (x in list1) {
    print(x)
}


# list repition
list_rep <- rep(c(1,2,3), 3)
list_rep
# [1] 1 2 3 1 2 3 1 2 3

list_rep <- rep(c(1,2,3), times=3)
list_rep
# [1] 1 2 3 1 2 3 1 2 3

list_rep <- rep(c(1,2,3), each=3)
list_rep
# [1] 1 1 1 2 2 2 3 3 3

list_rep <- rep(c(1,2,3), times=c(3,4,1))
list_rep
# [1] 1 1 1 2 2 2 2 3


# sequence 
num_seq <- seq(from=0, to=50)
num_seq


# with 5 difference
num_rand <- seq(from=0, to=50, by=5)
num_rand


# vector
num_ar <- c(1:20)
num_ar

# array
# dim = c(3, 2, 3) --> (3rows, 2cols, 3arrays)
m_arr <- array(num_ar, dim = c(3, 2, 3))
m_arr

# accessing specific elements of array
m_arr[3,2,2]                                          # [rowa, column, array]
m_arr[2,1,3]
m_arr[1,2,1]


# data frame
empid <- c(11, 12, 13, 14, 15)
empname <- c("aa", "bb", "cc", "dd", "ee")
datf <- data.frame(empid, empname)                    # creates a table with two column empid & empname
datf

datf$empid                                            # displays empid column
datf$empname                                          # displays empname column

nrow(datf)                                            # shows count of row
ncol(datf)                                            # shows count of row
names(datf)                                           # shows solumn name


# alter column name
names(datf)[1] <- "std_id"                            # rename first column name
datf


# adding row in dataframe using rbind
stdf <- rbind(datf, c(16, "ff"))
stdf

# adding column
stdf_n <- cbind(stdf, marks=c(11, 22, 33, 44, 55, 66))
stdf_n


# if else
a <- 10
b <- 20
if(b > a){
print("b is greater")
} else if (a > b) {
print("a is greater")
}


# while loop
a <- 1
while (a < 10) {
print(a)
a <- a+1
}

# for loop
months <- list("jan", "feb", "mar", "apr")
for(x in months){
if(x == "mar"){
break
}
print(x)
}

for(x in months){
if(x == "mar"){
next
}
print(x)
}


# matrix
matrix1 <- matrix(c(1,2,3,4,5,6,7,8,9), nrow = 3, ncol = 3)
matrix1

matrix2 <- matrix(c(11,12,13,14,15,16,17,18,19), nrow = 3, ncol = 3)
matrix2

matrix1+matrix2
matrix1-matrix2
matrix1*matrix2
matrix1/matrix2
t(matrix1)                                                # transpose of matrix


# converting data/matrix into table
data <- matrix(c(1:16), nrow = 4, ncol = 4)
data

tdata <- as.table(data)
tdata

# changing column name
colnames(data) <- c('c1', 'c2', 'c3', 'c4') 
data

# changing row name
rownames(data) <- c('r1', 'r2', 'r3', 'r4')
data

# converting data/matrix into table
tdata <- as.table(data)
tdata


# output in gui
plot(1:8)                       # ploting circle instead of line
plot(1:8, col="red")            # changing the colour
plot(2:10, col="red")

x <- c(2, 3, 5, 6)
y <- c(1, 6, 4, 8)
plot(x, y)
plot(1:8, type = "l")         # ploting line 

# xlab = "name of s axis" ylab = "name of yaxis" main = "name of the graph"
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red")
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l")                # type = "l" means line and lwd is line width
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l", lwd=2)

# lines types
# 2--> dashed line
# 3--> dotted line
# 4--> dot dashed line
# 5--> long dashed line
# 6--> two dashed line

plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l", lwd=2, lty=1)
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l", lwd=2, lty=2)
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l", lwd=2, lty=3)
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l", lwd=2, lty=4)
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l", lwd=2, lty=5)
plot(2:10, main = "my graph", xlab = "xaxis", ylab = "yaxis", col="red", type = "l", lwd=2, lty=6)


# pie chart
x <- c(30, 30, 40)
pie(x)

# label
lbl <- c("maths", "science", "social studies")
pie(x, labels = lbl)
pie(x, labels = lbl, main = "subjects")

# colors
colors <- c("blue", "yellow", "green")
pie(x, labels = lbl, main = "subjects", col = colors)

# bar plot
x <- c(2, 3, 5, 6)
y <- c(1, 6, 4, 8)
barplot(y, names.arg = x)
barplot(y, names.arg = x, col = "red")                                # col set color
barplot(y, names.arg = x, col = "red", width = c(2, 4, 6, 8))         # width set width


# Managing Objects
objects()        # shows created objects
data()           # list built-in datasets
rm(x)            # remove object named x
rm(list=ls())    # remove all objects from environment or user defined objects
